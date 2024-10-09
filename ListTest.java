import javax.swing.JFrame;// invoca a biblioteca javax

public class ListTest //cria a classe (ListTest)
{
   public static void main(String[] args)//metodo
   { 
      ListFrame listFrame = new ListFrame(); //cria a variavel (ListFrame) e adiciona um novo obj
      listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra o codigo ao fechar a janela 
      listFrame.setSize(350, 150); //parametros de tamanho da janela
      listFrame.setVisible(true); ///faz a janela ficar visive
   } 
} 

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
