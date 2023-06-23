package academy.devdojo.polimorfismo.dominio;

import java.util.Date;

public class Tomate extends Produto{
  private Date dateValidate = new Date();
  private static final double IMPOSTO_POR_CENTO = 0.6;

  public Tomate(String nome, double valor){
    super(nome, valor);
  }

  @Override
  public double calcularImposto() {
    System.out.println("Calculando imposto do tomate");
    return valor * IMPOSTO_POR_CENTO;
  }

  public Date getDateValidate() {
    return dateValidate;
  }

  public void setDateValidate(Date dateValidate) {
    this.dateValidate = dateValidate;
  }
}
