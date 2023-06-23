package academy.devdojo.testes.dominio;

import academy.devdojo.testes.enums.ProdutoStatus;
import academy.devdojo.testes.implementation.ProdutoImplementation;

public class Produto implements ProdutoImplementation {
  private String name;
  private double price;

  private ProdutoStatus status;

  public Produto() {
  }

  public Produto(String name, double price, ProdutoStatus status) {
    this.name = name;
    this.price = price;
    this.status = status;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setDouble(double price) {
    this.price = price;
  }

  @Override
  public double getDouble() {
    return price;
  }

  @Override
  public ProdutoStatus getStatus(ProdutoStatus status) {
    return null;
  }

  @Override
  public void setStatus(ProdutoStatus status) {

  }


  @Override
  public String toString() {
    return "Produto{" +
      "name='" + name + '\'' +
      ", price=" + price +
      ", status=" + status.getCurrentStatus() +
      '}';
  }
}
