package academy.devdojo.polimorfismo.application;

import academy.devdojo.polimorfismo.dominio.Produto;
import academy.devdojo.polimorfismo.dominio.Tomate;


import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Tomate tomate = new Tomate("Tomate vegano", 20);
    tomate.calcularImposto();

  }
}
