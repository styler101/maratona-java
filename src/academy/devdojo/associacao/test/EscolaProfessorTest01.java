package academy.devdojo.associacao.test;

import academy.devdojo.associacao.dominio.Jogador;
import academy.devdojo.associacao.dominio.Time;

public class EscolaProfessorTest01 {
  public static void main(String[] args) {
    Time time = new Time("X");
    Jogador jogador = new Jogador("Pele");
    Jogador jogador2 = new Jogador("Ronaldinho");
    Jogador jogador3 = new Jogador("Messi");
    time.setJogadores( new Jogador[] { jogador, jogador2, jogador3});
    Time time2 = new Time("Y");
    time2.setJogadores( new Jogador[] { jogador, jogador2, jogador3});
    time.imprime();
    time2.imprime();



  }
}
