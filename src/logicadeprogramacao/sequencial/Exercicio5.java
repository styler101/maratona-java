package logicadeprogramacao.sequencial;

import java.util.Scanner;
// Ler três números apresentados pelas variáveis A, B ,C
// Realizar a equação completa de segundo grau b² - 4.a.c
public class Exercicio5 {
    public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Delta Equasion");
      System.out.println("Enter with A value");
      double a = scanner.nextDouble();
      System.out.println("Enter with B value");
      double b = scanner.nextDouble();
      System.out.println("Enter with C value");
      double c = scanner.nextDouble();
      double delta = Math.pow(b, 2) - (4 * a * c);
      System.out.println("Delta:" + delta);

      scanner.close();
    }
}
