package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.models.User;
import co.com.bancolombia.certification.utest.userinterfaces.BasicDataElements;
import co.com.bancolombia.certification.utest.utilities.FormatDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class EnterBasic implements Task {

  private User newUser;

  public EnterBasic(User newUser) {
    this.newUser = newUser;
  }

  public static EnterBasic information(User newUser) {
    return Tasks.instrumented(EnterBasic.class, newUser);
  }

  @Step("{0} enters the basic data for register")
  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        Enter.theValue(newUser.getFirstName()).into(BasicDataElements.FIRST_NAME),
        Enter.theValue(newUser.getLastName()).into(BasicDataElements.LAST_NAME),
        Enter.theValue(newUser.getEmail()).into(BasicDataElements.EMAIL),
        SelectFromOptions.byVisibleText(FormatDate.getValue(newUser.getDateOfBirth(), 0))
            .from(BasicDataElements.MONTH_DATE),
        SelectFromOptions.byVisibleText(FormatDate.getValue(newUser.getDateOfBirth(), 1))
            .from(BasicDataElements.DAY_DATE),
        SelectFromOptions.byVisibleText(FormatDate.getValue(newUser.getDateOfBirth(), 2))
            .from(BasicDataElements.YEAR_DATE),
        Enter.theValue(newUser.getLanguage()).into(BasicDataElements.LANGUAGES)
    );

    BasicDataElements.LANGUAGES.resolveFor(actor).sendKeys(Keys.ENTER);

    actor.attemptsTo(Click.on(BasicDataElements.NEXT_STEP));
  }
}