package logicadeprogramacao.estrutural;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio13 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      try{
      System.out.println("Informe um número inteiro para a variável A");
      int a = scanner.nextInt();
      System.out.println("Informe um número inteiro para a variável B");
      int b = scanner.nextInt();
      System.out.println("Informe um número inteiro para a variável C");
      int c = scanner.nextInt();
      int result =  (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
      System.out.println("Resultado : " + result);
      }catch(InputMismatchException e ){
        System.out.println("Não é permite inserir números decímais");
        System.out.println("Encerrando o programa...");
      }finally {
        scanner.close();
      }
  }
}
