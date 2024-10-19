import java.sql.*;

public class MySQLConnector {
    public static Connection conectar(){
        String mysqlHost = "127.0.0.1";             
        String mysqlDB = "db_mysql_connector";   
        String mysqlUser = "root";     
        String mysqlPassword = "senac@02";     
        String mysqlPort = "3306";     
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + ":" + mysqlPort + "/" + mysqlDB + "?user=" + mysqlUser + "&password=" + mysqlPassword;
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(mysqlUrl);
            System.out.println("Conexão realizada com Sucesso!");
        } catch (Exception e) {
            System.err.println("Ops! Algo não esta certo com a conexão com o banco de dados MySQL! Mensagem Do Servidor: " + e); 
        }
        return conn;
    }
}