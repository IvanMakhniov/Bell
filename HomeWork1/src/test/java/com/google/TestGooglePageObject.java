package com.google;

import Pages.GoogleMain;
import Pages.GoogleSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGooglePageObject extends BaseTest{
    @Test
    public void firstTestGoogle(){
        chromeDriver.get("https://www.google.com/");
        GoogleMain googleMain = new GoogleMain(chromeDriver);
        googleMain.search();
        googleMain.find("Гладиолус");
        GoogleSearch googleSearch = new GoogleSearch(chromeDriver);
        Assertions.assertTrue(googleSearch.getResultSite().stream().anyMatch(x -> x.getText().contains("Википедия")),
                "По запросу 'Гладиолус' на первой странице поиска не была обнаружена ссылка на сайт 'Википедия'.");
    }
}