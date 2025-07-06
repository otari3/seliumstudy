package soucedemotests.basetests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.soucedemo.pages.BasePage;
import com.soucedemo.pages.LoginPage;

public class BaseTest {
  protected WebDriver driver;
  protected BasePage basePage;
  protected LoginPage loginPage;
  ChromeOptions options = new ChromeOptions();
  private String url = "https://www.saucedemo.com/";

  @BeforeClass
  public void setUp(){  
    options.addArguments("--incognito");
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get(url);
    basePage = new BasePage();
    basePage.setDriver(driver);
    loginPage = new LoginPage();
  }

  @AfterClass
  public void tearDown(){  
    driver.quit();
  }
}
