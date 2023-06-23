package academy.devdojo.enumeration.dominio;

import academy.devdojo.enumeration.enums.TipoCliente;
import academy.devdojo.enumeration.enums.TipoPagamento;

public class Cliente {

  private TipoPagamento tipoPagamento;
  private TipoCliente tipoCliente;

  private String nome;

  public Cliente() {
  }


  public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
    this.nome = nome;
    this.tipoCliente = tipoCliente;
    this.tipoPagamento = tipoPagamento;
  }

  public TipoCliente getTipoCliente() {
    return tipoCliente;
  }

  public void setTipoCliente(TipoCliente tipoCliente) {
    this.tipoCliente = tipoCliente;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public TipoPagamento getTipoPagamento() {
    return tipoPagamento;
  }

  public void setTipoPagamento(TipoPagamento tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  @Override
  public String toString() {
    return "Cliente{" +
      "tipoPagamento=" + tipoPagamento +
      ", tipoCliente=" + tipoCliente.getValor() +
      ", nome='" + nome + '\'' +
      '}';
  }
}
