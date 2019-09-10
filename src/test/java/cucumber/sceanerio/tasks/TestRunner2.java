package cucumber.sceanerio.tasks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src/test/resources/Feature/failed.txt",glue="cucumber.sceanerio.tasks",plugin={"html:target", "json:target"})

public class TestRunner2 {

}
