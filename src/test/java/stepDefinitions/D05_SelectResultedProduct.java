package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P05_SelectResultedProduct;

public class D05_SelectResultedProduct extends P05_SelectResultedProduct {

    @Given("user choose resulted product")
    public void Resulted_Product(){ResultedProduct().click();}


    @When("user click on add to cart button")
    public void Add_To_Cart(){AddToCart().click();}


    @And("user follow checkout procedure")
    public void Checkout_Procedure(){
        ProceedToCheckout().click();
        ProceedToCheckout2().click();
        ProceedToCheckout3().click();
        AgreeTerms().click();
        ProceedToCheckout4().click();
    }


    @Then("confirm order by selecting bank wire option")
    public void Bank_Wire(){BankWire().click();}








}
