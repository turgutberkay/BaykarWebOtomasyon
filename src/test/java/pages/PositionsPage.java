package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.ElementUtil;

public class PositionsPage {

    ElementUtil elementUtil = new ElementUtil();

    private final By titleText = By.cssSelector(".col-lg-12.col-md-12");
    private final By unitJobs = By.cssSelector(".checkbox");
    private final By searchForJobTextbox = By.id("myInput");
    private final By allPositionsName = By.cssSelector(".position-head");

    public void checkTitleText(String text){elementUtil.checkElementText(titleText, text);}

    public void clickUnitCheckbox(String text){elementUtil.clickElementWithTextContainsFromElements(unitJobs,text);}

    public void checkSelectedCheckbox(String text){elementUtil.checkSelectedWithTextContainsFromElements(unitJobs,text);}

    public void clickSearchForJobTextbox(){elementUtil.click(searchForJobTextbox);}

    public void sendKeysSearchForJobTextbox(String text){elementUtil.sendKey(searchForJobTextbox,text);}

    public void checkAllPositionsContainTextNames(String text){elementUtil.checkAllElementContainsTextFromElements(allPositionsName,text);}




}
