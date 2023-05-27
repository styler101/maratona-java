package academy.devdojo.blocosinicializacao.test;


import academy.devdojo.blocosinicializacao.dominio.Anime;

import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Entre com o nome do anime");
      String name = scanner.nextLine();
      System.out.println("Quantos episodios o anime " + name + "possuí ? ");
      int quantity = scanner.nextInt();
      int[] episodios = new int[quantity];
      for(int i = 0; i < episodios.length; i++){
        episodios[i] = i;
      }

      System.out.println("Episodios");
      Anime anime = new Anime();
      anime.setNome(name);
      anime.setEpisodios(episodios);

      anime.showEpisodes();


      scanner.close();
  }

}
