package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class TesteBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TesteBase() {
		
		//setando e carregando as informações do arquivo de properties
		try {
			prop = new Properties();
		FileInputStream arq = new FileInputStream("C:\\Users\\Iago_\\Desktop\\sucesso\\inmetrics\\src\\main\\java\\config\\config.properties");
		prop.load(arq);	
		}catch(IOException e) {
			e.getMessage();
		}
	}
	
	//Inicializando o teste de acordo com o navegador
		public static void iniciar() {
			String browserName = prop.getProperty("browser");
			
			//Setando o navegador
			if(browserName.equals("chromedriver")) {
				//Informar o caminho onde está instalado no seu navegador o chromedriver
				driver = new ChromeDriver();
			}
			
			//Setando as confiraçoes básicas do driver
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TesteUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TesteUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			
			//Definindo a url base dos testes
			driver.get(prop.getProperty("url"));
			

	}
		}
	
