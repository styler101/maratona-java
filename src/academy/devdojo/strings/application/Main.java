package academy.devdojo.strings.application;

public class Main {
    public static void main(String[] args){
      String nome = "William";
      String nome2 = "William";
      String[] arrayString = new String[]{ nome, nome2};
      String result = concatValues(arrayString);
      result = result.substring(0, result.length() -1);
      System.out.println(result);
    }

    private static String concatValues(String[] values){
      String aux= "";
      for(String item:values) aux += item.concat("+");
      return aux;
    }
}
