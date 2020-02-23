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

    @FindBy(xpath = xPathResizable)
    WebElement Resizable;
    public void Checkresizable() throws InterruptedException {
        clickByXpath(xPathResizable);
        //iframeHandle(ResizeFrame);
        sleepFor(5);
       resizeElement(xPathResizeFrame,xPathResizeArrow);
        sleepFor(5);
    }
    @FindBy(xpath = xPathContribute)
    WebElement Contiribute;
    public void CheckContribute() throws InterruptedException {
        sleepFor(3);
        mouseHoverByXpath(xPathContribute);
        sleepFor(3);
        clickByXpath(xPathCode);
        sleepFor(3);
    }
    @FindBy(xpath = xPathTabs)
    WebElement Tabs;
    public void CheckTabs() throws InterruptedException {
        sleepFor(3);
        clickByXpath(xPathTabs);

    }
    @FindBy(how = How.XPATH, using = xPathDialogiFrame)
    public static WebElement dialogiFrame;

    public static WebElement getDialogiFrame(){
        return dialogiFrame;
    }

    @FindBy(how = How.XPATH, using = xPathJQuerySelectMenuIFrmae)
    public static WebElement selectMenuIFrame;
    public static WebElement getSelectMenuIFrame(){
        return selectMenuIFrame;
    }
    @FindBy(how= How.XPATH, using = xPathJQueryCalenderIFrame)
    public static WebElement calenderIFrame;
    public static WebElement getCalenerIFrame(){
        return calenderIFrame;
    }
    @FindBy(how = How.XPATH, using = xPathPracticeOpenNewTab)
    public static WebElement practiceOpenNewTab;
    public static WebElement getPracticeOpenNewTab(){
        return practiceOpenNewTab;
    }


}
