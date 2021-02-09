package google;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author Vadym Nastoiashchyi
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/",
        tags = "@containsTitle",
        plugin = "pretty")
public class ContainsTitleTest {
}
