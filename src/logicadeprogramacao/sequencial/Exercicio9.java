package logicadeprogramacao.sequencial;

import java.util.Scanner;

public class Exercicio9 {

  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Quantos números você deseja utilizar para executar o programa");
     int quantity = scanner.nextInt();
     int[] values = new int[quantity];
     int lowerNumber = 1;
     int largerNumber = 0 ;
     for(int i = 0; i < values.length; i++){
       System.out.println("Entre com um número");
       values[i] = scanner.nextInt();
       if(largerNumber < values[i]){
         largerNumber = values[i];
       }
       if(lowerNumber > values[i]){
         lowerNumber = values[i];
       }
     }

    System.out.println("Maior número : " + largerNumber);
    System.out.println("Menor número: " + lowerNumber);

     scanner.close();
  }
}
