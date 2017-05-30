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

public class LoginTest {

private WebDriver driver;
	
	@Before
	public void ConstroiCenario(){
		driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/Users/Samuel"
				+ "/Eclipse/Libs/selennium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/viewmaster_optometria/Login");
	}
	
	@After
	public void FechaCenario() {
		driver.close();
	}
	
	@Test
	public void LoginInvalido(){

		WebElement itLogin = driver.findElement(By.id("itLogin"));
		WebElement itSenha = driver.findElement(By.id("itSenha"));
		WebElement btnEntrar = driver.findElement(By.id("btnEntrar"));
				
		itLogin.sendKeys("xyzxyzxyz"); 
		itSenha.sendKeys("xyzxyzxyz");
		btnEntrar.submit();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modal")));
		
		boolean achouNome = driver.getPageSource().contains("Login ou senha inválido!"); 
		assertTrue(achouNome); 
	}
	
	@Test
	public void LoginValido(){

		WebElement itLogin = driver.findElement(By.id("itLogin"));
		WebElement itSenha = driver.findElement(By.id("itSenha"));
		WebElement btnEntrar = driver.findElement(By.id("btnEntrar"));
				
		itLogin.sendKeys("sam"); 
		itSenha.sendKeys("123");
		btnEntrar.submit();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.urlContains("http://localhost:8080/viewmaster_optometria/Graficos"));
		boolean achouNome = driver.getPageSource().contains("Home"); 
		assertTrue(achouNome);
	}
	
	@Test
	public void FecharPopupPeloBotaoFechar(){

		WebElement itLogin = driver.findElement(By.id("itLogin"));
		WebElement itSenha = driver.findElement(By.id("itSenha"));
		WebElement btnEntrar = driver.findElement(By.id("btnEntrar"));
		WebElement botaoFecharModal = driver.findElement(By.id("botaoFecharModal"));
		WebElement modal = driver.findElement(By.id("modal"));
				
		itLogin.sendKeys("xyzxyzxyz"); 
		itSenha.sendKeys("xyzxyzxyz");
		btnEntrar.submit();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modal")));
	    botaoFecharModal.click();
	    
	    wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("modal")));
	
	    boolean fechouModal = modal.isDisplayed(); 
		assertFalse(fechouModal); 
	}
	
	@Test
	public void FecharPopupPeloBotaoClose(){

		WebElement itLogin = driver.findElement(By.id("itLogin"));
		WebElement itSenha = driver.findElement(By.id("itSenha"));
		WebElement btnEntrar = driver.findElement(By.id("btnEntrar"));
		WebElement botaoCloseModal = driver.findElement(By.id("botaoCloseModal"));
		WebElement modal = driver.findElement(By.id("modal"));
				
		itLogin.sendKeys("xyzxyzxyz"); 
		itSenha.sendKeys("xyzxyzxyz");
		btnEntrar.submit();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modal")));
	    botaoCloseModal.click();
	    
	    wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("modal")));
	
	    boolean fechouModal = modal.isDisplayed(); 
		assertFalse(fechouModal); 
	}
}
