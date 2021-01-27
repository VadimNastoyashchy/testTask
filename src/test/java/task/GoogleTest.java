package task;

import org.junit.Assert;
import org.junit.Test;
import task.pages.GoogleResultsPage;
import task.pages.GoogleSearchPage;

/**
 * @author Vadym Nastoiashchyi
 */

public class GoogleTest extends BaseTest {

    @Test
    public void verifyContainsWordFirstLinkTitleOnGoogleResultPages() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage("Chrome");
        GoogleResultsPage googleResultsPage = googleSearchPage.
                search("https://www.google.com/", "automation");
        googleResultsPage.goToFirstLink();
        Assert.assertTrue(googleResultsPage.getPageTitle().contains("automation"));
    }

    @Test
    public void verifyWordIsExpectedDomainOnGoogleResultPages() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage("Chrome");
        GoogleResultsPage googleResultsPage = googleSearchPage.
                search("https://www.google.com/", "automation");
        googleResultsPage.searchContainsDomainInPages(5, "automation");
    }

}






