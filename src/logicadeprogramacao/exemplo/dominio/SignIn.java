package logicadeprogramacao.exemplo.dominio;

import logicadeprogramacao.exemplo.protocols.Controller;
import logicadeprogramacao.exemplo.protocols.EmailValidator;

public class SignIn implements Controller {
  private EmailValidator emailValidator;

  public SignIn(EmailValidator emailValidator){
    this.emailValidator = emailValidator;
  }

  @Override
  public void handle(String email) {
   if(this.emailValidator.isValid(email)){
     System.out.println("Handle Executado com sucesso!");
   }else{
     System.out.println("Email Invalido!");
   }
  }

  public EmailValidator getEmailValidator() {
    return emailValidator;
  }

  public void setEmailValidator(EmailValidator emailValidator) {
    this.emailValidator = emailValidator;
  }
}
