package webElement;

import common.WebAPI;

public class HomePageWE extends WebAPI {
//CheckBoxRadio
    //Frame Handling
    public static final String xPathradioFrame="//iframe[@class='demo-frame']";

    public static final String xPathCheckBoxRadio="//a[contains(text(),'Checkboxradio')]";
    //RadioButton
    public static final String xPathradio1 = "//label[contains(text(),'New York')]";

    public static final String xPathradio2 ="//label[contains(text(),'Paris')]";
    //CheckBox
    public static final String xPathradio3 ="//label[contains(text(),'London')]";

    public static final String xPathRating2="//label[contains(text(),'2 Star')]";

    public static final String xPathRating3="//label[contains(text(),'3 Star')]";

    public static final String xPathRating4="//label[contains(text(),'4 Star')]";

    public static final String xPathRating5="//label[contains(text(),'5 Star')]";
//Droppable
    //Frame Handling
    public  static final String xPathDropFrame="//iframe[@class='demo-frame']";

    public static final String xPathDroppable="//a[contains(text(),'Droppable')]";

    public static final String xPathDragto="//div[@id='draggable']";

    public static final String xPathDrophere="//div[@id='droppable']";
}
