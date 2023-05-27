package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio6 {
  // Exercicio troca de valores
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o valor da variável A");
    int a = scanner.nextInt();
    int c = a;
    System.out.println("Informe o valor da variável B");
    int b = scanner.nextInt();

    a = b;
    b =c;
    System.out.println("Valor da variável A: "+ a);
    System.out.println("Valor da variável B: "+ b);
    scanner.close();
  }
}
