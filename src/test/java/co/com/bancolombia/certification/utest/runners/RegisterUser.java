package co.com.bancolombia.certification.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    glue = "co.com.bancolombia.certification.utest.stepdefinitions",
    features = "src/test/resources/features/register_user.feature",
    snippets = SnippetType.CAMELCASE,
    monochrome = true
)
public class RegisterUser {

}