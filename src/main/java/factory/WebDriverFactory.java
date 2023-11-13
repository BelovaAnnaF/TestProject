package factory;

import exeptions.DriverNotSupportedException;
import factory.impl.ChromeDriverOptions;
import factory.impl.FirefoxDriverOptions;
import factory.impl.IBrouserOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class WebDriverFactory {

    private String BROUSER_NAME = System.getProperty("browser", "chrome");

    public WebDriver newDriver(){

        if(BROUSER_NAME == null){
            throw new DriverNotSupportedException(BROUSER_NAME);
        }

        switch (BROUSER_NAME) {
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                IBrouserOptions options = new ChromeDriverOptions();
                return new ChromeDriver((ChromeOptions) options.getOptions());
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                IBrouserOptions options = new FirefoxDriverOptions();
                return new FirefoxDriver((FirefoxOptions) options.getOptions());
            }

        }
        return null;
    }
}
