package junit.sistema;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecuperaSenhaTest {

private WebDriver driver;
	
	@Before
	public void ConstroiCenario(){
		driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/Users/Samuel"
				+ "/Eclipse/Libs/selennium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/viewmaster_optometria/RecuperarSenhaPassoUm");
	}
	
	@After
	public void FechaCenario() {
		driver.close();
	}
	
	@Test
	public void CancelarRecuperarSenhaPassoUm(){

		WebElement btnCancelar = driver.findElement(By.id("btnCancelar"));
		btnCancelar.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.urlContains("http://localhost:8080/viewmaster_optometria/Login"));
		boolean achouNome = driver.getPageSource().contains("Entre com os seus dados corretamente para acessar o sistema"); 
		assertTrue(achouNome);
	}
	
	@Test
	public void AvancarRecuperarSenhaPassoUm(){

		WebElement btnCancelar = driver.findElement(By.id("btnCancelar"));
		btnCancelar.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.urlContains("http://localhost:8080/viewmaster_optometria/Login"));
		boolean achouNome = driver.getPageSource().contains("Entre com os seus dados corretamente para acessar o sistema"); 
		assertTrue(achouNome);
	}

}
