package academy.devdojo.interfaces.domain;

import academy.devdojo.interfaces.domain.protocols.DataLoader;
import academy.devdojo.interfaces.domain.protocols.DataRemover;
// Uma classe pode implementar várias classes
public class DataBaseLoader implements DataLoader,DataRemover {
  @Override
  public void load() {
    System.out.println("Carregando dados do banco de dados");
  }

  @Override
  public void remove() {
    System.out.println("Removendo os dados de um banco de dados");
  }
}
