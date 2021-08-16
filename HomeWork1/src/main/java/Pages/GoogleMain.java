package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMain {
    protected WebDriver chromeDriver;
    private  WebElement filed;
    private  WebElement button;

    public GoogleMain(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
    public void search(){
        filed = chromeDriver.findElement(By.xpath(GoogleXPath.GOOGLE_FILED.getXPath()));
        button = chromeDriver.findElement(By.xpath(GoogleXPath.GOOGLE_SEARCH_BUTTON.getXPath()));
    }
    public void find(String keyFind){
        filed.click();
        filed.sendKeys(keyFind);
        button.click();
    }
}
