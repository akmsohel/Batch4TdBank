package apiRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/main/resources/apiFeatures",
        glue={"com.apiStepDef"},
        //tags="@positive,@negative",
        plugin={"pretty","html:test.output"}
)
public class PetPostRunner {
}
