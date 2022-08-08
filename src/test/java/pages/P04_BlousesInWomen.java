package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.List;

public class P04_BlousesInWomen extends P03_LoginIn{

    public WebElement WomenTab(){return Hooks.driver.findElement(By.cssSelector("a[title=\"Women\"]"));}

    public WebElement BlousesTab(){return Hooks.driver.findElement(By.cssSelector("a[title=\"Blouses\"]"));}







}
