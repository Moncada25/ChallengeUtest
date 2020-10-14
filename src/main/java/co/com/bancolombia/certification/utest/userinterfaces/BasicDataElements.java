package co.com.bancolombia.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BasicDataElements {

  public static final Target FIRST_NAME = Target.the("first name input").locatedBy("//input[@id = 'firstName']");
  public static final Target LAST_NAME = Target.the("last name input").locatedBy("//input[@id = 'lastName']");
  public static final Target EMAIL = Target.the("email user input").locatedBy("//input[@id = 'email']");
  public static final Target MONTH_DATE = Target.the("birth month list").locatedBy("//select[@id = 'birthMonth']");
  public static final Target DAY_DATE = Target.the("birth day list").locatedBy("//select[@id = 'birthDay']");
  public static final Target YEAR_DATE = Target.the("birth year list").locatedBy("//select[@id = 'birthYear']");
  public static final Target LANGUAGES = Target.the("languages input").locatedBy("//div[@id = 'languages']//input");
  public static final Target NEXT_STEP = Target.the("next step button").locatedBy("//a[contains(@aria-label , 'Next')]");
}
