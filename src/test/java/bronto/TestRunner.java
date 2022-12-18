package bronto;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features"},
		glue = {"cucumber"},
		tags = "@myFirstCucumberTest_4",
		plugin= {"json:target/puneet/jsonReport.json","html:target/puneet/html/htlReport.html"}
		)
public class TestRunner {

}
