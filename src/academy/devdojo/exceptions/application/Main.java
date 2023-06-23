package academy.devdojo.exceptions.application;

import java.io.File;
import java.io.IOException;

// Execeções checked não são tratadas, execeções uncheckeds são tratadas.
// Execeções filhas de exception precisam ser lançadas.
public class Main {

  public static void main(String[]args){
    try{
    criarNovoArquivo(1);
    criarNovoArquivo(2);
    criarNovoArquivo(3);
    }catch(IOException e ){
      System.out.println("Não foi possível criar o arquivo");
    }finally{

    }

  }

  private static void  criarNovoArquivo(int value) throws IOException {
    File file = new File("arquivo//texto" + value + ".txt");
    file.createNewFile();
    System.out.println("O arquivo foi criado");
  }

}
