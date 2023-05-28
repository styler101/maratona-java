package logicadeprogramacao.estrutural;

import java.util.Scanner;
// Sistema de conversão de dolar para real.
public class Exercicio11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o valor da cotação em dolar");
    double cotacao = scanner.nextDouble();
    System.out.println("Informe a quantia que deseja converter");
    double dollar = scanner.nextDouble();
    double result = cotacao * dollar;
    System.out.println("Valor da cotação: " + cotacao);
    System.out.println("Valor informação em dollares: " + dollar);
    System.out.println("Reais disponiveis : " +  result);
  }
}
