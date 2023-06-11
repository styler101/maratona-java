package academy.devdojo.interfaces.domain;

import academy.devdojo.interfaces.domain.protocols.DataLoader;

public class FileLoader implements DataLoader {
  @Override
  public void load() {
    System.out.println("Carregando dados de um arquivo!");
  }
}
