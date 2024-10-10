import javax.swing.*; //biblioteca

public class MultipleSelectionTest //cria a classe (MultipleSelectionTest)
{
   public static void main(String[] args) //metodo
   { 
      MultipleSelectionFrame multipleSelectionFrame = 
         new MultipleSelectionFrame(); //cria a variavel (multipleSelectionFrame) e atribui um obj
      multipleSelectionFrame.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE);// finaliza o programa ao fechar a janela
      multipleSelectionFrame.setSize(700, 150); //parametros de tamanho da janela
      multipleSelectionFrame.setVisible(true); //faz a janela ficar visivel
   } 
} 
