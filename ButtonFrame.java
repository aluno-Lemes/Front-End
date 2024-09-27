import java.awt.FlowLayout; //responsavel pela dinamica da tela
import java.awt.event.ActionEvent; //responsavel pela ações do botão
import java.awt.event.ActionListener; // responçavel por capturar as ações da tela
import javax.swing.Icon; //fornece a estrutura para seleção de imagem
import javax.swing.ImageIcon; // importa imagem 
import javax.swing.JButton; // importa a funcionalidade do botão
import javax.swing.JFrame; //fornece a estrutura da janela
import javax.swing.JOptionPane; //gera a janela de resposta 

public class ButtonFrame extends JFrame //(Buttonframe) esta herdando (JFrame)
{
   private final JButton plainJButton; // botão com texto
   private final JButton fancyJButton; // botão com icone

   // (ButtonFrame) adiciona (JButtons) a (JFrame)
   public ButtonFrame()
   {
      super("Testing Buttons"); //define o titulo da janela
      setLayout(new FlowLayout()); 

      plainJButton = new JButton("Plain Button"); // botão com texto
      add(plainJButton); // adiciona (plainJbutton) a (JButton)

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif")); // imagem 1
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif")); // imagem 2
      fancyJButton = new JButton("Fancy Button", bug1); // adiciona a imagem 1 a (fancyJButton)
      fancyJButton.setRolloverIcon(bug2); // altera a imagem com o cursor
      add(fancyJButton); // adiciona (fancyJButton) a (JFrame)

      ButtonHandler handler = new ButtonHandler(); //declara a variavel (handler) como (ButtonHandler)
      fancyJButton.addActionListener(handler); // deixa (fancyJButton) operavel
      plainJButton.addActionListener(handler); // deixa (plainJButton) operavel
   }

   private class ButtonHandler implements ActionListener //injeta (ActionListener) a classe (ButtonHandler)
   {
      @Override //sobrescreve os codigos abaixo
      public void actionPerformed(ActionEvent event) //gera os eventos da janela
      {
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format( //gera a janela de resposta
            "You pressed: %s", event.getActionCommand())); // retorna a frase "You pressed: (texto do botão acionado)"
      }
   } 
} // finaliza a classe ButtonFrame

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
