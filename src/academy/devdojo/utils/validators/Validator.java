package academy.devdojo.utils.validators;

import java.util.regex.Pattern;

public class Validator {

  public static boolean isValidEmail(String email){
    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
    return EMAIL_REGEX.matcher(email).matches();
  };

  public static String notEmptyStringOrDefault(String value){
    return value == null ? "-" : value.trim();
  }

}
