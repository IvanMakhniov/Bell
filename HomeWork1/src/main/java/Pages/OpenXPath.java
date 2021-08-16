package Pages;

public enum OpenXPath {
    TESTING_SITE("//*[@class='yuRUbf']//*[@class='iUh30 Zu0yb tjvcx']"),
    USD_BUYS("//*[text() = 'USD']/ancestor::*[@class = 'main-page-exchange__row main-page-exchange__row--with-border']/td[2]//span"),
    EUR_BUYS("//*[text() = 'EUR']/ancestor::*[@class = 'main-page-exchange__row main-page-exchange__row--with-border']/td[2]//span"),
    USD_CELLS("//*[text() = 'USD']/ancestor::*[@class = 'main-page-exchange__row main-page-exchange__row--with-border']/td[4]//span"),
    EUR_CELLS("//*[text() = 'EUR']/ancestor::*[@class = 'main-page-exchange__row main-page-exchange__row--with-border']/td[4]//span");

    private final String xPath;
    OpenXPath(String xPath) {
        this.xPath=xPath;
    }
    public String getXPath(){
        return xPath;
    }
}
