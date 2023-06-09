package academy.devdojo.enumeration.application;

import academy.devdojo.enumeration.dominio.Cliente;
import academy.devdojo.enumeration.dominio.enums.TipoCliente;

public class Main {
  public static void main(String[] args){
    Cliente cliente = new Cliente("Lucas", TipoCliente.PESSOA_FISICA);
    Cliente cliente2 = new Cliente("Mateus", TipoCliente.PESSOA_JURIDICA);
  }
}
