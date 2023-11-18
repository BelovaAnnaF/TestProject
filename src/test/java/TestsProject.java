import factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.TestsCoursesPages;

public class TestsProject{

    private WebDriver driver;

    @BeforeEach
    public void init(){
        driver = new WebDriverFactory().newDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.mainPageWaitDownload();
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
//1 Пользователь переходит в разделе тестирование
        TestsCoursesPages testsCoursesPages = new TestsCoursesPages(driver);
        testsCoursesPages.openTestPajes();
//2 На странице отображаются карточки курсов. Количество карточек равно 10
        testsCoursesPages.chekingPajeContains();
        testsCoursesPages.checkCoursesListCount();
    }

    @Test
    public void chekingTestCours(){
//    Просмотр карточки курса
//открыли страницу курсов
        TestsCoursesPages testCoursesPages = new TestsCoursesPages(driver);
        testCoursesPages.openTestPajes();
        testCoursesPages.chekingPajeContains();

//1 Пользователь переходит на карточку курса

//2 В карточке указана информация о курсе:
//    Название
//            Описание
//    Длительность обучения
//    Формат // Минимально достаточное - проверить одну карточку. В идеале все в разделе тестирования.
    }


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
