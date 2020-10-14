package co.com.bancolombia.certification.utest.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.bancolombia.certification.utest.exceptions.RegisterFailure;
import co.com.bancolombia.certification.utest.models.User;
import co.com.bancolombia.certification.utest.questions.TheUser;
import co.com.bancolombia.certification.utest.tasks.CompleteSetup;
import co.com.bancolombia.certification.utest.tasks.EnterBasic;
import co.com.bancolombia.certification.utest.tasks.EnterDevices;
import co.com.bancolombia.certification.utest.tasks.EnterLocation;
import co.com.bancolombia.certification.utest.utilities.Constants;
import co.com.bancolombia.certification.utest.utilities.DriverChrome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

public class RegisterUserStepDefinitions {

  @Given("^the user opens register page$")
  public void theUserOpensRegisterPage() {
    setTheStage(Cast.whereEveryoneCan(
        BrowseTheWeb.with(DriverChrome.web().inTheWebPage(Constants.MAIN_PAGE))));
    theActorCalled("Santiago");
  }

  @When("^he enters your basic data$")
  public void heEntersYourBasicData(List<User> user) {
    theActorInTheSpotlight().attemptsTo(EnterBasic.information(user.get(0)));
  }

  @When("^he enters your location data$")
  public void heEntersYourLocationData(Map<String, String> data) {
    theActorInTheSpotlight().attemptsTo(EnterLocation.information(data));
  }

  @When("^he enters your data about devices$")
  public void heEntersYourDataAboutDevices(Map<String, String> data) {
    theActorInTheSpotlight().attemptsTo(EnterDevices.information(data));
  }

  @When("^he enters the password (.*)$")
  public void heEntersYThePassword(String password) {
    theActorInTheSpotlight().attemptsTo(CompleteSetup.forRegister(password));
  }

  @Then("^should see that the user was registered$")
  public void shouldSeeThatTheUserWasRegistered() {
    theActorInTheSpotlight().should(
        seeThat(TheUser.wasRegistered()).orComplainWith(RegisterFailure.class, Constants.ERROR)
    );
  }
}