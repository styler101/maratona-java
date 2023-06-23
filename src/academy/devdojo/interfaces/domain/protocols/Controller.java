package academy.devdojo.interfaces.domain.protocols;
// Atributos de uma interface por padrão são constantes
public interface Controller {
  public static final int MAX_DATA_SIZE = 30;

  default void showControllerValue(){
    System.out.println(MAX_DATA_SIZE);
  }
}
