package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.utest.userinterfaces.BasicDataElements;
import co.com.bancolombia.certification.utest.userinterfaces.DevicesDataElements;
import co.com.bancolombia.certification.utest.utilities.Constants;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class EnterDevices implements Task {

  private Map<String, String> data;

  public EnterDevices(Map<String, String> data) {
    this.data = data;
  }

  public static EnterDevices information(Map<String, String> data) {
    return Tasks.instrumented(EnterDevices.class, data);
  }

  @Step("{0} enters the information about devices")
  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        Click.on(DevicesDataElements.COMPUTER_SELECT),
        Enter.theValue(data.get(Constants.COMPUTER)).into(DevicesDataElements.COMPUTER_INPUT)
    );

    DevicesDataElements.COMPUTER_INPUT.resolveFor(actor).sendKeys(Keys.ENTER);

    actor.attemptsTo(
        Click.on(DevicesDataElements.VERSION_SELECT),
        Enter.theValue(data.get(Constants.VERSION)).into(DevicesDataElements.VERSION_INPUT)
    );

    DevicesDataElements.VERSION_INPUT.resolveFor(actor).sendKeys(Keys.ENTER);

    actor.attemptsTo(
        Click.on(DevicesDataElements.LANGUAGE_SELECT),
        Enter.theValue(data.get(Constants.LANGUAGE)).into(DevicesDataElements.LANGUAGE_INPUT)
    );

    DevicesDataElements.LANGUAGE_INPUT.resolveFor(actor).sendKeys(Keys.ENTER);

    actor.attemptsTo(
        Click.on(DevicesDataElements.MOBILE_SELECT),
        Enter.theValue(data.get(Constants.MOBILE_DEVICE)).into(DevicesDataElements.MOBILE_INPUT)
    );

    DevicesDataElements.MOBILE_INPUT.resolveFor(actor).sendKeys(Keys.ENTER);

    actor.attemptsTo(
        Click.on(DevicesDataElements.MODEL_SELECT),
        Enter.theValue(data.get(Constants.MODEL)).into(DevicesDataElements.MODEL_INPUT)
    );

    DevicesDataElements.MODEL_INPUT.resolveFor(actor).sendKeys(Keys.ENTER);

    actor.attemptsTo(
        Click.on(DevicesDataElements.MOBILE_VERSION_SELECT),
        Enter.theValue(data.get(Constants.OS)).into(DevicesDataElements.MOBILE_VERSION_INPUT)
    );

    DevicesDataElements.MOBILE_VERSION_INPUT.resolveFor(actor).sendKeys(Keys.ENTER);
    actor.attemptsTo(Click.on(BasicDataElements.NEXT_STEP));
  }
}