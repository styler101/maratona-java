package logicadeprogramacao.estrutural;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
  // Realiza a calcúlo de do volume de uma lata de óleo
  private static final double pi = 3.14159;
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    try{


    System.out.println("Informe o valor do raio");
    double r = scanner.nextDouble();
    System.out.println("Informe o valor da altura");
    double h = scanner.nextDouble();
    double result = getVolume(r, h);
    System.out.println("Resultado: " + String.format("%.2f", result));
    }catch (InputMismatchException e ){
      System.out.println("Ocorreu um erro ao inserir o valor, por favor utilize ',' no lugar de '.' Exemplo: 9,3");
    }finally {
      scanner.close();

    }
  }

  private static double getVolume(double thunder, double height){
    return pi * Math.pow(thunder, 2) * height;
  }
}
