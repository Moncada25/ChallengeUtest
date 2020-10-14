package co.com.bancolombia.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DevicesDataElements {

  public static final Target COMPUTER_SELECT = Target.the("computer select").locatedBy("//div[@name = 'osId']//span[@aria-label= 'Select OS']");
  public static final Target COMPUTER_INPUT = Target.the("computer input").locatedBy("//div[@name = 'osId']//input[@placeholder= 'Select OS']");
  public static final Target VERSION_SELECT = Target.the("version select").locatedBy("//span[@aria-label= 'Select a Version']");
  public static final Target VERSION_INPUT = Target.the("version input").locatedBy("//input[@placeholder= 'Select a Version']");
  public static final Target LANGUAGE_SELECT = Target.the("language select").locatedBy("//span[@aria-label= 'Select OS language']");
  public static final Target LANGUAGE_INPUT = Target.the("language input").locatedBy("//input[@placeholder= 'Select OS language']");
  public static final Target MOBILE_SELECT = Target.the("mobile select").locatedBy("//span[@aria-label= 'Select Brand']");
  public static final Target MOBILE_INPUT = Target.the("mobile input").locatedBy("//input[@placeholder='Select Brand']");
  public static final Target MODEL_SELECT = Target.the("model select").locatedBy("//span[@aria-label= 'Select a Model']");
  public static final Target MODEL_INPUT = Target.the("model input").locatedBy("//input[@placeholder='Select a Model']");
  public static final Target MOBILE_VERSION_SELECT = Target.the("mobile version select").locatedBy("//div[@name = 'handsetOSId']//span[@aria-label= 'Select OS']");
  public static final Target MOBILE_VERSION_INPUT = Target.the("mobile version input").locatedBy("//div[@name = 'handsetOSId']//input[@placeholder= 'Select OS']");

}
