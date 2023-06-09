package logicadeprogramacao.sequencial;

import java.util.Scanner;

// Receber 3 valores inteiros e exibir a ordem distributiva
public class Exercicio7 {

  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter with a number A");
    int a = scanner.nextInt();
    System.out.println("Enter with a number B");
    int b = scanner.nextInt();
    System.out.println("Enter with a number C");
    int c = scanner.nextInt();
    String result;


    if( a > b && a > c){
      result = validateConditional(b,c) ? showResult(a,b,c) : showResult(a,c,b);
    }else if(validateConditional(b,c)){
     result = validateConditional(c,a) ? showResult(b,c,a) : showResult(b,a,c);
    }else{
      result = validateConditional(a,b) ? showResult(c,a,b) : showResult(c,b,a);
    }

    System.out.println("Resultado :"  + result);
    scanner.close();
  }

  private static boolean validateConditional(int x, int y){
     return x  > y;
  }

  private static String showResult(int x, int y , int z){
    return x + "," + y  + "," + z;
  }

}
