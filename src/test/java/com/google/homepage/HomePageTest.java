package com.google.homepage;

import com.google.base.BaseUITest;

import static com.codeborne.selenide.Condition.visible;
import static com.google.pageobjects.HomePageObject.*;
import org.testng.annotations.Test;

public class HomePageTest extends BaseUITest {

    @Test
    public void verifyHomePageIsLoadedSuccessfully() {
        logo.shouldBe(visible);
        signInPanel.shouldBe(visible);
        searchSection.shouldBe(visible);
        searchButton.shouldBe(visible);
        inputBox.shouldBe(visible);
        homePageFooter.shouldBe(visible);

    }

}
