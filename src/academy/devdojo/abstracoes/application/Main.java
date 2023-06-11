package academy.devdojo.abstracoes.application;

import academy.devdojo.abstracoes.domain.Commercial;
import academy.devdojo.abstracoes.domain.Funcionario;
import academy.devdojo.abstracoes.domain.Gerente;
import academy.devdojo.abstracoes.domain.Programador;

public class Main {
  public static void main(String[] args){
     Funcionario gerente = new Gerente("João", "Gerente", 8000);
     Funcionario programador = new Programador("Lucas", "Programador", 2600);
     Funcionario commercial = new Commercial("Amanda", "Atendente Commercial", 2900);
     gerente.calculaBonus();
     programador.calculaBonus();
     commercial.calculaBonus();
  }
}
