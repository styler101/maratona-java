package academy.devdojo.blocosinicializacao.dominio;

public class Carro extends Anime{
  private String nome;
  private double velocidadeMaxima;
  private static double velocidadeLimite = 250;

  public Carro(String nome, double velocidadeMaxima){
    this.nome = nome;
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public void imprime(){
    System.out.println("-------------------");
    System.out.println("Nome : " + this.getNome());
    System.out.println("Velocidade Máxima: " + this.getVelocidadeMaxima());
    System.out.println("Velocidade Média: " + Carro.velocidadeLimite);
    System.out.println("-------------------");
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  public void setVelocidadeMaxima(double velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
  }
  public static void setVelocidadeLimite(double novaVelocidadeLimite){
    Carro.velocidadeLimite = novaVelocidadeLimite;
  }

  public static double getVelocidadeLimite(){
    return velocidadeLimite;
  }





}
