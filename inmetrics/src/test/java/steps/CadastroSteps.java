package steps;

import org.openqa.selenium.By;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;
import pages.CadastroPage;
import pages.LoginPage;
import util.TesteBase;

public class CadastroSteps extends TesteBase {
	CadastroPage cpage= new CadastroPage();
	LoginPage lpage = new LoginPage();
	
	@Dado("^clico no link de cadastro$")
	public void clico_no_link_de_cadastro() throws Throwable {
	 cpage.exibirCadastroLinkInferior();
	  
	}

	@Quando("^preencho o formulario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void preencho_o_formulario(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cpage.InserirCadastro(arg1,arg2,arg3);
	}

	@Então("^devo acessar o sistema \"([^\"]*)\" \"([^\"]*)\"$")
	public void devo_acessar_o_sistema(String arg1, String arg2) throws Throwable {
	   lpage.realizarLogin(arg1, arg2);
	}
	
	@Então("^visualizar a tela inicial$")
	public void visualizar_a_ela_inicial() throws Throwable {
	  lpage.verificadorTelaLogin();
	}


}


