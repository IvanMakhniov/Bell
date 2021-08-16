package com.google;

import Pages.GoogleMain;
import Pages.GoogleSearch;
import Pages.Open;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOpenPageObject extends BaseTest{
    @Test
    public void testOpen(){
        chromeDriver.get("https://www.google.com/");
        GoogleMain googleMain = new GoogleMain(chromeDriver);
        googleMain.search();
        googleMain.find("Открытие");
        GoogleSearch googleSearch = new GoogleSearch(chromeDriver);
        Assertions.assertTrue(googleSearch.getResultLink().stream().anyMatch(x -> x.getText().contains("https://www.open.ru")),
                "В результате поиска не было обнаружено сайта 'https://www.open.ru'.");
        googleSearch.clikLink();
        Open open = new Open(chromeDriver);
        open.search();
        Assertions.assertTrue(open.getValueOfMoney(open.getDollarBuys()) < open.getValueOfMoney(open.getDollarCells()),
                "Для USD курс продажи меньше чем курс покупки");
        Assertions.assertTrue(open.getValueOfMoney(open.getEuroBuys()) < open.getValueOfMoney(open.getEuroCells()),
                "Для EUR курс продажи меньше чем курс покупки");
    }
}
