package testHomePage;

import homePage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    @Test(priority = 1)
   public void testCheckBoxRadio() throws InterruptedException {
      PageFactory.initElements(driver, HomePage.class);
       driver.manage().window().maximize();
        sleepFor(2);
       CheckBoxRadio();
       sleepFor(2);
    }
@Test(priority = 2)
public void testCheckBox() throws InterruptedException {
    PageFactory.initElements(driver, HomePage.class);
    driver.manage().window().maximize();
    sleepFor(2);
    CheckBox();
    sleepFor(2);
}
@Test(priority = 3)
public void testDroppable() throws InterruptedException {
    PageFactory.initElements(driver, HomePage.class);
    driver.manage().window().maximize();
    sleepFor(3);
    CheckDroppable();
    sleepFor(2);
}
    @Test(priority = 4)
    public void testResizable() throws InterruptedException {

        driver.manage().window().maximize();
        sleepFor(3);
        Checkresizable();
        sleepFor(2);
    }
    @Test(priority = 5)
    public void testContibrute() throws InterruptedException {

        driver.manage().window().maximize();
        sleepFor(3);
        CheckContribute();
        sleepFor(2);
    }
    @Test(priority = 6)
    public void testIsPopUpDisplayed(){
        PageFactory.initElements(driver, HomePage.class);
        driver.manage().window().maximize();
        clickOnElement(xPathDialogTab);
        clickOnElement(xPathDialogiFrame);
        Assert.assertTrue(driver.findElement(By.xpath(xPathDialogPopUp)).isDisplayed());
    }
    @Test (priority = 7)
    public void testIsPopUpClosed() throws InterruptedException {

        clickOnElement(xPathDialogTab);
        iframeHandle(dialogiFrame);
        sleepFor(2);
        clickOnElement("//span[@class='ui-button-icon ui-icon ui-icon-closethick']");
        sleepFor(2);
        driver.switchTo().alert().accept();
    }
    @Test(priority = 8)
    public void testJQueryTitle(){

        clickOnElement(xPathJQueryImage);
        if (driver.getTitle().equals("jQuery UI")) {
            System.out.println("We are back at JQuery homepage");
        } else {
            System.out.println("We are NOT in JQuery homepage");
        }
    }
    @Test(priority = 9)
    public void testRightMouseClick() throws InterruptedException {

        sleepFor(5);
        rightClickMouse(xPathResizable);
        sleepFor(2);
    }
}
