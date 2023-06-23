package academy.devdojo.exemplo.application;

import academy.devdojo.exemplo.domain.Animal;
import academy.devdojo.exemplo.domain.Cat;
import academy.devdojo.exemplo.domain.Dog;

public class Main {

  public static void main(String[]args){
    Animal cachorro = new Dog();
    cachorro.makeSound();
    Animal gato = new Cat();
    gato.makeSound();
  }
}
