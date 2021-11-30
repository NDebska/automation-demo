package com.google.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class SearchResultsPageObject {

    //Generic page elements
    public static SelenideElement googleLogo = $(By.className("logo"));
    public static String pageTitle = title();
    public static SelenideElement searchBox = $(By.name("q"));
    public static SelenideElement searchPanel = $(By.className("RNNXgb"));
    public static ElementsCollection resultsList = $$("#search #rso .g");

    public static SelenideElement resultOverview1 = $(By.xpath("(//div[@class='I6TXqe'])[1]"));
    public static SelenideElement resultOverview2 = $(By.xpath("(//div[@class='I6TXqe'])[2]"));
    public static SelenideElement relatedSearches = $(By.id("w3bYAd"));
    public static SelenideElement pagingBar = $(By.className("AaVjTc"));
    public static SelenideElement footer = $(By.id("footcnt"));

    //Searching with words elements
    public static SelenideElement roseWikiPage = $(By.partialLinkText("Rose - Wikipedia"));
    public static SelenideElement whaleWikiPage = $(By.partialLinkText("Beluga whale - Wikipedia"));
    public static SelenideElement loremIpsumGooglePage = $(By.partialLinkText("Typography - Page 110"));

    //Searching with numbers elements
    public static SelenideElement threeWikiPage = $(By.partialLinkText("Britney Spears - 3"));
    public static SelenideElement resultOverview3 = $(By.className("ifM9O"));
    public static SelenideElement multiNumbersPage = $(By.partialLinkText("777777777 (Number)"));
    public static SelenideElement negativeNumberResult = $(By.xpath("//*[@id='topstuff']/div/div"));
    public static SelenideElement floatWikiPage = $(By.partialLinkText("Pi - Wikipedia"));

    //Searching with special characters elements
    public static SelenideElement singleSpecialCharPage = $(By.partialLinkText("Dollar sign"));
    public static SelenideElement specialCharsPage = $(By.partialLinkText("Difference between $1 and $& in regular expressions"));
    public static SelenideElement combinedWordsNumberCharsPage = $(By.partialLinkText("Top 10 best 4x4s and off-road"));

    //Searching with autosuggestions elements
    public static SelenideElement pocketbookAutoPage = $(By.partialLinkText("Touch Lux 5 Czarny (PB628-P-WW)"));

}
