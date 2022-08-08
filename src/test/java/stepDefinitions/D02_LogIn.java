package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_LoginIn;

public class D02_LogIn extends P03_LoginIn {

    @When("user enter email address")
    public void enter_email(){EmailAddressTXT().sendKeys("aamm@yahoo.com");}

    @And("user enter log in password")
    public void enter_login_password(){PasswordTXT().sendKeys("12345");}

    @Then("user click on sign in button")
    public void sign_in_button(){SignInButton().click();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(MYAccountMSG().isDisplayed());
        soft.assertAll();

    }





}
