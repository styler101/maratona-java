package academy.devdojo.maratona.core.introducaoclasses.test;

import academy.devdojo.maratona.core.introducaoclasses.domain.Carro;

public class CarroTest1 {

  public static void main(String[] args) {
     Carro carro1 = new Carro();
     carro1.nome = "Fiat";
     carro1.modelo = "Uno";
     carro1.ano = 2004;

     Carro carro2 = new Carro();
     carro2.nome = "Chevrolet";
     carro2.modelo = "Onix";
     carro2.ano = 2020;

     carro1 = carro2;
     System.out.println("Informações do carro 1");
     System.out.println("Nome : " + carro1.nome);
     System.out.println("Modelo : " + carro1.modelo);
     System.out.println("Ano : " + carro1.ano);

    System.out.println("Informações do carro 2");
    System.out.println("Nome : " + carro2.nome);
    System.out.println("Modelo : " + carro2.modelo);
    System.out.println("Ano : " + carro2.ano);
  }
}
