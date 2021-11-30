package com.google.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomePageObject {

    public static SelenideElement logo = $(By.className("lnXdpd"));
    public static SelenideElement signInPanel = $(By.xpath("//div[@class='LX3sZb']/div/div"));
    public static SelenideElement inputBox = $(By.name("q"));
    public static SelenideElement searchButton = $(By.xpath("//div[@class='A8SBwf']/div/center/input[1]"));
    public static SelenideElement searchSection = $(By.className("RNNXgb"));
    public static SelenideElement homePageFooter =$(By.xpath("(//*[contains(@class,'KxwPGc')])[1]"));
    public static SelenideElement autoSuggestionList = $(By.className("OBMEnb"));

    public static void inputValueAndPressEnter(String keyword) {
        inputBox.shouldBe(visible).setValue(keyword).pressEnter();
    }

    public static void selectElementFromAutoSuggestionList() {
        $(By.xpath("(//*[contains(@class,'wM6W7d')])[1]")).click();
    }

    public static void clickSearchButton() {
        searchButton.shouldBe(visible).click();
    }

    public static void clickSearchButtonWithAutoSuggestions() {
        $(By.xpath("//div[@class='lJ9FBc']/center/input[1]")).shouldBe(visible).click();
    }


}
