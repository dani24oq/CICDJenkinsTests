package test1;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test1 extends BaseTests {

    @Test
    public void getTitleTest(){
        assertEquals(homePage.getTitle(), "Test Automation University | Applitools");
    }

}
