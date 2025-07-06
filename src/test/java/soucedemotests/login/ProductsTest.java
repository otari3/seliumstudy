package soucedemotests.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.soucedemo.pages.ProductsPage;

import soucedemotests.basetests.BaseTest;

public class ProductsTest extends BaseTest {

  @Test
  public void testLogin() throws InterruptedException{  
    ProductsPage prdPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
    Assert.assertTrue(prdPage.isProductsHeaderDisplayed());
  }

}
