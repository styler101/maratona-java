package academy.devdojo.associacao.dominio;

public class Time {

  private String nome;

  private Jogador[] jogadores;
  public Time() {
  }

  public Time(String nome) {
    this.nome = nome;
  }

  public Time(String nome, Jogador[] jogadores){
    this.nome = nome;
    this.jogadores = jogadores;
  }


  public void imprime(){
    System.out.println("Informações do Time");
    System.out.println("Nome do time:" + this.getNome());
    if(this.getJogadores() != null && this.jogadores.length > 0){
      System.out.println("Lista de Jogadores");
      for(Jogador jogador:jogadores){
        System.out.println("Nome do jogador: " + jogador.getNome());
      }
    }
  }
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Jogador[] getJogadores() {
    return jogadores;
  }

  public void setJogadores(Jogador[] jogadores) {
    this.jogadores = jogadores;
  }
}
