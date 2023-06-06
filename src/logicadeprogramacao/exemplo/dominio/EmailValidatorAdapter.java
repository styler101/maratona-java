package logicadeprogramacao.exemplo.dominio;

import logicadeprogramacao.exemplo.protocols.EmailValidator;

import java.util.regex.Pattern;

public class EmailValidatorAdapter implements EmailValidator {
  @Override
  public boolean isValid(String email) {
    return Pattern.matches("[_a-zA-Z0-9]+(\\.[A-Za-z0-9]*)*@[A-Za-z0-9]+\\.[A-Za-z0-9]+(\\.[A-Za-z0-9]*)*", email);
  }
}
