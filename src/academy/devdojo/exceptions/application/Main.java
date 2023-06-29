package academy.devdojo.exceptions.application;


import academy.devdojo.exceptions.domininio.Pessoa;

import java.io.FileNotFoundException;

public class Main {
  public static void main(String[] args){
    Pessoa pessoa = new Pessoa();
    Pessoa funcionario = new Pessoa();
    try {
      pessoa.salvar();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
    try {
      funcionario.salvar();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
