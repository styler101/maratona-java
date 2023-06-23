package academy.devdojo.exceptions.application;

public class RunTimeExceptionTest03 {
  public static void main(String[]args){
      try{
        System.out.println("Abrindo o arquivo");
        System.out.println("Escrevendo os dados no arquivo");
        System.out.println("Fechando os recursos do SO");
      }catch(Exception e){
        e.printStackTrace();
      }finally {
        System.out.println("Encerrando o programa.");

      }
  }

  public static String abreConexao(){
    try{
      System.out.println("Abrindo o arquivo");
      System.out.println("Escrevendo os dados no arquivo");
      System.out.println("Fechando os recursos");
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      System.out.println("Encerrando a transação");
    }

    return null;
  }

}
