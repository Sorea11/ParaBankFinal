package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ParabankHomePage extends PageObjects {

    @FindBy(xpath ="//body/div[@id='mainPanel']/div[@id='topPanel']/a[2]/img[1]")
    WebElement homePageParabankLogo;

    @FindBy(xpath = "//input[@value = 'Log In']")
    WebElement loginButton;

    @FindBy(xpath = "//p[contains(text(),'Please enter a username and password.')]")
    WebElement errorMessage;

    @FindBy(xpath = "//input[@name='username']")
    WebElement loginField;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerButton;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement userNameField;

    @FindBy(xpath = "//h1[@class='title']")
    WebElement sighUpEasy;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    WebElement zipCode;



    public ParabankHomePage(WebDriver driver) {
        super(driver);
    }
}
