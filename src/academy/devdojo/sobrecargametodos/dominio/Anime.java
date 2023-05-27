package academy.devdojo.sobrecargametodos.dominio;

import academy.devdojo.sobrecargametodos.implementation.AnimeImplementation;

public class Anime implements AnimeImplementation {
  private String nome;
  private String tipo;
  private int episodios;
  private String genero;

  public Anime() {
  }



  public Anime(String tipo, int episodios){
    this.tipo = tipo;
    this.episodios = episodios;
  }
  public Anime(String nome, String tipo, int episodios){
    this.nome = nome;
    this.tipo = tipo;
    this.episodios = episodios;
  }

  public Anime(String nome, String tipo , int episodios, String genero){
    this.nome = nome;
    this.tipo = tipo;
    this.episodios = episodios;
    this.genero = genero;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getEpisodios(){
    return episodios;
  }

  public void setEpisodios(int episodios){
    this.episodios = episodios;
  }


  public String getGenero(){
    return genero;
  }

  public void setGenero(String genero){
    this.genero = genero;
  }

  @Override
  public void imprime() {
    System.out.println("Nome"+ this.getNome());
    System.out.println("Tipo"+  this.getTipo());
    System.out.println("Episódios"+ this.getEpisodios());
  }
}
