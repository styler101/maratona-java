package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o valor inteiro para a variável A");
    int a = scanner.nextInt();
    System.out.println("Informe o valor inteiro para a variável B");
    int b = scanner.nextInt();
    System.out.println("Informe o valor inteiro para a variável C");
    int c = scanner.nextInt();
    System.out.println("Informe o valor inteiro para variável D");
    int d = scanner.nextInt();
    int p =  a + c;
    int s = b + d;
    System.out.println("Produto P :" +p);
    System.out.println("Produto S :" + s);


    scanner.close();
  }
}
