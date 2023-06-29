package academy.devdojo.exceptions.domininio;

import academy.devdojo.exceptions.error.LoginInvalidException;

import java.io.FileNotFoundException;

public class Pessoa {

  public void salvar() throws LoginInvalidException, FileNotFoundException {
    System.out.println("Salvando pessoa");
  }
}
