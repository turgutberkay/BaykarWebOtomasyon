package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.ElementUtil;

import java.text.Normalizer;

public class HomePage {

    ElementUtil elementUtil = new ElementUtil();
    private final By allOpenPositionsButton = By.linkText("Open Positions");
    private final By navbar = By.cssSelector(".nav-item.nav-link");
    private final By teknofestCloseButton = By.cssSelector(".close");
    private final By langIcon = By.cssSelector(".lang");
    private final By scrollDown = By.cssSelector(".scrollDown.js-scrollDown");

    public void clickAllOpenPositions(){elementUtil.click(allOpenPositionsButton);}

    public void clickOptionNavbar(String text){elementUtil.clickElementWithTextContainsFromElements(navbar, text);}

    public void clickTeknofestCloseButton(){elementUtil.click(teknofestCloseButton);}

    public void checkCorrectPage(String text){
        if(text.equals("HAKKIMIZDA") || text.equals("NELER YAPIYORUZ") || text.equals("GELECEGIMIZ")){
            elementUtil.checkElementFromParentForCheckCorrectPage();
        }else{
            String normalizedKeyword = Normalizer.normalize(text.toLowerCase(), Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
            if(!elementUtil.getCurrentUrl().contains(normalizedKeyword)){
                Assert.fail();
            }
        }
    }

    public void checkPageTitleText(String text){elementUtil.checkContainsGetTitle(text);}

    public void checkLangIconText(String text){elementUtil.checkElementText(langIcon, text);}

    public void checkScrollDownText(String text){elementUtil.checkElementText(scrollDown, text);}




}
