package academy.devdojo.heranca.test;

import academy.devdojo.heranca.dominio.Endereco;
import academy.devdojo.heranca.dominio.Funcionario;
import academy.devdojo.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
      Endereco endereco = new Endereco("Rua X", "393939390-91");
      Pessoa pessoa = new Pessoa("Lucas", "XXX.XXX.XX-XX", endereco);
      Funcionario gerente = new Funcionario("Jorge", "XXX.XXX.XXX-XX", endereco,3010L);
      gerente.relatorioPagamento();
    }
}
