package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.P00_HomePage;
import pages.P01_NewAccount;
import pages.P02_NewAccount;

public class D01_NewAccount extends P02_NewAccount {


    @Given("user click on sign in tab")
    public void sign_in_tap()
    {SignInTap().click();}

    @When("user enter email")
    public void enter_email()
    {EmailTXT().sendKeys("aammbbcc@yahoo.com");}


    @And("user click on create an account button")
    public void create_an_account(){CreateAnAccountBtn().click();}

    @And("user select gender type")
    //public void gender(){GenderType("male").click();}
     public void select_gender(){GenderType().click();}


    @And("user enter first name and last name")
    public void first_last_name(){
        FirstNameTXT().sendKeys("ahmed");
        LastName().sendKeys("mohamed");}

    //@And("user enter Email")
   // public void email()throws InterruptedException{
       // EmailTXT().sendKeys("aann@yahoo.com");}

    @And("user enter password")
    public void password(){
        Password().sendKeys("12345");
    }

    @And("user enter date of birth")
    public void birthday(){

        Select select = new Select(BirthDay());
        select.selectByIndex(8);

        select = new Select(BirthMonth());
        select.selectByValue("12");

        select = new Select(BirthYear());
        select.selectByValue("1991");
    }


    @And("user enter company name")
    public void company_name(){
        CompanyName().sendKeys("ABCDEF");
    }

    @And("user enter address1")
    public void address1(){
        Address1().sendKeys("newyourk");
    }

    @And("user enter address2")
    public void address2(){
        Address2().sendKeys("manhattan");
    }

    @And("user enter city name")
    public void city_name(){
        City().sendKeys("manhattan");
    }

    @And("user select the state")
    public void state(){

        Select select = new Select(State());
        select.selectByVisibleText("Alaska");}

    @And("user enter postal code")
    public void postal_code(){
        PostalCode().sendKeys("11111");}


    @And("user select country")
    public void country(){
        Select select = new Select(Country());
        select.selectByVisibleText("United States");}

    @And("user enter home phone")
    public void home_phone(){
        HomePhone().sendKeys("0222222222");}

    @And("user enter mobil phone")
    public void mobil_phone(){
        MobilPhone().sendKeys("012222222222");}

    @And("user enter address alias")
    public void address_alias(){
        AddressAlis().sendKeys("usa");}


    @Then("user click on register button")
    public void click_on_register_button(){
        RegisterButton().click();
    }


}
