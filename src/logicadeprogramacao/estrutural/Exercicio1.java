package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio1 {
   public static void main(String[] args){
     // Programa para ler a temperatura em graus Celsius e Fahrenheit
     Scanner scanner = new Scanner(System.in);
     System.out.println("Informe a temparatura em graus Celcius");
     double c = scanner.nextDouble();
     double fahrenheit = (double) (9 * c + 160) /5;
     System.out.println("A temperatura " + c+ " graus celcius convertida em Fahrenheit é " + fahrenheit);
     scanner.close();

   }
}
