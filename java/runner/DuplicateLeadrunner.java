package runner;



import io.cucumber.testng.CucumberOptions;
import stepDefenition.BaseClass;


@CucumberOptions(features= "src/main/java/features/DuplicateLead.feature",glue="stepDefenition",monochrome=true,publish=true)
public class DuplicateLeadrunner extends BaseClass {

}