package academy.devdojo.enumeration.implementation;

import academy.devdojo.enumeration.dominio.enums.TipoCliente;

public interface ClienteImplementation {

  public String getNome();
  public void setNome(String nome);

  public TipoCliente getTipo();

  public void setTipo(TipoCliente tipo);
}
