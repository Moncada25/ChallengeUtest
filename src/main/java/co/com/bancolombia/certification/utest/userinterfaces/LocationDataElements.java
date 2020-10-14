package co.com.bancolombia.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LocationDataElements {

  public static final Target CITY = Target.the("city of new user").locatedBy("//input[@id = 'city']");
  public static final Target POSTAL_CODE = Target.the("postal code of city").locatedBy("//input[@id = 'zip']");
  public static final Target COUNTRY_SELECT = Target.the("country of new user select").locatedBy("//span[@aria-label= 'Select a country']");
  public static final Target COUNTRY_INPUT = Target.the("country of new user input").locatedBy("//input[@placeholder= 'Select a country']");
}
