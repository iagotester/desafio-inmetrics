package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TesteBase;

public class LoginPage extends TesteBase {

	@FindBy(name = "username")
	WebElement login;

	@FindBy(name = "pass")
	WebElement senha;

	@FindBy(xpath = "//button[contains(text(),'Entre')]")
	WebElement btnEntre;

	@FindBy(xpath = "//button[contains(text(),'Entre')]")
	WebElement linkCadastrar;

//Inicializando o PO

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public void realizarLogin(String login, String senha) {
		
		
	///login.sendKeys(login);
	//senha.sendKeys(senha);
		
		driver.findElement(By.name("username")).sendKeys(login);
		driver.findElement(By.name("pass")).sendKeys(senha);
		driver.findElement(By.xpath("//button[contains(text(),'Entre')]")).click();
	}


	public String verificadorTelaLogin() {
		return driver.findElement(By.tagName("span")).getText();
	}

	public String verificadorUsuarioInvalido() {
		return driver.findElement(By.tagName("strong")).getText();

	}

	

}
