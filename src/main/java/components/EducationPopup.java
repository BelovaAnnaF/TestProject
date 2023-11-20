package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EducationPopup extends AbsBaseCommponent implements IPopup{

    private String basePopupLocator = "//div[@class='sc-piuiz2-1 kdOQht']//p[contains(text(),'Все курсы')]";

    public EducationPopup(WebDriver driver) {
        super(driver);
    }

    @Override
    public void popupShouldNotBeVisible() {
        webDriverWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(basePopupLocator))));
    }

    @Override
    public void popupShouldBeVisible() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(basePopupLocator)));
    }
}
