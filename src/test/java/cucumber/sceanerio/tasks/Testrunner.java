package cucumber.sceanerio.tasks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\2DMap.feature",glue="cucumber.sceanerio.tasks",plugin="html:target")

public class Testrunner {

}
