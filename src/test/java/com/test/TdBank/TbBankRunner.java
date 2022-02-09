package com.test.TdBank;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/tdBankAccount.feature",
        glue={"com.stepDefinition"},
        tags = "@signup",
        plugin = {"pretty", "html:test.output"}

)
public class TbBankRunner {
}
