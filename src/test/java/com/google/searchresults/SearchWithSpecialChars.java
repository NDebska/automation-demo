package com.google.searchresults;

import com.codeborne.selenide.CollectionCondition;
import com.google.base.BaseUITest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.google.pageobjects.HomePageObject.*;
import static com.google.pageobjects.SearchResultsPageObject.*;

public class SearchWithSpecialChars extends BaseUITest {
    SoftAssert sa = new SoftAssert();

    @Test
    public void searchingWithSingleSpecialChars() {
        //enter a value and press Enter
        inputValueAndPressEnter("$");
        //assertions
        pageTitle.equalsIgnoreCase("$ - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        singleSpecialCharPage.shouldHave(text("Dollar sign - Wikipedia"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        relatedSearches.shouldNotBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }

    @Test
    public void searchingWithMultipleSpecialChars() {
        //enter a value and press Enter
        inputValueAndPressEnter("$&^");
        //assertions
        pageTitle.equalsIgnoreCase("$&^ - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        specialCharsPage.shouldHave(text("Difference between $1 and $& in regular expressions - Stack ..."));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        relatedSearches.shouldNotBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }
    @Test
    public void searchingWithWordsAndNumbersAndSpecialCharsCombined() {
        //enter a value and press Enter
        inputValueAndPressEnter("#1 off road vehicle 2020!");
        //assertions
        pageTitle.equalsIgnoreCase("#1 off road vehicle 2020! - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        combinedWordsNumberCharsPage.shouldHave(text("Top 10 best 4x4s and off-road cars 2021 | Autocar"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        relatedSearches.shouldBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }

    @Test
    public void searchingWithEmptySearchBoxWithSearchButton () {
        sa.assertTrue(inputBox.isDisplayed());
        //click search button
        clickSearchButton();
        //soft assertions
        sa.assertTrue(pageTitle.equalsIgnoreCase("Google"), "Page title should be 'Google'");
        sa.assertTrue(searchPanel.isDisplayed(), "Search box should be displayed");
        sa.assertFalse(relatedSearches.isDisplayed(), "Related searches should not be displayed");
        sa.assertFalse(pagingBar.isDisplayed(), "Paging bar should not be displayed");
        sa.assertTrue(homePageFooter.isDisplayed(), "Footer should be displayed");
        System.out.println("assertions done");
        sa.assertAll();

    }

    @Test
    public void searchingWithEmptySearchBoxWithEnter () {
        inputBox.shouldBe(visible).pressEnter();
        //assertions
        pageTitle.equalsIgnoreCase("Google");
        searchPanel.shouldBe(visible);
        relatedSearches.shouldNotBe(visible);
        pagingBar.shouldNotBe(visible);
        homePageFooter.shouldBe(visible);

    }

    @Test
    public void searchingWithSpaceAsInputWithSearchButton () {
        inputBox.shouldBe(visible);
        clickSearchButton();
        //assertions
        pageTitle.equalsIgnoreCase("Google");
        searchPanel.shouldBe(visible);
        relatedSearches.shouldNotBe(visible);
        pagingBar.shouldNotBe(visible);
        homePageFooter.shouldBe(visible);

    }

    @Test
    public void searchingWithSpaceAsInputWithEnter () {
        inputBox.shouldBe(visible).setValue(" ").pressEnter();
        //assertions
        pageTitle.equalsIgnoreCase("Google");
        searchPanel.shouldBe(visible);
        relatedSearches.shouldNotBe(visible);
        pagingBar.shouldNotBe(visible);
        homePageFooter.shouldBe(visible);

    }
}
