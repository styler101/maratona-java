package logicadeprogramacao.sequencial;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Informe um número ");
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      int d = scanner.nextInt();
      System.out.println(isValidNumber(a) ? showResult("A é divísel por 2 e 3 ") : showResult("A não é divísivel por 2 e 3 "));
      System.out.println(isValidNumber(b) ? showResult("B é divísel por 2 e 3 ") : showResult("B é não divísivel por 2 e 3 "));
      System.out.println(isValidNumber(c) ? showResult("C é divísel por 2 e 3 ") : showResult("C é não divísivel por 2 e 3 "));
      System.out.println(isValidNumber(d) ? showResult("D é divísel por 2 e 3 ") : showResult("D é não divísivel por 2 e 3 "));
      scanner.close();
    };
    private static boolean isValidNumber(int value){
      return value % 2 == 0 && value % 3 == 0;
    }
    private static String showResult(String message){
      return message;
    }

}
