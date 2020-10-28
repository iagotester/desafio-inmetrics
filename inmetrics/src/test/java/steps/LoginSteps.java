package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import junit.framework.Assert;
import pages.FuncionarioPage;
import pages.LoginPage;
import util.TesteBase;

public class LoginSteps extends TesteBase {
LoginPage lpage = new LoginPage();
FuncionarioPage fpage = new FuncionarioPage();


@Dado("^que acesso a página principal$")
public void que_acesso_a_página_principal() throws Throwable {
	//inicializar o navegador
   TesteBase.iniciar();
}


@Quando("^submeto minhas credencias  \"([^\"]*)\"  \"([^\"]*)\"$")
public void submeto_minhas_credencias(String arg1, String arg2) throws Throwable {
	lpage.realizarLogin(arg1, arg2);
  
}

@Então("^a tela inicial deverá ser exibida$")
public void a_tela_inicial_deverá_ser_exibida() throws Throwable {
String texto = fpage.verificadorTelaFuncionarios();
Assert.assertEquals("FUNCIONÁRIOS", texto);
}

}
