package co.com.bancolombia.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class TheUser implements Question<Boolean> {

  public static TheUser wasRegistered(){
    return new TheUser();
  }

  @Subject("completes the register")
  @Override
  public Boolean answeredBy(Actor actor) {
    return true;
  }
}
