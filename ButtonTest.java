// Fig. 12.16: ButtonTest.java
// Testing ButtonFrame.
import javax.swing.JFrame;

public class ButtonTest //cria a classe (ButtonTest)
{
   public static void main(String[] args) //cria o metodo (main)
   { 
      ButtonFrame buttonFrame = new ButtonFrame(); //adiciona um novo objeto 
      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      buttonFrame.setSize(275, 110); //define o tamanho da janela
      buttonFrame.setVisible(true); // faz a janela renderizar
   } 
} // end class ButtonTest

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
