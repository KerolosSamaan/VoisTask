package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.runtime.model.CallFrame;
import org.openqa.selenium.interactions.Actions;
import pages.P04_BlousesInWomen;

import javax.swing.*;

public class D04_BlousesInWomen extends P04_BlousesInWomen {

    @And("user CLick on women tab")
    //public void Click_On_WomanTap(){WomenTab().click();}
     public void hover()throws InterruptedException{

        Actions action = new Actions(Hooks.driver);
        action.moveToElement(WomenTab()).perform();
        Thread.sleep(1000);
    }

    @Then("user click on Blouses tab")
    public void Click_On_BlousesTap(){BlousesTab().click();}
}
