package ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='BOM']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='ui-state-highlight'")).click();
		  
		
		// enable disable
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		driver.findElement(By.id("Div1")).getAttribute("style");

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		driver.findElement(By.id("Div1")).getAttribute("style");

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}

	}

}
