package soucedemotests.login;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.soucedemo.pages.ProductsPage;

import soucedemotests.basetests.BaseTest;

public class ProductsTest extends BaseTest {

  @Test
  public void testLogin() throws InterruptedException{ 
   String[] loginCred = loginPage.getLoginCredentials();
   SoftAssert softAssert = new SoftAssert();

   for(int i = 0;i<loginCred.length;i++){  
    String lg = loginCred[i];
    ProductsPage currPg = loginPage.logIntoApplication(lg, "secret_sauce");
    softAssert.assertTrue(currPg.isProductsHeaderDisplayed(loginPage), "test case "+i+" failed");
    currPg.logOut();
   }
   softAssert.assertAll();
  }

}
