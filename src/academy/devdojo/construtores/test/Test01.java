package academy.devdojo.construtores.test;

import academy.devdojo.construtores.dominio.Anime;

public class Test01 {
  public static void main(String[] args) {
    Anime anime = new Anime("Naruto", "Shounen");
    Anime anime2 = new Anime("Yu Yu hakusho", "Shounen", 200, "Aventura", "Teste");
    if(anime.getNome().endsWith("to")){
      System.out.println("Termina com to");
    }else{
      System.out.println("Não termina com to");
    }
  }
}

