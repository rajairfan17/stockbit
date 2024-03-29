package cucumber.runner;

import id.stockbit.core.utility.SeleniumConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"classpath:cucumber/stepdefinitions"},
        features = {"src/test/java/cucumber/features"})
public class StockbitRunner {
    @BeforeClass
    public static void seleniumInitialization(){SeleniumConfig.initConfiguration();}
}
