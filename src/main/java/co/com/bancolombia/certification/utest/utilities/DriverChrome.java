package co.com.bancolombia.certification.utest.utilities;

import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverChrome {

  private static WebDriver driver;

  public static DriverChrome web() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.setPageLoadStrategy(PageLoadStrategy.NONE);
    options.addArguments(
        "--incognito", "--start-maximized", "--disable-infobars",
        "enable-automation", "--no-sandbox", "--disable-dev-shm-usage",
        "--disable-browser-side-navigation", "--disable-gpu");
    driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(20, SECONDS);
    return new DriverChrome();
  }

  public WebDriver inTheWebPage(String url) {
    driver.get(url);
    return driver;
  }
}