package soucedemotests.login;

import org.testng.Assert;
import org.testng.annotations.Test;


import soucedemotests.basetests.BaseTest;

public class LoginTest extends BaseTest{

  @Test
  public void testLoginErrorMessage() throws InterruptedException{
    String errormsg = "Epic sadface: Username and password do not match any user in this service";
    loginPage.logIntoApplication("hello world", "fadsfdas");
    Assert.assertEquals(errormsg,loginPage.getErrorMessage());
    
  }
  
}
