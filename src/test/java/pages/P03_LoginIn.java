package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P03_LoginIn extends P02_NewAccount {

    public WebElement EmailAddressTXT(){return Hooks.driver.findElement(By.cssSelector("input[id=\"email\"]"));}

    public WebElement PasswordTXT(){return Hooks.driver.findElement(By.cssSelector("input[id=\"passwd\"]"));}

    public WebElement SignInButton(){return Hooks.driver.findElement(By.cssSelector("button[id=\"SubmitLogin\"]"));}

    public WebElement MYAccountMSG(){return Hooks.driver.findElement(By.cssSelector("h1[class=\"page-heading\"]"));}
}
