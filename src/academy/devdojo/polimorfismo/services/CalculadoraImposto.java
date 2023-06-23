package academy.devdojo.polimorfismo.services;

import academy.devdojo.polimorfismo.dominio.Produto;


public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
      System.out.println("Relatório de imposto do computador");
      double imposto = produto.calcularImposto();
      System.out.println("Nome do computador: " + produto.getNome());
      System.out.println("Valor do computador: "+ produto.getValor());
      System.out.println("Imposto a ser pago: " + imposto);
    }





}
