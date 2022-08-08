package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P02_NewAccount extends P01_NewAccount{




    public WebElement GenderType() {return Hooks.driver.findElement(By.cssSelector("input[id=\"id_gender1\"]"));}



            //WebElement element = null;

        //if (type.contains("male")) {
          //  element = Hooks.driver.findElement(By.cssSelector("input[id=\"id_gender1\"]"));}

        //if (type.contains("female")) {
          //  element = Hooks.driver.findElement(By.cssSelector("input[id=\"id_gender2\"]"));}

       //return element;


    public WebElement FirstNameTXT(){return Hooks.driver.findElement(By.cssSelector("input[id=\"customer_firstname\"]"));}
    public WebElement LastName(){return Hooks.driver.findElement(By.cssSelector("input[id=\"customer_lastname\"]"));}
    public WebElement Password(){return Hooks.driver.findElement(By.cssSelector("input[type=\"password\"]"));}
    public WebElement BirthDay(){return Hooks.driver.findElement(By.cssSelector("select[id=\"days\"]"));}
    public WebElement BirthMonth(){return Hooks.driver.findElement(By.cssSelector("select[id=\"months\"]"));}
    public WebElement BirthYear(){return Hooks.driver.findElement(By.cssSelector("select[id=\"years\"]"));}
    public WebElement CompanyName(){return Hooks.driver.findElement(By.cssSelector("input[id=\"company\"]"));}
    public WebElement Address1(){return Hooks.driver.findElement(By.cssSelector("input[id=\"address1\"]"));}
    public WebElement Address2(){return Hooks.driver.findElement(By.cssSelector("input[id=\"address2\"]"));}
    public WebElement City(){return Hooks.driver.findElement(By.cssSelector("input[id=\"city\"]"));}
    public WebElement State(){return Hooks.driver.findElement(By.cssSelector("select[name=\"id_state\"]"));}
    public WebElement PostalCode(){return Hooks.driver.findElement(By.cssSelector("input[id=\"postcode\"]"));}
    public WebElement Country(){return Hooks.driver.findElement(By.cssSelector("select[id=\"id_country\"]"));}
    public WebElement HomePhone(){return Hooks.driver.findElement(By.cssSelector("input[id=\"phone\"]"));}
    public WebElement MobilPhone(){return Hooks.driver.findElement(By.cssSelector("input[id=\"phone_mobile\"]"));}
    public WebElement AddressAlis(){return Hooks.driver.findElement(By.cssSelector("input[id=\"alias\"]"));}
    public WebElement RegisterButton(){return Hooks.driver.findElement(By.cssSelector("button[id=\"submitAccount\"]"));}







}
