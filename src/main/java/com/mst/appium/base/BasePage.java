package com.mst.appium.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mst.appium.core.DeviceInfo;

public class BasePage {



private static final int TIMEOUT = 5;
private static final int POLLING = 100;

protected WebDriver driver1;
protected String driver;
private WebDriverWait wait;

public BasePage(DeviceInfo cfg) {
    this.driver =cfg.getDriverName();
   //  wait = new WebDriverWait(driver, TIMEOUT, POLLING);
    PageFactory.initElements(new AjaxElementLocatorFactory(driver1, TIMEOUT), this);
}

protected void waitForElementToAppear(By locator) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}

protected void waitForElementToDisappear(By locator) {
    wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
}

protected void waitForTextToDisappear(By locator, String text) {
    wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
}
}