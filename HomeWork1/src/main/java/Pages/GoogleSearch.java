package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearch extends GoogleMain {
    private List<WebElement> result;
    private WebElement Link;

    public GoogleSearch(WebDriver chromeDriver) {
        super(chromeDriver);
    }
    public List<WebElement> getResultSite(){
        result = chromeDriver.findElements(By.xpath(String.valueOf(GoogleXPath.SITE_NAME.getXPath())));
        return result;
    }
    public List<WebElement> getResultLink(){
        result = chromeDriver.findElements(By.xpath(String.valueOf(GoogleXPath.LINK_NAME.getXPath())));
        return result;
    }
    public void clikLink(){
        this.Link = chromeDriver.findElement(By.xpath(OpenXPath.TESTING_SITE.getXPath()));
        this.Link.click();

    }
}
