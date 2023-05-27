package academy.devdojo.introducaometodos.test;

import academy.devdojo.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
  public static void main(String[] args) {
     Pessoa pessoa = new Pessoa();
     pessoa.setNome("Lucas");
     pessoa.setIdade(-1);
     pessoa.imprime();
  }
}
