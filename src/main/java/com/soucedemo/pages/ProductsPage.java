package com.soucedemo.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

  private By productsHeader = By.xpath("//span[text()='Products']");
  private By burgerMenu = By.id("react-burger-menu-btn");
  private By logOutField = By.xpath("//nav//a[text()='Logout']");

  public boolean isProductsHeaderDisplayed(LoginPage lg){ 
    try {
      return find(productsHeader).isDisplayed();
    }   
    catch (NoSuchElementException e) {
      System.out.println("hell0 world");
      lg.cleaningText();
      return false;
    }   
    catch(Exception e){
      return false;
    }
  }

  public LoginPage logOut() throws InterruptedException{  
  try {
    click(burgerMenu);
    Thread.sleep(600);
    click(logOutField);
    return new LoginPage();
  }   
  catch (NoSuchElementException e) {
    return null;
  } catch(Exception e){   
    return null;
  }
  }

  
}
