package runner;



import io.cucumber.testng.CucumberOptions;
import stepDefenition.BaseClass;


@CucumberOptions(features= "src/main/java/features/EditLead.feature",glue="stepDefenition",monochrome=true,publish=true)
public class Editleadrunner extends BaseClass {

}
