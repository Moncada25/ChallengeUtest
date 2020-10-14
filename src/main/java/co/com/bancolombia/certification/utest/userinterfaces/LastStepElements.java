package co.com.bancolombia.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LastStepElements {

  public static final Target PASSWORD_INPUT = Target.the("password input").locatedBy("//input[@id = 'password']");
  public static final Target CONFIRM_PASSWORD_INPUT = Target.the("confirm password input").locatedBy("//input[@id = 'confirmPassword']");
  public static final Target ACCEPT_TERMS = Target.the("check for accept terms").locatedBy("//input[@id = 'termOfUse']//following-sibling::span[1]");
  public static final Target ACCEPT_PRIVACY_POLICY = Target.the("check for accept privacy policy").locatedBy("//input[@id = 'privacySetting']//following-sibling::span[1]");
  public static final Target COMPLETE_SETUP = Target.the("button for complete setup").locatedBy("//a[@id = 'laddaBtn']");
}