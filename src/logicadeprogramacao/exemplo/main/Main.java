package logicadeprogramacao.exemplo.main;

import logicadeprogramacao.exemplo.dominio.EmailValidatorAdapter;
import logicadeprogramacao.exemplo.dominio.SignIn;

public class Main {
  public static void main(String[] args) {
    EmailValidatorAdapter emailValidator = new EmailValidatorAdapter();
    SignIn signIn = new SignIn(emailValidator);
    signIn.handle("any_email@mail.com");
  }
}
