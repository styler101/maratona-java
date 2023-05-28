package logicadeprogramacao.estrutural;

import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("Informe o valor da cotação em dollars");
      double cotacao = scanner.nextDouble();
      System.out.println("Informe o a quantidades em reais");
      double reais = scanner.nextDouble();
      double result = cotacao * reais;
      System.out.println("Valor da cotação de reais para dollars"+ result);
      System.out.println("Reais disponíveis para o usuário R$: "+ reais );


      scanner.close();
  }
}
