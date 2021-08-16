package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GooglePageFactory {
    private WebDriver chromeDriver;

    @FindBy(how = How.NAME, name = "q")
    WebElement filed;
    @FindBy(how = How.NAME, name = "btnK")
    WebElement button;
    @FindBy(how = How.XPATH, xpath = "//*[@class='yuRUbf']//*[@class='LC20lb DKV0Md']")
    List<WebElement> allElement;

    public GooglePageFactory(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
    public void find(String keysFind){
        filed.click();
        filed.sendKeys(keysFind);
        button.click();
    }
    public List<WebElement> getAllElement(){
        return allElement;
    }
}
