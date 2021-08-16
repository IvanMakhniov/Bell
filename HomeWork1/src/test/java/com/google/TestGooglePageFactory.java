package com.google;

import Pages.GooglePageFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class TestGooglePageFactory extends BaseTest {
    @Test
    public void testGooglePageFactory(){
        chromeDriver.get("https://www.google.com/");
        GooglePageFactory pageFactory = PageFactory.initElements(chromeDriver, GooglePageFactory.class);
        pageFactory.find("Гладиолус");
        Assertions.assertTrue(pageFactory.getAllElement().stream().anyMatch(x -> x.getText().contains("Википедия")),
                "По запросу 'Гладиолус' на первой странице поиска не была обнаружена ссылка на сайт 'Википедия'.");
    }
}
