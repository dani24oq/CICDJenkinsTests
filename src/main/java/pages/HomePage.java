package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final By h1Label = By.cssSelector("div.shadow-sm.animated.fadeIn > h1");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getText(){
        return driver.findElement(h1Label).getText();
    }
}
