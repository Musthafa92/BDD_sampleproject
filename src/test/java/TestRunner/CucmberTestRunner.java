
  package TestRunner;
  
  import io.cucumber.testng.AbstractTestNGCucumberTests; import
  io.cucumber.testng.CucumberOptions;
  
  @CucumberOptions(tags="", features= {"src/test/resources/Features"}, glue=
  {"StepDefination"}, plugin={"pretty","html:target/htmlreports.html"})
  
  public class CucmberTestRunner extends AbstractTestNGCucumberTests {
  
  }
 