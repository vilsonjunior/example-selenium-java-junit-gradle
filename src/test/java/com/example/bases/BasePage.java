package com.example.bases;

import com.example.utils.ConfigProp;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BasePage extends BaseDriver {

    @BeforeEach
    public void setUpTests() {
        startBrowser();
    }

    @AfterEach
    public void tearDownTests() {
        closeBrowser();
    }

    private final ConfigProp configProp = ConfigFactory.create(ConfigProp.class);

    public String getUrlToTest() {
        return configProp.url();
    }
}
