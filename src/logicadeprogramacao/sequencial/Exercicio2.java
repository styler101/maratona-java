package logicadeprogramacao.sequencial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try{
      System.out.println("Enter with a number");
      int value = scanner.nextInt();
      if(value < 0){
        value = value * -1;
      }
      System.out.println("O valor informado foi : " + value);
    }catch(InputMismatchException e ){
      System.out.println("Só é permitido números ");
    }
    scanner.close();
  }
}
