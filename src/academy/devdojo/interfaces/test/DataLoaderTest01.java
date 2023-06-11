package academy.devdojo.interfaces.test;

import academy.devdojo.interfaces.domain.DataBaseLoader;
import academy.devdojo.interfaces.domain.FileLoader;

public class DataLoaderTest01 {

  public static void main(String[]args){
    DataBaseLoader dataBaseLoader = new DataBaseLoader();
    FileLoader fileLoader = new FileLoader();
    dataBaseLoader.load();
    fileLoader.load();
    dataBaseLoader.remove();
  }
}
