package cucumber.sceanerio.tasks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/2DMap.feature",glue="cucumber.sceanerio.tasks",plugin={"json:target/cucumber.json","rerun:src/test/resources/Feature/failed.txt"})

public class Testrunner {

}
