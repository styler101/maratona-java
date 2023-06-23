package academy.devdojo.testes.application;

import academy.devdojo.testes.dominio.Produto;
import academy.devdojo.testes.enums.ProdutoStatus;

public class Main {
    public static void main(String[] args) {
      Produto produto = new Produto("Xbox", 2000.00, ProdutoStatus.ACTIVE);
      System.out.println(produto.toString());
    }
}
