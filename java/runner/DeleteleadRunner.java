package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefenition.BaseClass;


@CucumberOptions(features= "src/main/java/features/Deletelead.feature",glue="stepDefenition",monochrome=true,publish=true)
public class DeleteleadRunner extends BaseClass {

}
