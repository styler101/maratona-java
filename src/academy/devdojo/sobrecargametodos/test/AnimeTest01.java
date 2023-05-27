package academy.devdojo.sobrecargametodos.test;

import academy.devdojo.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
  public static void main(String[] args) {
      Anime anime = new Anime();
      anime.setNome("Akuma Drive");
      anime.setTipo("TV");
      anime.setEpisodios(12);
      System.out.println(anime);


  }
}
