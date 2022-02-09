package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue={"com.stepDefinition"},
       // tags= "@smoke",
        plugin = {"pretty", "html:test.output"}

)
public class FaceBookRunner {

}
