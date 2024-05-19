package ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		
		Actions a = new Actions(driver);
		//to just hover on the element
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(move).build().perform();
		
		//move to the element and enter the keyword in search field in capital
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("LAPTOP").build().perform();
		
		//double click to select the text
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("LAPTOP").doubleClick().build().perform();
		
		// Right click
		a.moveToElement(move).contextClick().build().perform();
		
		
		
		
		

	}

}
