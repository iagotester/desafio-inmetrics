package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TesteBase;

public class CadastroPage extends TesteBase {
	
	@FindBy(name = "username")
	WebElement usuario;

	@FindBy(name = "pass")
	WebElement senha;

	@FindBy(name = "confirmpass")
	WebElement confirme;

	@FindBy(xpath = "//button[contains(text(),'Cadastrar')]")
	WebElement btnCadastrar;

	@FindBy(css = "a[href*=\"/accounts/signup/\"]")
	WebElement link_superior_cadastrar;

	// Inicializando o PO

	public CadastroPage() {
		PageFactory.initElements(driver, this);

	}

	public void exibirCadastroLinkSuperior() {
		link_superior_cadastrar.click();

	}

	public void exibirCadastroLinkInferior() {
		link_superior_cadastrar.click();
	}

	public void InserirCadastro(String user, String pass, String confirmesenha) {
		usuario.sendKeys(user);
		senha.sendKeys(pass);
		confirme.sendKeys(confirmesenha);
		btnCadastrar.click();
		
		
		
	}



}
