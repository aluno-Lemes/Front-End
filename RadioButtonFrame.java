// Fig. 12.19: RadioButtonFrame.java
// Creating radio buttons using ButtonGroup and JRadioButton.
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame //cria a classe (RadioButtonFrame) herdando (JFrame)
{
   private JTextField textField; // used to display font changes

   private Font plainFont; 
   private Font boldFont; 
   private Font italicFont; 
   private Font boldItalicFont; 

   private Color blackColor; 
   private Color redColor; 
   private Color blueColor; 
   private Color yellowColor;

   private JRadioButton plainJRadioButton; 
   private JRadioButton boldJRadioButton; 
   private JRadioButton italicJRadioButton; 
   private JRadioButton boldItalicJRadioButton; 

   private JRadioButton blackJRadioButton;
   private JRadioButton redJRadioButton; 
   private JRadioButton blueJRadioButton; 
   private JRadioButton yellowJRadioButton; 

   private ButtonGroup radioGroup; // buttongroup to hold radio buttons
   private ButtonGroup colorRadioGroup;

   //construtor do (RadioButtonFrame) adiciona (JRadioButtons) a (JFrame)
   public RadioButtonFrame() //chama o methodo (RadioButtonFrame)
   {
      super("RadioButton Test"); //atribui um titulo a janela
      setLayout(new FlowLayout()); 

      textField = new JTextField("Watch the font style change", 25);//adiciona (Watch the font style change) a barra de texto
      add(textField); // adiciona (textField) a (JFrame)

      // cria os botões redondos
      plainJRadioButton = new JRadioButton("Plain", true); //botão "Plain"
      boldJRadioButton = new JRadioButton("Bold", false); //botão "Bold"
      italicJRadioButton = new JRadioButton("Italic", false); //botão "Italic"
      boldItalicJRadioButton = new JRadioButton("Bold/Italic", false); //botão "Bold/Italic"
      add(plainJRadioButton); // adiciona botão "Plain" ao JFrame
      add(boldJRadioButton); // adiciona botão "Bold" ao JFrame
      add(italicJRadioButton); // adiciona botão "Italic" ao JFrame
      add(boldItalicJRadioButton); // adiciona botão "Bold/Italic" ao JFrame

      // cria relacionamento logico entre (JRadioButtons)
      radioGroup = new ButtonGroup(); // cria (ButtonGroup)
      radioGroup.add(plainJRadioButton); // adiciona (plain) ao group
      radioGroup.add(boldJRadioButton); // adiciona (bold) ao group
      radioGroup.add(italicJRadioButton); // adiciona (italic) ao group
      radioGroup.add(boldItalicJRadioButton); // adiciona (bold) and (italic)

      // cria os objetos fonte
      plainFont = new Font("Serif", Font.PLAIN, 14); //cria a fonte "Plain" com o tamanho 14
      boldFont = new Font("Serif", Font.BOLD, 14); //cria a fonte "Bold" com o tamanho 14
      italicFont = new Font("Serif", Font.ITALIC, 14); //cria a fonte "Italic" com o tamanho 14
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14); //concatena as fontes "Bold" e "Italic" com o tamanho 14
      textField.setFont(plainFont);

      // registra eventos para (JRadioButtons)
      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont));

         //~~~~/%/~~~~/$/~~~~/#/~~~~/%/~~~~/#/~~~~/$/~~~~/%/~~~~//

      blackJRadioButton = new JRadioButton("Black", true); //botão "black"
      redJRadioButton = new JRadioButton("Red", false); //botão "red"
      blueJRadioButton = new JRadioButton("Blue", false); //botão "blue"
      yellowJRadioButton = new JRadioButton("Yellow", false); //botão "Bold/Italic"
      add(blackJRadioButton); // adiciona botão "black" ao JFrame
      add(redJRadioButton); // adiciona botão "red" ao JFrame
      add(blueJRadioButton); // adiciona botão "blue" ao JFrame
      add(yellowJRadioButton); // adiciona botão "yellow" ao JFrame

      // cria relacionamento logico entre (JRadioButtons)
      colorRadioGroup = new ButtonGroup(); // cria (ButtonGroup)
      colorRadioGroup.add(blackJRadioButton); // adiciona (black) ao group
      colorRadioGroup.add(redJRadioButton); // adiciona (red) ao group
      colorRadioGroup.add(blueJRadioButton); // adiciona (blue) ao group
      colorRadioGroup.add(yellowJRadioButton); // adiciona (yellow) and (italic)

      // cria os objetos cores
      blackColor =  Color.BLACK; //cria a Cor "black"
      redColor =  Color.RED; //cria a Cor "red"
      blueColor =  Color.BLUE; //cria a Cor "blue"
      yellowColor =  Color.YELLOW; //cria a Cor "yellow"

      textField.setForeground(blackColor);

      // registra eventos para (JRadioButtons)
      blackJRadioButton.addItemListener(
         new ColorRadioButtonHandler(blackColor));
      redJRadioButton.addItemListener(
         new ColorRadioButtonHandler(redColor));
      blueJRadioButton.addItemListener(
         new ColorRadioButtonHandler(blueColor));
      yellowJRadioButton.addItemListener(
         new ColorRadioButtonHandler(yellowColor));
   } 

   private class RadioButtonHandler implements ItemListener 
   {
      private Font font; // font associated with this listener

      public RadioButtonHandler(Font f)
      {
         font = f; 
      } 
   
      // handle radio button events
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font); 
      } 
      
   } 
   private class ColorRadioButtonHandler implements ItemListener 
   {
      private Color color; // cores associadas com esse

      public ColorRadioButtonHandler(Color c)
      {
         color = c; 
      } 
   
      // handle radio button events
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setForeground(color);
      } 
      
   } 
} // end class RadioButtonFrame 

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
