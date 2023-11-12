package pages;

import org.openqa.selenium.WebDriver;
import pageobject.AbsPageObject;

public abstract class AbsBasePage extends AbsPageObject {

    private String BASE_URL = System.getProperty("base.url", "https://otus.ru");
    private String path ="";

    public AbsBasePage(WebDriver driver, String path) {
        super(driver);
        this.path = path;
    }

    private String normaliseBaseUrl(){
        return  BASE_URL.endsWith("/")
                ? BASE_URL.replaceAll("/$", "")
                : BASE_URL;
    }

    public void open() {
        driver.get(normaliseBaseUrl() + path);
    }
}
