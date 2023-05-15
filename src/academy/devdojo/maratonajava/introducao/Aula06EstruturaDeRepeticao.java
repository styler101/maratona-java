package academy.devdojo.maratonajava.introducao;


public class Aula06EstruturaDeRepeticao {
  public static void main(String[] args) {
    int count = 0;
    while(count < 10){
      System.out.println(++count);
    }

    do{
      System.out.println("Dentro do do While");
      count++;
    }while(count < 10);

    for(int i = 0; i < 10; i++){
      System.out.println(i);
    }
  }

}
