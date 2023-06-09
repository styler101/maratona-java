package academy.devdojo.modificadatorfinal.application;

import academy.devdojo.modificadatorfinal.dominio.Carro;
import academy.devdojo.modificadatorfinal.dominio.Comprador;

public class Main {
  public static void main(String[] args){
    Carro carro = new Carro();
    Comprador comprador2 = new Comprador("Lucas Alves");
    carro.getCOMPRADOR().setNome(comprador2.getNome());
    System.out.println(carro);
  }

}
