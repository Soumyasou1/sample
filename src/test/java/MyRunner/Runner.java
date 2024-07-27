package MyRunner;

import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(tags="",features={"src/test/resources/Feature/login.feature"},glue= {"StepDef"}
,plugin = {"pretty","html:target/htmlreport.html"})

public class Runner 
{
	
	

}
