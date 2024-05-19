package ClassPractice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write
		
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		// WebDriver driver = new EdgeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("Abc");
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/input[1]")).sendKeys("Abc");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		driver.findElement(By.className("forgot-pwd-container")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shraddha");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Reset Login')]")).click();
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("Shraddha");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assert.assertEquals(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//driver.close();
		}


	}


