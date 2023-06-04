package logicadeprogramacao.estrutural;

import java.util.Scanner;

// Para o cargo de presidente
// Temos três candidatos A, B , C
// Foram apurados votos nulos, votos brancos, votos válidos.
// Ler a quantidade de votos validos para cada canditado, ler também os votos nulos e brancos
// Apresentar o total de eleitores(considerando os votos válidos em relação a quantidade de eleitores)
// Percentual que corresponde canditado A é sobre os votos validos
public class Exercicio18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // canditados A , B C
    // votos nulos, votos em brancos, votos nulos
    int votosNulosA, votosBrancosA, votosValidosA,
      votosNulosB, votosBrancosB,votosValidosB,
      votosNulosC, votosBrancosC, votosValidosC;

    System.out.println("Quantos votos válidos o canditado A teve?");
    votosValidosA = scanner.nextInt();
    System.out.println("Quantos votos válidos o canditado B teve?");
    votosValidosB =  scanner.nextInt();
    System.out.println("Quantos votos válidos o canditado C teve?");
    votosValidosC = scanner.nextInt();

    System.out.println("Quantos votos nulos o canditado A teve?");
    votosNulosA = scanner.nextInt();
    System.out.println("Quantos votos nulos o canditado B teve?");
    votosNulosB =  scanner.nextInt();
    System.out.println("Quantos votos nulos o canditado C teve?");
    votosNulosC = scanner.nextInt();

    System.out.println("Quantos votos brancos o canditado A teve?");
    votosBrancosA = scanner.nextInt();
    System.out.println("Quantos votos brancos o canditado B teve?");
    votosBrancosB =  scanner.nextInt();
    System.out.println("Quantos votos brancos o canditado C teve?");
    votosBrancosC = scanner.nextInt();

    int totalEleitores = votosValidosA + votosValidosB + votosValidosC + votosNulosA + votosNulosB + votosNulosC + votosBrancosA + votosBrancosB + votosBrancosC;

   double percentualVotosValidos = totalEleitores  / 3;
   double percuntualVotosVA = (double) votosValidosA /totalEleitores;
   double percuntualVotosVB = (totalEleitores * votosValidosB) /100;
   double percuntualVotosVC = (totalEleitores * votosValidosC) /100;
/*
    double percuntualVotosBA = totalEleitores * (votosBrancosA/100);
    double percuntualVotosBB = totalEleitores * (votosBrancosB /100);
    double percuntualVotosBC = totalEleitores * (votosBrancosC/100);

    double percuntualVotosNA = totalEleitores *  (votosNulosA/100);
    double percuntualVotosNB = totalEleitores * (votosNulosB/100);
    double percuntualVotosNC = totalEleitores * (votosNulosC/100);



   System.out.println("Total de Eleitores"+ totalEleitores);
   System.out.println("Percentual de votos válidos em relação eleitores" + percentualVotosValidos);
   System.out.println("Percentual de votos válidos canditado A: "+ percuntualVotosVA + "%");
   System.out.println("Percentual de votos válidos canditado B: "+ percuntualVotosVB + "%");
   System.out.println("Percentual de votos válidos canditado C: "+ percuntualVotosVC + "%");

   System.out.println("Percentual de votos brancos canditado A: "+ percuntualVotosBA + "%");
   System.out.println("Percentual de votos brancos canditado B: "+ percuntualVotosBB  + "%");
   System.out.println("Percentual de votos brancos canditado C: "+ percuntualVotosBC  + "%");

    System.out.println("Percentual de votos nulos canditado A: "+ percuntualVotosNA + "%");
    System.out.println("Percentual de votos nulos canditado B: "+ percuntualVotosNB + "%");
    System.out.println("Percentual de votos nulos canditado C: "+ percuntualVotosNC + "%");

*/
    scanner.close();
  }
}
