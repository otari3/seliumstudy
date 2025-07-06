package com.soucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class BasePage {
  public static WebDriver driver;

  public void setDriver(WebDriver driver){
    BasePage.driver = driver;  

  }

  protected WebElement find(By locetor){  
    return driver.findElement(locetor);
  }

  protected void set(By locetor,String txt){
       find(locetor).clear();
       find(locetor).sendKeys(txt);
  }

  protected void click(By locetor){ 
      find(locetor).click();
  }
}
