package academy.devdojo.associacao.dominio;

public class Professor {
  private String nome;

  private Escola escola;
  public Professor(){

  }

  public Professor(String nome){
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
