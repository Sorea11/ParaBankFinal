package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import util.DataKey;

import static actions.Actions.click;
import static actions.Actions.isDisplayed;
import static actions.Actions.sendKey;
import static org.junit.Assert.assertEquals;
import static util.ScenarioContext.getData;
import static util.ScenarioContext.saveData;
import static util.WaitUntil.waitUntilTime;

public class LoginSteps extends AbstractStep{

    @Given("User navigate to the website homepage")
    public void user_navigate_to_the_website_homepage()throws InterruptedException{
        isDisplayed(parabankHomePage.getHomePageParabankLogo());
        click(parabankHomePage.getLoginButton());
        isDisplayed(parabankHomePage.getErrorMessage());
        waitUntilTime(4000);
        click(parabankHomePage.getRegisterButton());
        sendKey(parabankHomePage.getUserNameField(),"sorin");
    }

    @When("User give {}")
    public void user_give_userName(String userName){
        saveData(DataKey.USERNAME,userName);
        assertEquals(parabankHomePage.getSighUpEasy().getText(),"Signing up is easy!");
        sendKey(parabankHomePage.getZipCode(),getData(DataKey.USERNAME).toString());
        waitUntilTime(4000);
    }
}
