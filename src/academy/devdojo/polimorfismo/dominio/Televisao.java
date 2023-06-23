package academy.devdojo.polimorfismo.dominio;

public class Televisao extends Produto{

  public Televisao(){};

  public Televisao(String nome, double valor){
    super(nome, valor);
  };

  @Override
  public double calcularImposto() {
    return 0;
  }
}
