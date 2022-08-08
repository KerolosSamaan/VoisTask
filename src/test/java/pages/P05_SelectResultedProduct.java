package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepDefinitions.Hooks;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.logging.Handler;

public class P05_SelectResultedProduct extends P04_BlousesInWomen{

    public WebElement ResultedProduct(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"product_img_link\"]"));}

    public WebElement AddToCart(){
        return Hooks.driver.findElement(By.cssSelector(" p[id=\"add_to_cart\"]"));}

    public WebElement ProceedToCheckout(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"btn btn-default button button-medium\"]"));}


    public WebElement ProceedToCheckout2()
    {return Hooks.driver.findElement(By.cssSelector("a[class=\"button btn btn-default standard-checkout button-medium\"]"));}

    public WebElement ProceedToCheckout3 ()
    {return Hooks.driver.findElement(By.cssSelector("button[class=\"button btn btn-default button-medium\"]"));}

    public WebElement AgreeTerms()
    {return Hooks.driver.findElement(By.cssSelector("div[id=\"uniform-cgv\"]"));}


   public WebElement ProceedToCheckout4()
   {return Hooks.driver.findElement(By.cssSelector("button[class=\"button btn btn-default standard-checkout button-medium\"]"));}


    public WebElement BankWire()
    {return Hooks.driver.findElement(By.cssSelector("a[class=\"bankwire\"]"));}

    public WebElement ConfirmOrder(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button btn btn-default button-medium\"]"));}






}
