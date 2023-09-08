package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefenition.BaseClass;


@CucumberOptions(features= "src/main/java/features/CreateLead.feature",glue="stepDefenition",monochrome=true,publish=true)
public class Createleadrunner extends BaseClass {

}
