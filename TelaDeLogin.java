import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class TelaDeLogin extends JFrame{

    private final JLabel lblLogin;
    private final JTextField txtLogin;   
    private final JLabel lblSenha;
    private final JPasswordField txtSenha;
    private final JButton btnLogar;
    private final JLabel lblNotificacoes;
 
    public TelaDeLogin(){

        super("Tela De Login");
        setLayout(new FlowLayout());

        lblLogin = new JLabel("Login:");   //cria o texto "Login:"
        add(lblLogin);   //adiciona (lblLogin) a (JFrame)

        txtLogin = new JTextField(10);   //cria a barra de texto para login
        add(txtLogin);   //adiciona (txtLogin) a (JFrame)

        lblSenha = new JLabel("Senha:");   //cria o texto "Senha:"
        add(lblSenha);   //adiciona (lblSenha) a (JFrame)

        txtSenha = new JPasswordField(10);   //cria a barra de texto para senha
        add(txtSenha);   //adiciona (txtSenha) a (JFrame)

        btnLogar = new JButton("Logar");   //cria o botão "Logar"
        add(btnLogar);  //adiciona (btnLogar) a (JFrame)

        lblNotificacoes = new JLabel("Notificações:"); //cria o texto "Notificações:"
        add(lblNotificacoes); //adiciona (lblNotificacoes) a (JFrame)
    }
    
    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            try{

                Connection conexao = MySQLConnector.conectar();
                String strSqlLogin = "select * from `db_senac`.`tbl_senac` where email = '" + txtLogin.getText() + "' and senha = '" + String.valueOf(txtSenha.getPassword()) + "';";

                Statement stmSqlLogin = conexao.createStatement();

                ResultSet rstSqlLogin = stmSqlLogin.executeQuery(strSqlLogin);
                if (rstSqlLogin.next()) {
                    //aqui vamos notificar o usuario que FOI encontrado o login e senha
                } else {
                    //aqui vamos notificar o usuario que NÃO FOI encontrado o login e senha
                }   

            } catch (Exception e) {
                System.err.println("Ops! deu erro se liga no erro: " + e);
                    //aqui vamos notificar o usuario que NÃO FOI encontrado o login e senha
            }
        }           
    }
    public static void main(String[] args) {
        TelaDeLogin appTelaDeLogin = new TelaDeLogin();
        appTelaDeLogin.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appTelaDeLogin.setSize(150, 200);
        appTelaDeLogin.setVisible(true);
    }
}




   
   