package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio9 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     double number = scanner.nextInt();
     double result = Math.pow(number, 2);
     System.out.println(result);
    scanner.close();

  }
}
