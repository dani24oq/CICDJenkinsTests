package test2;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test2 extends BaseTests {

    @Test
    public void getTextTest(){
        assertEquals(homePage.getText(), "World-Class Instructors and Industry Leaders");
    }
}
