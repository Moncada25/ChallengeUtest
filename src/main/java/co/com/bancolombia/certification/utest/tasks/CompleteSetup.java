package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.userinterfaces.LastStepElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class CompleteSetup implements Task {

  private String password;

  public CompleteSetup(String password) {
    this.password = password;
  }

  public static CompleteSetup forRegister(String password) {
    return Tasks.instrumented(CompleteSetup.class, password);
  }

  @Step("{0} completes setup for register")
  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        Enter.theValue(password).into(LastStepElements.PASSWORD_INPUT),
        Enter.theValue(password).into(LastStepElements.CONFIRM_PASSWORD_INPUT),
        Click.on(LastStepElements.ACCEPT_TERMS),
        Click.on(LastStepElements.ACCEPT_PRIVACY_POLICY),
        Click.on(LastStepElements.COMPLETE_SETUP)
    );
  }
}
