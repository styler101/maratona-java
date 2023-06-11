package academy.devdojo.utils.test;

import academy.devdojo.utils.validators.Validator;

public class Main {
  public static void main(String[]args){
    String value = Validator.notEmptyStringOrDefault(null);
    System.out.println("Value: "+ value);
  }
}
