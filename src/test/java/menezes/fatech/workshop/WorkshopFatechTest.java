package menezes.fatech.workshop;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * 
 * @author leonardomenezes
 *
 * This sample only run with Mac and Windows SO.
 * Try to get all tests case, this code need some modification for this!
 * Good Luck! :)
 *
 */


public class WorkshopFatechTest {
	
	private static WebDriver webDriver;
	
	@BeforeClass
	public static void tearUp() {
		WebDriverSystemProperties.setWebDriverProperties(System.getProperty("os.name"));
		webDriver = new ChromeDriver();
		webDriver.get("https://kalyneramon.com.br/lel/");
	}
	
	@Test
	public void soma() {
		webDriver.findElement(By.id("firstNumber")).sendKeys("20");
		webDriver.findElement(By.id("secondNumber")).sendKeys("20");
		webDriver.findElement(By.id("Web-Button-Sum")).click();
		assertTrue("Erro ao verificar o fluxo de soma!", "40".equals(webDriver.findElement(By.id("resultWeb")).getText().trim()));
	}
	
	@AfterClass
	public static void tearDown() {
		webDriver.close();
	}
}
