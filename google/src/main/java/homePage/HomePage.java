package homePage;

import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DataReader;
import webElement.HomePageWE;

import java.io.IOException;

public class HomePage extends HomePageWE {
    @FindBy(xpath = searchBox)public static WebElement googleSearchBox;
    public static WebElement getGoogleSearchBox(){return googleSearchBox;}
    public static void searchDataBase() throws Exception {
        for (int i = 0; i< ConnectToSqlDB.readDataBase("shuvro","search").size(); i++) {
            getGoogleSearchBox().sendKeys(ConnectToSqlDB.readDataBase("shuvro","search").get(i), Keys.ENTER);
            sleepFor(2);
            navigateBack();
            sleepFor(2);
        }
    }

    public static void searchFromExcel() throws IOException, InterruptedException {
        String[][] mat = DataReader.fileReader1("C:\\Users\\mdshu\\Downloads\\Bootcamp2020Selenium\\Google\\src\\File\\Book.xls", 0);
        for (int i = 1; i < mat.length; i++) {
            System.out.print(mat[i][0] + " ");
            driver.findElement(By.xpath(searchBox)).sendKeys(mat[i][0],Keys.ENTER);
            sleepFor(2);
            navigateBack();
            sleepFor(2);
        }
    }
}