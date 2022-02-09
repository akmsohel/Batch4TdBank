package apiRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/main/resources/pojoPetApiFeatures",
        glue={"com.pojoPetApiStepDef"},
      //  tags="@positive",
        plugin={"pretty","html:test.output"}
)
public class pojoApiPetRunner {

}
