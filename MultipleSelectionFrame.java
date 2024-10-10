import java.awt.*; // importa as bibliotecas
import java.awt.event.*;
import javax.swing.*;

public class MultipleSelectionFrame extends JFrame //cria a classe (MultipleSelectionFrame) herdando (JFrame)
{
   private final JList<String> colorJList; // lista que armazena o nome das cores
   private final JList<String> copyJList; // lista que armazena as cores copiadas
   private JButton copyJButton; // botão para copiar as cores selecionadas
   private static final String[] colorNames = {"preto", "azul", "Ciano",
      "cinza escuro", "cinza", "verde", "cinza claro", "Magenta", "laranja", 
      "rosa", "vermelho", "branco", "amarelo"};

      private final JList<String> fruitJList; // lista que armazena o nome das frutas
   private final JList<String> cloneJList; // lista que armazena as frutas copiadas
   private JButton cloneJButton; // botão para copiar as frutas selecionadas
   private static final String[] fruitNames = {"manga", "uva", "banana",
      "maçã", "laranja", "pera", "melão", "melancia", "lixia", 
      "coco", "mamão", "abacaxi", "pessego"};

   //  construtor (MultipleSelectionFrame)
   public MultipleSelectionFrame()
   {
      super("Multiple Selection Lists"); // titulo da janela
      setLayout(new FlowLayout());

      colorJList = new JList<String>(colorNames); // lista com o nome das cores
      colorJList.setVisibleRowCount(5); // mostra 5 linhas
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // possibilita mais de uma escolha por vez
      add(new JScrollPane(colorJList)); // adiciona uma lista com (JScrollPane)

      copyJButton = new JButton("Copy >>>"); 
      copyJButton.addActionListener(
         new ActionListener() // cria o botão "Copy" 
         {  
            
            @Override // sobreescreve o metodo abaixo
            public void actionPerformed(ActionEvent event)
            {
               // adiciona os vetores selecionados em (copylist)
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton); // adiciona o botão "copy" a (JFrame)

      copyJList = new JList<String>(); // lista com o nome das cores
      copyJList.setVisibleRowCount(5); // mostra 5 linhas
      copyJList.setFixedCellWidth(100); // define o comprimento
      copyJList.setFixedCellHeight(15); // define a altura
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION); // possibilita uma escolha por vez 
      add(new JScrollPane(copyJList)); // adiciona uma lista com (JScrollPane)


      //----//----//----//----//----//----//----//----//----//----//----//

      setLayout(new FlowLayout());

      fruitJList = new JList<String>(fruitNames); // lista com o nome das frutas
      fruitJList.setVisibleRowCount(5); // mostra 5 linhas
      fruitJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // possibilita mais de uma escolha por vez
      add(new JScrollPane(fruitJList)); // adiciona uma lista com (JScrollPane)


      cloneJButton = new JButton("clone >>>"); 
      cloneJButton.addActionListener(
         new ActionListener() // cria o botão "Copy" 
         {  
           
            @Override// sobreescreve o metodo abaixo
            public void actionPerformed(ActionEvent event)
            {
               // adiciona os vetores selecionados em (clonelist)
               cloneJList.setListData(
                  fruitJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(cloneJButton); // adiciona o botão "copy" a (JFrame)

      cloneJList = new JList<String>(); // lista com o nome das frutas
      cloneJList.setVisibleRowCount(5); // mostra 5 linhas
      cloneJList.setFixedCellWidth(100); // define o comprimento
      cloneJList.setFixedCellHeight(15); // define a altura
      cloneJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION); // possibilita uma escolha por vez 
      add(new JScrollPane(cloneJList)); // adiciona uma lista com (JScrollPane)

   } 
   
} // finaliza a classe (MultipleSelectionFrame)

