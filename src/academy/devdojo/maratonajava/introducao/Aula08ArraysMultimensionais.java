package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

// Arrays Multidimensionais Matrizes
public class Aula08ArraysMultimensionais {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[][] vect = new int[3][3]; // Quanto trabalhamos com matrizes no java só precisamos informar o valor inicial da matriz
      vect[0][0] = 10;
      vect[0][1] = 20;
      vect[0][2] = 30;

      vect[1][0] = 40;
      vect[1][1] = 50;
      vect[1][2] = 60;

      vect[2][0] = 70;
      vect[2][1] = 80;
      vect[2][2] = 90;

      for(int i = 0; i < vect.length; i++){
        for(int j = 0; j < vect[i].length; j++){
          System.out.println(vect[i][j]);
        }
      }

      for(int[] vectBase: vect){ // Variável temporário para alocar a posição do array.
         for(int item:vectBase){
           System.out.println(item);
         }
      }

  }
}
