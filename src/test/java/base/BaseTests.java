package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;


public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

//        driver.manage().timeouts().implicitlyWait(10, SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(100, SECONDS);

        goHome();
        driver.manage().window().maximize(); //Maximize the browser window
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void afterTest(){
        driver.quit();
    }

    public void goHome(){
        driver.get("https://testautomationu.applitools.com/"); //Open the URL
    }

}
