// Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame
/*tudo que estiver dentro do bloco abaixo vem de JFrame 
tudo que estiver private é exclusivo de TextFieldFrame*/
{
   private final JTextField textField1; // text field with set size
   private final JTextField textField2; // text field with text
   private final JTextField textField3; // text field with text and size
   private final JPasswordField passwordField; // password field with text

   /* TextFieldFrame constructor adds JTextFields to JFrame
   onde estiver public pode ser exportado*/
   public TextFieldFrame()
   {
      super("Testing JTextField and JPasswordField");
      setLayout(new FlowLayout());

      // construct textfield with 10 columns
      textField1 = new JTextField(10); 
      add(textField1); // add textField1 to JFrame

      // construct textfield with default text
      textField2 = new JTextField("Enter text here");
      add(textField2); // add textField2 to JFrame

      // construct textfield with default text and 21 columns
      textField3 = new JTextField("Uneditable text field", 21);
      textField3.setEditable(false); // disable editing
      add(textField3); // add textField3 to JFrame

      // construct passwordfield with default text
      passwordField = new JPasswordField("Java");
      add(passwordField); // add passwordField to JFrame

      // register event handlers
      TextFieldHandler handler = new TextFieldHandler();
      textField1.addActionListener(handler);
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } // end TextFieldFrame constructor

   // private inner class for event handling
   private class TextFieldHandler implements ActionListener 
   {
      // process textfield events
      @Override //sobrescreve tudo que esta no bloco de codigo
      public void actionPerformed(ActionEvent event)
      { 
         String string = ""; 
         // user pressed Enter in JTextField textField1
         if (event.getSource() == textField1) //compara se getSource é igual a textField1
            string = String.format("textField1: %s", // se verdadeiro executa essa linha de codigo / .format formata o txt
               event.getActionCommand());

         // user pressed Enter in JTextField textField2
         else if (event.getSource() == textField2) //compara se getSource é igual a textField2
            string = String.format("textField2: %s", //printa o que esta no textField2
               event.getActionCommand());

         // user pressed Enter in JTextField textField3
         else if (event.getSource() == textField3) //compara se getSource é igual a textField3
            string = String.format("textField3: %s", //printa o que esta no textField3
               event.getActionCommand());

         // user pressed Enter in JTextField passwordField
         else if (event.getSource() == passwordField) //compara se getSource é igual a passwordField
            string = String.format("passwordField: %s", //printa o que esta no passwordField
               event.getActionCommand());

         // display JTextField content
         JOptionPane.showMessageDialog(null, string); 
      } 
   } // end private inner class TextFieldHandler
} // end class TextFieldFrame

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
