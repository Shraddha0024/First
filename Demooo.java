package ClassPractice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demooo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "Shraddha";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write
		
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		// WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String password = getPassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText());

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		//driver.close();
		}
	
	public static String getPassword (WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.className("forgot-pwd-container")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Reset Login')]")).click();
		String pass = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String [] passwordArray= pass.split("'");
		String password= passwordArray[1].split("'")[0];
		return password;
	}

	}


