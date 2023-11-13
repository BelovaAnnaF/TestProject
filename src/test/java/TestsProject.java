import factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class TestsProject {

    private WebDriver driver;

    @BeforeEach
    public void init(){
        driver = new WebDriverFactory().newDriver();
    }

    @AfterEach
    public void close() {
        if(this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }
    }


    @Test
//    Проверка количества курсов в разделе тестирование:
    public void checkingCountTestCourses() {
        new MainPage(driver).open();
//1 Пользователь переходит в разделе тестирование //section[@class='sc-10izyea-0 kZwiYW']//div[text() = 'Тестирование']

//2 На странице отображаются карточки курсов. Количество карточек равно 10 //div[@class='sc-18q05a6-1 bwGwUO']/a
    }

//    @Test
//    Просмотр карточки курса:
//            1 Пользователь переходит на карточку курса
//2 В карточке указана информация о курсе:
//    Название
//            Описание
//    Длительность обучения
//    Формат // Минимально достаточное - проверить одну карточку. В идеале все в разделе тестирования.

//    @Test
//    Валидация дат предстоящих мероприятий:
//            1 Пользователь переходит в раздел События -> Календарь мероприятий
//2 На странице отображаются карточки предстоящих мероприятий.
//            3 Даты проведения мероприятий больше или равны текущей дате

//    @Test
//    Просмотр мероприятий по типу:
//            1 Пользователь переходит в раздел События -> Календарь мероприятий
//2 Пользователь сортирует мероприятия по типу Открытые вебинары
//3 На странице отображаются карточки предстоящих мероприятий. На каждой карточке в типе указанно "Открытые вебинары"

}
