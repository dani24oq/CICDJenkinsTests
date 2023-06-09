import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import static java.util.concurrent.TimeUnit.SECONDS;


public class FirstJenkinsTests {

    private WebDriver driver;

    @Test
    public void testEasy(){
        goHome();
        driver.manage().window().maximize(); //Maximize the browser window

        String title = driver.getTitle();
        AssertJUnit.assertEquals(title, "Test Automation University | Applitools");
    }

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100, SECONDS);

    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

    public void goHome(){
        driver.get("https://testautomationu.applitools.com/"); //Open the URL
    }

}
