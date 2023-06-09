package academy.devdojo.enumeration.dominio;

import academy.devdojo.enumeration.dominio.enums.Payment;
import academy.devdojo.enumeration.dominio.enums.TipoCliente;
import academy.devdojo.enumeration.implementation.ClienteImplementation;

public class Cliente implements ClienteImplementation {
  private String nome;
  private TipoCliente tipo;

  private Payment pagamento;
  public Cliente() {
  }

  public Cliente(String nome, TipoCliente tipo) {
    this.nome = nome;
    this.tipo = tipo;
    System.out.println("Pessoa Cadastrada com sucesso!");

  }

  @Override
  public String getNome() {
    return nome;
  }
  @Override
  public void setNome(String nome) {
    this.nome = nome;
  }
  @Override
  public TipoCliente getTipo() {
    return tipo;
  }
  @Override
  public void setTipo(TipoCliente tipo) {
    this.tipo = tipo;
  }
}
