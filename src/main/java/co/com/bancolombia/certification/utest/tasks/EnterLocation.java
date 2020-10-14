package co.com.bancolombia.certification.utest.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.bancolombia.certification.utest.userinterfaces.BasicDataElements;
import co.com.bancolombia.certification.utest.userinterfaces.LocationDataElements;
import co.com.bancolombia.certification.utest.utilities.Constants;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class EnterLocation implements Task {

  private Map<String, String> data;

  public EnterLocation(Map<String, String> data) {
    this.data = data;
  }

  public static EnterLocation information(Map<String, String> data) {
    return Tasks.instrumented(EnterLocation.class, data);
  }

  @Step("{0} enters the location data")
  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        WaitUntil.the(LocationDataElements.CITY, isEnabled()),
        Enter.theValue(data.get(Constants.CITY)).into(LocationDataElements.CITY)
    );

    LocationDataElements.CITY.resolveFor(actor).sendKeys(Keys.DOWN);
    LocationDataElements.CITY.resolveFor(actor).sendKeys(Keys.ENTER);

    actor.attemptsTo(
        Enter.theValue(data.get(Constants.POSTAL_CODE)).into(LocationDataElements.POSTAL_CODE),
        Click.on(LocationDataElements.COUNTRY_SELECT),
        WaitUntil.the(LocationDataElements.COUNTRY_INPUT, isEnabled()),
        Enter.theValue(data.get(Constants.COUNTRY)).into(LocationDataElements.COUNTRY_INPUT)
    );

    LocationDataElements.COUNTRY_INPUT.resolveFor(actor).sendKeys(Keys.ENTER);

    actor.attemptsTo(Click.on(BasicDataElements.NEXT_STEP));
  }
}
