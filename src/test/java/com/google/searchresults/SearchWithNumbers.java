package com.google.searchresults;

import com.codeborne.selenide.CollectionCondition;
import com.google.base.BaseUITest;
import org.testng.annotations.Test;

import static com.google.pageobjects.HomePageObject.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.google.pageobjects.SearchResultsPageObject.*;

public class SearchWithNumbers extends BaseUITest {

    @Test
    public void searchingWithSingleInt() {
        //enter a value and press Enter
        inputValueAndPressEnter("3");
        //assertions
        pageTitle.equalsIgnoreCase("3 - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        threeWikiPage.shouldHave(text("Britney Spears - 3 (Official HD Video) - YouTube"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        //resultOverview3.shouldBe(visible);
        relatedSearches.shouldBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }

    @Test
    public void searchingWithMultipleInts() {
        //enter a value and press Enter
        inputValueAndPressEnter("777777777");
        //assertions
        pageTitle.equalsIgnoreCase("777777777 - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        multiNumbersPage.shouldHave(text("777777777 (Number) - MetaNumbers"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        relatedSearches.shouldNotBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }

    @Test
    public void searchingWithNegativeNumber() {
        //enter a value and press Enter
        inputValueAndPressEnter("-138");
        //assertions
        pageTitle.equalsIgnoreCase("-138 - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        negativeNumberResult.shouldHave(text("Your search - -138 - did not match any documents. "));
        relatedSearches.shouldNotBe(visible);
        pagingBar.shouldNotBe(visible);
        footer.shouldBe(visible);

    }

    @Test
    public void searchingWithSingleFloat() {
        //enter a value and press Enter
        inputValueAndPressEnter("3.14");
        //assertions
        pageTitle.equalsIgnoreCase("3.14 - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        floatWikiPage.shouldHave(text("Pi - Wikipedia"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        relatedSearches.shouldNotBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }

}
