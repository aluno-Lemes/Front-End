//invoca as bibliotecas
import java.awt.*;    
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxFrame extends JFrame //cria a classe (ComboBoxFrame) herdando (JFrame)
{
   private final JComboBox<String> imagesJComboBox; // armazena os icones 
   private final JLabel label; // mostra os icones selecionados

   private static final String[] names = //cria uma array (names) que segura os nomes dos icones
      {"bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif"};
   private final Icon[] icons = {  // cria uma array (icons) que segura as imagens dos icones
      new ImageIcon(getClass().getResource(names[0])),
      new ImageIcon(getClass().getResource(names[1])), 
      new ImageIcon(getClass().getResource(names[2])),
      new ImageIcon(getClass().getResource(names[3]))};

   //construtor (ComboBoxFrame) adiciona (JComboBox) ao (JFrame)
   public ComboBoxFrame()
   {
      super("Testing JComboBox"); // gera o titulo da janela
      setLayout(new FlowLayout());      

      imagesJComboBox = new JComboBox<String>(names); // cria a barra expansivel com os items da array (names)
      imagesJComboBox.setMaximumRowCount(3); // limita a 3 o numero de linhas exibidas para seleção

      imagesJComboBox.addItemListener(
         new ItemListener() // cria um listener 
         {
            // reagem com os eventos do (JComboBox) 
            @Override
            public void itemStateChanged(ItemEvent event)
            {
               // disponibiliza o icone selecionada
               if (event.getStateChange() == ItemEvent.SELECTED)
                  label.setIcon(icons[
                     imagesJComboBox.getSelectedIndex()]);
            } 
         } 
      ); 

      add(imagesJComboBox); // adiciona (combobox) a (JFrame)
      label = new JLabel(icons[0]); // mostra o primeiro icone
      add(label); 
   }
} // finaliza a classe (ComboBoxFrame)


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
