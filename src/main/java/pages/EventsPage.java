package pages;

import components.EducationPopup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class EventsPage extends AbsBasePage{

    private String eventsCardElementLocator ="//div[@class='dod_new-event-content']";
    private Logger log = LogManager.getLogger();

    public EventsPage(WebDriver driver) {
        super(driver);
    }
    public void openEventsPage(){
        EducationPopup educationPopup = new EducationPopup(driver);
        Actions actions = new Actions(driver);
        WebElement educationElement = driver.findElement(By.xpath("//span[@title='Обучение']"));
        actions.moveToElement(educationElement);
        actions.perform();
        driver.findElement(By.xpath("//a[contains(text(),'Календарь мероприятий')]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dod_new-header__title']")));
    }
    public void eventsPageContainsCards(){

        if (eventsList().size() > 0){
            log.info("На странице есть мероприятия");
        }else {
            log.info("На странице нет мероприятий");
        }

    }

    public void scrollEventsPage(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
//Описание метода: https://automated-testing.info/t/prolistyvanie-scrolling-straniczy-s-pomoshhyu-javascript-v-pomoshh-veb-avtomatizatoram/3781
            js.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight," +
                    "document.body.scrollHeight,document.documentElement.clientHeight));");

    }


    protected List<WebElement> eventsList(){
        return driver.findElements(By.xpath(eventsCardElementLocator));
    }


}
