package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio10 {

   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Entre com o número para variável A");
     double a =  Math.pow(scanner.nextInt(),2);
     System.out.println("Entrea com o número para variável B");
     double b = Math.pow(scanner.nextInt(), 2);
     double diff = a > b ? a - b : b - a;
     System.out.println("Diferença: " + diff);

     scanner.close();
   }
}
