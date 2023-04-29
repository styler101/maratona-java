package academy.devdojo.maratonajava.application;

import java.util.Scanner;

public class Aula04Operadores {

  public static void main(String[] args) {

    double valorTotalContaCorrente = 200;
    double valorTotalContaPoupança = 10000;
    int valorPlaystation = 5000;

    boolean isPlayStation5Compravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupança >= valorPlaystation;
    System.out.println(isPlayStation5Compravel);

  }
}
