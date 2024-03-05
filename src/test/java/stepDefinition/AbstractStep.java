package stepDefinition;

import lombok.Getter;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ParabankHomePage;
import util.PropretyLoader;

import java.util.logging.Logger;

@Getter
public class AbstractStep {
    public static RemoteWebDriver driverManager;
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptException executor;
    public static String chromeDriver = PropretyLoader.loadProperty("chromeDriver");
    public static String homePageUrl = PropretyLoader.loadProperty("homePageUrl");
    public ChromeOptions options = new ChromeOptions();

    public Logger log = Logger.getLogger((this.getClass().getName()));
    public ParabankHomePage parabankHomePage = new ParabankHomePage(driver);

}
