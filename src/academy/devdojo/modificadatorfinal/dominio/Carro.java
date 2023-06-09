package academy.devdojo.modificadatorfinal.dominio;

public class Carro {
  private String nome;
  public static final double VELOCIDADE_LIMITE = 250;
  private final Comprador COMPRADOR = new Comprador("Lucas");
  public Carro(){}

  public Carro(String nome){
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Comprador getCOMPRADOR() {
    return COMPRADOR;
  }

  @Override
  public String toString() {
    return "Carro{" +
      "nome='" + nome + '\'' +
      ", COMPRADOR=" + COMPRADOR +
      '}';
  }
}
