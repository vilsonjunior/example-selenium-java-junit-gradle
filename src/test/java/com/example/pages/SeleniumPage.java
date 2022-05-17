package com.example.pages;

import com.example.bases.BasePage;
import lombok.SneakyThrows;
import org.awaitility.Durations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.awaitility.Awaitility.await;
import static org.hamcrest.Matchers.containsString;

public class SeleniumPage extends BasePage {

    @FindBy(xpath = "//*[@class='nav-item dropdown d-none d-lg-block']//*[@id='navbarDropdown']")
    protected WebElement languageLink;

    @FindBy(xpath = "//div[@id='main_navbar']//*[contains(text(), 'Português (Brasileiro)')]")
    protected WebElement portuguesLink;

    public SeleniumPage() {
        PageFactory.initElements(driver, this);
    }

    @SneakyThrows
    public void clickInLanguageLink() {
        languageLink.click();
    }

    @SneakyThrows
    public void selectPortugueseLanguage() {
        portuguesLink.click();
        await().atMost(Durations.TWO_SECONDS)
                .until(driver.getCurrentUrl()::toString, containsString("pt-br"));
    }

    public String getLanguageSelected() {
        return languageLink.getText();
    }



}
