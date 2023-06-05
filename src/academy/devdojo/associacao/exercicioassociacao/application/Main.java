package academy.devdojo.associacao.exercicioassociacao.application;
// Sistema gerenciador de seminários
// O sistema deve cadastrar seminários, estudantes, professores e local onde será realizado.
// O Aluno poderá estar em apenas um seminário [X]
// - Um Semario poderá ter nenhum ou vários alunos.[X]
// - Um professor poderá estar em vários seminários[X]
// - Um seminário poderá ter um local.[X]

import academy.devdojo.associacao.exercicioassociacao.dominio.Aluno;
import academy.devdojo.associacao.exercicioassociacao.dominio.Local;
import academy.devdojo.associacao.exercicioassociacao.dominio.Professor;
import academy.devdojo.associacao.exercicioassociacao.dominio.Seminario;

import java.util.Scanner;

// Campos básicos(excluido relacionamento)
// Seminário -> titulo [X]
// aluno -> nome e idede [X]
//  professor -> nome, especialidade
// endereço -> local.[X]
public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Local local = new Local("Avenida X n- 60");
      Seminario seminario = new Seminario("Formatura Infantil", local);
      Aluno aluno1 = new Aluno("Mateus",5, seminario );
      Aluno aluno2 = new Aluno("Sara", 5, seminario);
      Aluno aluno3 = new Aluno("José", 5, seminario);
      Aluno[] alunos = new Aluno[]{aluno1, aluno2, aluno3};
      seminario.setAluno(alunos);
      Seminario[] semanarios = new Seminario[]{ seminario};
      Professor jorge = new Professor("Jorge", "Educação Infantil",semanarios  );
      Professor lara = new Professor("Lara", "Educação Infantil" ,semanarios);
      jorge.informacoesDoSeminario();


      scanner.close();
  }
}
