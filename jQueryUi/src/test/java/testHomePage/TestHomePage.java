package testHomePage;

import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    @Test
   public void testCheckBoxRadio() throws InterruptedException {
      HomePage home = PageFactory.initElements(driver, HomePage.class);
       driver.manage().window().maximize();
        sleepFor(2);
        home.CheckBoxRadio();
       sleepFor(2);
    }
@Test
public void testCheckBox() throws InterruptedException {
    HomePage home = PageFactory.initElements(driver, HomePage.class);
    driver.manage().window().maximize();
    sleepFor(2);
    home.CheckBox();
    sleepFor(2);
}
@Test
public void testDroppable() throws InterruptedException {
    HomePage home = PageFactory.initElements(driver, HomePage.class);
    driver.manage().window().maximize();
    sleepFor(3);
    home.CheckDroppable();
    sleepFor(2);
}
}
