package logicadeprogramacao.estrutural;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Enter with a fahrenheit temp");
      double fahrenheit = scanner.nextDouble();
      double c = ((fahrenheit - 32)) * ((double) 5 / 9);
      System.out.println("Temp in fahrenheit: " + fahrenheit);
      System.out.println("Temp in celcius: " + Math.round(c));
    } catch (InputMismatchException e) {
      System.out.println("Utilize , ao invés de .");
      System.out.println("Encerrando o programa...");
    } finally {
      scanner.close();
    }
  }
}
