package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P01_NewAccount extends P00_HomePage {

    public WebElement EmailTXT() {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"email_create\"]"));
    }

    public WebElement CreateAnAccountBtn() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"btn btn-default button button-medium exclusive\"]"));
    }
}
