package academy.devdojo.testes.implementation;

import academy.devdojo.testes.enums.ProdutoStatus;

public interface ProdutoImplementation {
  public void setName(String name);
  public String getName();
  public void setDouble(double price);
  public double getDouble();
  public ProdutoStatus getStatus(ProdutoStatus status);

  public void setStatus(ProdutoStatus status);

}
