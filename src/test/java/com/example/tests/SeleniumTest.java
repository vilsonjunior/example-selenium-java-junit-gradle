package com.example.tests;

import com.example.bases.BasePage;
import com.example.pages.SeleniumPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SeleniumTest extends BasePage {

    @Test
    @DisplayName("Test open Selenium page and modify language for pt-br")
    public void test() {
        SeleniumPage seleniumPage = new SeleniumPage();
        getDriver().get(getUrlToTest());
        seleniumPage.clickInLanguageLink();
        seleniumPage.selectPortugueseLanguage();
        assertThat(seleniumPage.getLanguageSelected(), equalTo("Português (Brasileiro)"));
    }
}
