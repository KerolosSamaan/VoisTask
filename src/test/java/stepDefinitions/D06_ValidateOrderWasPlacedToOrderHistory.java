package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.P06_ValidateOrderWasPlacedToOrderHistory;

public class D06_ValidateOrderWasPlacedToOrderHistory extends P06_ValidateOrderWasPlacedToOrderHistory {

    @And("user click on my account button")
    public void Click_MyAccount(){MyAccount().click();}


    @Then("user click on order history button")
    public void Click_On_OrderHistory(){
        OrderHistory().click();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(History_Message().isDisplayed());
        soft.assertAll();
    }





}
