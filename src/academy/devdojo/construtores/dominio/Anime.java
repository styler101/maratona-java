package academy.devdojo.construtores.dominio;

public class Anime {

  private String nome;
  private String tipo;
  private int episodios;
  private String genero;

  private String estudio;
  public Anime(){}

  public Anime(String nome){
    this.nome = nome;
  }

  public Anime(String nome, String tipo){
    this.nome = nome;
    this.tipo = tipo;
  }

  public Anime(String nome, String tipo, int episodios, String genero){
    this(nome, tipo);
    this.episodios = episodios;
    this.genero = genero;
  }

  public Anime(String nome, String tipo, int episodios, String genero, String estudio){
    this(nome, tipo, episodios, genero); // Só podemos realizar essa operação em construtores e essa instrução só pode ser realizada no construtor.
    this.estudio = estudio;
  }

  public void imprime(){
    System.out.println("Nome do anime: "+ this.nome);
    System.out.println("Nome do estudio: "+ this.estudio);
    System.out.println("Quantidade de episodios: " + this.episodios);
    System.out.println("Tipo do anime: " + this.tipo);
  }
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getEpisodios() {
    return episodios;
  }

  public void setEpisodios(int episodios) {
    this.episodios = episodios;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getEstudio() {
    return estudio;
  }

  public void setEstudio(String estudio) {
    this.estudio = estudio;
  }
}
