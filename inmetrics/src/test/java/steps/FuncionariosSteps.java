package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;
import pages.FuncionarioPage;
import pages.LoginPage;

public class FuncionariosSteps {
	LoginPage lpage = new LoginPage();
	FuncionarioPage fpage = new FuncionarioPage();

	@Quando("^clico em NOVO FUNCIONÁRIO$")
	public void clico_em_NOVO_FUNCIONÁRIO() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		fpage.exibirNovoFuncionario();
	}

	@Quando("^submeto minhas credencias \"([^\"]*)\"  \"([^\"]*)\"$")
	public void submeto_minhas_credencias(String arg1, String arg2) throws Throwable {
	   lpage.realizarLogin(arg1, arg2);
	}

	@Quando("^preencho o formulário de cadastro \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void preencho_o_formulário_de_cadastro(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	  fpage.inserirfuncionarios(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Então("^devo visualizar a tela de registros de funcionários$")
	public void devo_visualizar_a_tela_de_registros_de_funcionários() throws Throwable {
	    
	String text = fpage.verificadorCadastroFuncionario();
	Assert.assertEquals("SUCESSO", text);
	}


@Quando("^realizo uma busca utilizando o CPF \"([^\"]*)\"$")
public void realizo_uma_busca_utilizando_o_CPF(String arg1) throws Throwable {
   fpage.pesquisarFuncionarios(arg1);
}

@Quando("^edito um funcionario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void edito_um_funcionario(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    fpage.editarFuncionarios(arg1, arg2, arg3, arg4, arg5, arg6);
}

@Então("^devo visualizar uma mensagem de sucesso$")
public void devo_visualizar_uma_mensagem_de_sucesso() throws Throwable {
	String text = fpage.verificadorEditarFuncionario();
	Assert.assertEquals("SUCESSO!", text);
}

@Quando("^removo um usuário$")
public void removo_um_usuário() throws Throwable {
fpage.excluirFuncionarios();
}



}
