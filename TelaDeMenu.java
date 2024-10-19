import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaDeMenu extends JFrame {
     private final JMenu cadastroMenu;
     private final JLabel lblnomeDaTela;
     private final JMenuBar menuBar;
     private final JMenuItem novoItem;
     private final JMenuItem pesquisarItem;
     private final JMenuItem atualizarItem;
     private final JMenuItem removerItem;

     public TelaDeMenu() {
        super("Tela de Menu");

        cadastroMenu = new JMenu("cadastro");
        lblnomeDaTela = new JLabel("Tela de Menu");
        menuBar = new JMenuBar();

        novoItem = new JMenuItem("Novo");
        pesquisarItem = new JMenuItem("Pesquisar");
        atualizarItem = new JMenuItem("Atualizar");
        removerItem = new JMenuItem("Remover");

        cadastroMenu.add(novoItem);
        cadastroMenu.add(pesquisarItem);
        cadastroMenu.add(atualizarItem);
        cadastroMenu.add(removerItem);

        menuBar.add(cadastroMenu);

        setJMenuBar(menuBar);

        add(lblnomeDaTela, BorderLayout.CENTER);

        novoItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    JOptionPane.showMessageDialog(null, "Você clicou no menu: "+ event.getActionCommand());
                }
            }
        );

        pesquisarItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    JOptionPane.showMessageDialog(null, "Você clicou no menu: "+ event.getActionCommand());
                }
            }
        );

        atualizarItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    JOptionPane.showMessageDialog(null, "Você clicou no menu: "+ event.getActionCommand());
                }
            }
        );

        removerItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event){
                    JOptionPane.showMessageDialog(null, "Você clicou no menu: "+ event.getActionCommand());
                    
                }
            }
        );
     }

     public static void main(String[] args) {
        TelaDeMenu appTelaDeMenu = new TelaDeMenu();
        appTelaDeMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appTelaDeMenu.setSize(200,100);
        appTelaDeMenu.setVisible(true);

     }
}