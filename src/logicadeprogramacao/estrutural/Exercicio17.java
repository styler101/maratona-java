package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio17 {
  private static final double pi = 3.14159;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o valor da variável R");
    double r = scanner.nextDouble();
    double a = pi * Math.pow(r, 2);
    System.out.println("Altura: " + String.format("%.2f", a));



    scanner.close();
  }

}
