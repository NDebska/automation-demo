package com.google.searchresults;

import com.codeborne.selenide.CollectionCondition;
import com.google.base.BaseUITest;
import org.testng.annotations.Test;

import static com.google.pageobjects.HomePageObject.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.google.pageobjects.SearchResultsPageObject.*;

public class SearchWithWords extends BaseUITest {

    @Test
    public void searchingWithSingleKeywordInLowercaseWithEnter() {
        //enter a keyword and press Enter
        inputValueAndPressEnter("rose");
        //assertions
        pageTitle.equalsIgnoreCase("rose - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        roseWikiPage.shouldHave(text("Rose - Wikipedia"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        resultOverview1.shouldBe(visible);
        resultOverview2.shouldNotBe(visible);
        relatedSearches.shouldBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }

    @Test
    public void searchingWithSingleKeywordInLowercaseWithSearchButton() {
        //enter a keyword
        inputBox.setValue("rose");
        //click "Search Results" button with autosuggestions displayed
        clickSearchButtonWithAutoSuggestions();
        //assertions
        pageTitle.equalsIgnoreCase("rose - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        roseWikiPage.shouldHave(text("Rose - Wikipedia"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        resultOverview1.shouldBe(visible);
        resultOverview2.shouldNotBe(visible);
        relatedSearches.shouldBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }

    @Test
    public void searchingWithTwoKeywordsInLowercase() {
        //enter a keyword and press Enter
        inputValueAndPressEnter("white whale");
        //assertions
        pageTitle.equalsIgnoreCase("white whale - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        whaleWikiPage.shouldHave(text("Beluga whale - Wikipedia"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        resultOverview1.shouldBe(visible);
        resultOverview2.shouldBe(visible);
        relatedSearches.shouldBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }

    @Test
    public void searchingWithTwoKeywordsInUppercase() {
        //enter a keyword and press Enter
        inputValueAndPressEnter("WHITE WHALE");
        //assertions
        pageTitle.equalsIgnoreCase("white whale - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        whaleWikiPage.shouldHave(text("Beluga whale - Wikipedia"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        resultOverview1.shouldBe(visible);
        resultOverview2.shouldBe(visible);
        relatedSearches.shouldBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }

    @Test
    public void searchingWithMultipleKeywordsAndCharacters() {
        //enter a keyword and press Enter
        inputValueAndPressEnter("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean velit magna, " +
                "viverra eu pellentesque in, ullamcorper id tortor. Fusce pharetra convallis sodales. " +
                "Cras ornare sem in nisl vulputate interdum. Suspendisse id orci dictum, tincidunt odio in, " +
                "ornare justo. Nulla vel consequat risus. Nunc ultricies lacus faucibus orci ultrices, " +
                "at hendrerit eros egestas. Maecenas fringilla, odio non finibus blandit, metus velit porta ligula, " +
                "eget tristique nisi diam vel magna.");
        //assertions
        pageTitle.equalsIgnoreCase("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean velit magna," +
                " viverra eu pellentesque in, ullamcorper id tortor. Fusce pharetra convallis sodales. Cras ornare sem in nisl" +
                " vulputate interdum. Suspendisse id orci dictum, tincidunt odio in, ornare justo. Nulla vel consequat risus. Nunc" +
                " ultricies lacus faucibus orci ultrices, at hendrerit eros egestas. Maecenas fringilla, odio non finibus blandit," +
                " metus velit porta ligula, eget tristique nisi diam vel magna. - Google Search");
        googleLogo.shouldBe(visible);
        searchPanel.shouldBe(visible);
        loremIpsumGooglePage.shouldHave(text("Typography - Page 110 - Google Books Result"));
        resultsList.shouldHave((CollectionCondition.sizeGreaterThan(5)));
        resultOverview1.shouldNotBe(visible);
        resultOverview2.shouldNotBe(visible);
        relatedSearches.shouldBe(visible);
        pagingBar.shouldBe(visible);
        footer.shouldBe(visible);

    }

}
