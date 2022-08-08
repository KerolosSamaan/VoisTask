package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P00_HomePage{

    public WebElement SignInTap() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"login\"]"));
    }


}
