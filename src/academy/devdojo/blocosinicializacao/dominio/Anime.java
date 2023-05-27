package academy.devdojo.blocosinicializacao.dominio;

public class Anime {

  private String nome;
  private int[] episodios;

  public Anime(){}

  public Anime(String nome, int[] episodios){
    this.nome = nome;
    this.episodios = episodios;
  }

  public void showEpisodes(){
    for(int item: episodios){
      System.out.println(item + 1);
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int[] getEpisodios() {
    return episodios;
  }

  public void setEpisodios(int[] episodios) {
    this.episodios = episodios;
  }
}
