package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import webElement.HomePageWE;

public class HomePage extends HomePageWE {

    @FindBy(how= How.XPATH, using = xPathradioFrame)
            public static WebElement radioFrame;
            public static WebElement getRadioFrame(){
                return radioFrame;
            }
            @FindBy(xpath = xPathCheckBoxRadio)
        WebElement Radio;
        public void CheckBoxRadio() throws InterruptedException {
            clickByXpath(xPathCheckBoxRadio);
           iframeHandle(radioFrame);
           sleepFor(2);
            radioButton(xPathradio1);
            sleepFor(2);
            radioButton(xPathradio2);
            sleepFor(2);
            radioButton(xPathradio3);
        }
    @FindBy(xpath = xPathCheckBoxRadio)
    WebElement BoxRadio;
    public void CheckBox() throws InterruptedException {
        clickByXpath(xPathCheckBoxRadio);
        iframeHandle(radioFrame);
        sleepFor(5);
       CheckBox(xPathRating2);
       sleepFor(5);
       CheckBox(xPathRating3);
       sleepFor(5);
       CheckBox(xPathRating4);
       sleepFor(5);
       CheckBox(xPathRating5);

    }
    @FindBy(how= How.XPATH, using = xPathDropFrame)
    public static WebElement DropFrame;
    public static WebElement getDropFrame(){
        return DropFrame;
    }
    @FindBy(xpath = xPathDroppable)
    WebElement Droppable;
    public void CheckDroppable() throws InterruptedException {
        clickByXpath(xPathDroppable);
        iframeHandle(DropFrame);
        sleepFor(5);
        dragAndDrop(xPathDragto,xPathDrophere);
        sleepFor(5);
    }

}
