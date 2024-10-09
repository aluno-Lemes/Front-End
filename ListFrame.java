/*precisa ser corrigido,
a ideia é criar uma nova barra de seleção
que altera o tamanho da janela entre
(pequeno, medio e grande) */





import java.awt.*;//invoca as bibliotecas
import javax.swing.*;
import javax.swing.event.*;

public class ListFrame extends JFrame //cria a classe (ListFrame) herdando (JFrame)
{
   private final JList<String> colorJList; //chama a array (colorJList)
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
      "Orange", "Pink", "Red", "White", "Yellow"};//cria a array (colorNames) que armazena o nomes dos itens
   private static final Color[] colors = {Color.BLACK, Color.BLUE,
      Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, 
      Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
      Color.RED, Color.WHITE, Color.YELLOW};//cria a array (colors) que armazena as cores dos itens

      private final JList<String> sizeJList; //chama a array (colorJList)
   private static final String[] sizeName = {"small", "medium", "big"};//cria a array (colorNames) que armazena o nomes dos itens
   private static final long  [] size = {listFrame.setSize(350, 150), listFrame.setSize(550, 350),
      listFrame.setSize(850, 650)};//cria a array (colors) que armazena as cores dos itens


   // construtor (ListFrame)  adiciona (JScrollPane) contendo (JList) a (JFrame)
   public ListFrame() //metodo
   {
      super("List Test");//gera o titulo da janela
      setLayout(new FlowLayout()); 

      colorJList = new JList<String>(colorNames); // chama a array de nomes
      colorJList.setVisibleRowCount(5); // permite 5 barras de texto visiveis
      
      colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //permite uma seleção por vez

      
      add(new JScrollPane(colorJList)); // adiciona (JScrollPane) contendo (JList) ao frame

      colorJList.addListSelectionListener(
         new ListSelectionListener() //adiciona um (listener) ao codigo
      );
      
//-----------//----------///----------//----------///----------//---------//

      sizeJList = new JList<String>(sizeName); // chama a array de nomes
      sizeJList.setVisibleRowCount(3); // permite 5 barras de texto visiveis
      
      sizeJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //permite uma seleção por vez

      
      add(new JScrollPane(sizeJList)); // adiciona (JScrollPane) contendo (JList) ao frame

      colorJList.addListSelectionListener(
         new ListSelectionListener()
         
         {   
            @Override //sobreescreve 
            public void valueChanged(ListSelectionEvent event)
            {
               getContentPane().setBackground(
                  colors[sizeJList.getSelectedIndex()]);//altera as cores do fundo de acordo com a escolha das array's
            } 
         } 
      ); 
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
