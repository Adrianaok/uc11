package uc11;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//C:\Users\Micro\Downloads\chromedriver_win32
public class uc11 {
WebDriver driver;
	
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Micro\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		//driver.get("http://www.google.com.br/");
		driver.manage().window().maximize();

		driver.get("https://informatica.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		driver.findElement(By.id("Busca1_btnBusca")).click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}	
	
	
		driver.close();

	}
	public static void main(String args[]) {

		try {
			uc11 navegador=new uc11();
			navegador.setUp();
			
	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro:" + e);
		}

	}	
	

	
	
	
	
	
}
