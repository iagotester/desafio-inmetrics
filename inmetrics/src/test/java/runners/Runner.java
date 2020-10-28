package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		// Definindo feature a ser executada
		features = "src/main/java/features/excluir_funcionario.feature",

		// Definindo caminho onde encontrar os passos
		glue = "steps",

		// Executando feature por tags
		// tags = "@funcionario",

		// Definindo tipo do relatório
		plugin = { "pretty", "html:target/report-html" }, monochrome = true, strict =true, dryRun = false

)
public class Runner {

}
