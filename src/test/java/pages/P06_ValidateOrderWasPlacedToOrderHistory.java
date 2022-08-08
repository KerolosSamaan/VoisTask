package pages;

import jdk.internal.org.objectweb.asm.Handle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P06_ValidateOrderWasPlacedToOrderHistory extends P05_SelectResultedProduct {

    public WebElement MyAccount(){
        return Hooks.driver.findElement(By.cssSelector("a[title=\"View my customer account\"]"));}


    public WebElement OrderHistory(){
        return Hooks.driver.findElement(By.cssSelector("a[title=\"Orders\"]"));}


    public WebElement History_Message(){
        return Hooks.driver.findElement(By.cssSelector("p[class=\"info-title\"]"));}







}
