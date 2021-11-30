package com.google.searchresults;

import com.codeborne.selenide.CollectionCondition;
import com.google.base.BaseUITest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.google.pageobjects.HomePageObject.*;
import static com.google.pageobjects.SearchResultsPageObject.*;
import static com.google.pageobjects.SearchResultsPageObject.footer;

public class SearchWithAutoSuggestions extends BaseUITest {

    @Test
    public void searchingWithAutoSuggestions() {
        //enter a value and press Enter
        inputBox.setValue("pocketbook ");
        autoSuggestionList.shouldBe(visible);
        //select element from auto-suggestions
        selectElementFromAutoSuggestionList();
        //assertions
        pageTitle.equalsIgnoreCase("PocketBook Touch Lux 5 - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        pocketbookAutoPage.shouldHave(text("PocketBook Touch Lux 5 Czarny (PB628-P-WW) - Ceneo"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        relatedSearches.shouldBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }
}
