package academy.devdojo.enumeration.application;

import academy.devdojo.enumeration.dominio.Cliente;
import academy.devdojo.enumeration.enums.TipoCliente;
import academy.devdojo.enumeration.enums.TipoPagamento;

public class Main {

  public static void main(String[]args){
    Cliente cliente = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
    Cliente cliente2 = new Cliente("Fernanda", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

    TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("PESSOA FISÍCA");
    System.out.println(tipoCliente);

  }

}
