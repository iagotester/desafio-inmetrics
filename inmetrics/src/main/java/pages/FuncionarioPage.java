package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.TesteBase;

public class FuncionarioPage extends TesteBase {

	@FindBy(name = "nome")
	WebElement lbl_nome;

	@FindBy(name = "cpf")
	WebElement lbl_cpf;

	@FindBy(id = "slctSexo")
	WebElement comboboxElement;

	@FindBy(id = "inputAdmissao")
	WebElement lbl_admissao;

	@FindBy(id = "inputCargo")
	WebElement lbl_cargo;

	@FindBy(xpath = "salario")
	WebElement lbl_salario;

	@FindBy(id = "clt")
	WebElement contratacao_clt;

	@FindBy(id = "pj")
	WebElement contratacao_pj;

	@FindBy(xpath = "input[type=\"submit\"]")
	WebElement btn_enviar;

	@FindBy(xpath = "input[value=\"Cancelar\"]")
	WebElement btn_cancelar;

	@FindBy(xpath = "input[type=\"search\"]")
	WebElement lbl_pesquisar;

	@FindBy(id = "delete-btn")
	WebElement btn_excluir;

	@FindBy(xpath = "span[class*=\"fa-pencil\"]")
	WebElement btn_editar;

	public FuncionarioPage() {
		PageFactory.initElements(driver, this);

	}

	// Metodos do PO

	public void exibirFuncionarios() {
		driver.findElement(By.cssSelector("a[href*=\"/empregados/\"]")).click();
	}

	public void exibirNovoFuncionario() {
		driver.findElement(By.cssSelector("a[href*=\"/new_empregado\"]")).click();
	}

	public void inserirfuncionarios(String nome, String CPF, String sexo, String admissao, String cargo,
			String salario) {

		/*
		lbl_nome.sendKeys(nome);
		lbl_cargo.sendKeys(CPF);
		// Setando o combobox de sexo
		Select combobox = new Select(comboboxElement);
		combobox.selectByValue(sexo);
		lbl_admissao.sendKeys(admissao);
		lbl_cargo.sendKeys(cargo);
		lbl_salario.sendKeys(salario);
		contratacao_clt.click();
		*/
		
		driver.findElement(By.name("nome")).sendKeys(nome);
		driver.findElement(By.name("cpf")).sendKeys(CPF);
		Select combobox = new Select(comboboxElement);
		combobox.selectByVisibleText(sexo);
		driver.findElement(By.id("inputAdmissao")).sendKeys(admissao);
		driver.findElement(By.id("inputCargo")).sendKeys(cargo);
		driver.findElement(By.id("dinheiro")).sendKeys(salario);
		driver.findElement(By.id("clt")).click();
		driver.findElement(By.xpath("input[class=\"cadastrar-form-btn\"]")).click();
		
	}

	public void editarFuncionarios(String nome, String CPF, String sexo, String admissao, String cargo,
			String salario) {
		
		driver.findElement(By.name("nome")).sendKeys(nome);
		driver.findElement(By.name("cpf")).sendKeys(CPF);
		Select combobox = new Select(comboboxElement);
		combobox.selectByVisibleText(sexo);
		driver.findElement(By.id("inputAdmissao")).sendKeys(admissao);
		driver.findElement(By.id("inputCargo")).sendKeys(cargo);
		driver.findElement(By.id("dinheiro")).sendKeys(salario);
		driver.findElement(By.id("clt")).click();
		driver.findElement(By.xpath("input[class=\"cadastrar-form-btn\"]")).click();
	}

	public void pesquisarFuncionarios(String nome) {
		/*
		lbl_pesquisar.sendKeys(nome);
*/
		driver.findElement(By.xpath("input[type=\\\"search\\\"]")).sendKeys(nome);	
		
	}

	public void excluirFuncionarios() {
		btn_excluir.click();
	}

	public String verificadorCadastroFuncionario() {
		return driver.findElement(By.xpath("div[class*=\"alert-success \"]")).getText();
	}

	public String verificadorEditarFuncionario() {
		return driver.findElement(By.tagName("strong")).getText();
	}
	
	public String verificadorExcluirFuncionario() {
		return driver.findElement(By.tagName("strong")).getText();
	}

	public String verificadorTelaFuncionarios() {

		return driver.findElement(By.cssSelector("a[href*=\"/empregados/\"]")).getText();
	}
	
	

}
