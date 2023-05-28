package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com um número inteiro para a variável A");
    int a = scanner.nextInt();
    System.out.println("Entre com um número inteiro para a variável B");
    int b = scanner.nextInt();
    System.out.println("Entre com um número inteiro para a variável C");
    int c = scanner.nextInt();
    int result = (int) Math.pow((a + b + c),2);
    System.out.println("Resultado: " + result);


    scanner.close();
  }
}
