package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Open {
    private WebDriver chromeDriver;
    private WebElement euroBuys;
    private WebElement dollarBuys;
    private WebElement euroCells;
    private WebElement dollarCells;

    public Open(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
    public void search(){
        euroBuys = chromeDriver.findElement(By.xpath(OpenXPath.EUR_BUYS.getXPath()));
        dollarBuys = chromeDriver.findElement(By.xpath(OpenXPath.USD_BUYS.getXPath()));
        euroCells = chromeDriver.findElement(By.xpath(OpenXPath.EUR_CELLS.getXPath()));
        dollarCells = chromeDriver.findElement(By.xpath(OpenXPath.USD_CELLS.getXPath()));
    }
    public double getValueOfMoney(WebElement money){
        return Double.parseDouble(money.getText().replace("," , "."));
    }

    public WebElement getEuroBuys() {
        return euroBuys;
    }

    public WebElement getDollarBuys() {
        return dollarBuys;
    }

    public WebElement getEuroCells() {
        return euroCells;
    }

    public WebElement getDollarCells() {
        return dollarCells;
    }
}
