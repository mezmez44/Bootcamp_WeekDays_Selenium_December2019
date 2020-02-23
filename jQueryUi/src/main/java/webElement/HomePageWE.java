package webElement;

import common.WebAPI;

public class HomePageWE extends WebAPI {
    //CheckBoxRadio
    //Frame Handling
    public static final String xPathradioFrame = "//iframe[@class='demo-frame']";

    public static final String xPathCheckBoxRadio = "//a[contains(text(),'Checkboxradio')]";
    //RadioButton
    public static final String xPathradio1 = "//label[contains(text(),'New York')]";

    public static final String xPathradio2 = "//label[contains(text(),'Paris')]";
    //CheckBox
    public static final String xPathradio3 = "//label[contains(text(),'London')]";

    public static final String xPathRating2 = "//label[contains(text(),'2 Star')]";

    public static final String xPathRating3 = "//label[contains(text(),'3 Star')]";

    public static final String xPathRating4 = "//label[contains(text(),'4 Star')]";

    public static final String xPathRating5 = "//label[contains(text(),'5 Star')]";
    //Droppable
    //Frame Handling
    public static final String xPathDropFrame = "//iframe[@class='demo-frame']";

    public static final String xPathDroppable = "//a[contains(text(),'Droppable')]";

    public static final String xPathDragto = "//div[@id='draggable']";

    public static final String xPathDrophere = "//div[@id='droppable']";

    //Resizable

    public static final String xPathResizable = "//a[contains(text(),'Resizable')]";

    public static final String xPathResizeFrame = "//*[@id=\"content\"]/iframe";

    public static final String xPathResizeArrow = "//*[@id=\"resizable\"]/div[3]";

    public static final String xPathTabs = "//*[@id=\"sidebar\"]/aside[2]/ul/li[13]/a";

    public static final String xPathTab1 = "//a[@id='ui-id-1']";

    public static final String xPathTab2 = "//a[@id='ui-id-2']";

    public static final String xPathContribute = "//a[contains(text(),'Contribute')]";

    public static final String xPathCode = "//a[contains(text(),'Code')]";
    //Dialog

    public static final String xPathDialogTab= "//a[contains(text(),'Dialog')]";
    public static final String xPathDialogiFrame = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/iframe[1]";
    public static final String xPathDialogPopUp = "/html[1]/body[1]/div[1]";
    public static final String xPathDialogPopUpClose = "//span[@class='ui-button-icon ui-icon ui-icon-closethick']";


    public static final String xPathJQueryCalenderTab = "//a[contains(text(),'Datepicker')]";
    public static final String xPathJQueryCalenderIFrame = "//iframe[@class='demo-frame']";
    public static final String xPathJQueryCalenderbox = "//iframe[@class='demo-frame']";

    public static final String xPathJQuerySelectMenuTab = "//a[contains(text(),'Selectmenu')]";
    public static final String xPathJQuerySelectMenuIFrmae = "//iframe[@class='demo-frame']";
    public static final String xPathJQuerySelectDropDownBar = "//span[@id='speed-button']";



    public static final String xPathFacebookCreateAccount = "//*[@id=\"facebook\"]/body";
    public static final String xPathFacebookSelectDay = "//select[@id='day']";

    public static final String xPathJQueryImage = "//h2[@class='logo']//a[contains(text(),'jQuery UI')]";

    public static final String xPathPracticeSwitchWindowTab = "//button[@id='openwindow']";
    public static final String xPathPracticeOpenNewTab = "//a[@id='opentab']";
    public static final String xPathPracticeFromTabSelectSomething = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]";

    public static final String xPathPracticeAlertConfirmButton ="//input[@id='confirmbtn']";

    public static final String xPathPracticeWebElemetTable = "//table[@id='product']";
}