package ClassPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//total count of links on this page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// Total links in the footer
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		// 1st column footer link count
		WebElement firstcolumn= footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(firstcolumn.findElements(By.tagName("a")).size());
		
		// Open all the links of 1st footer column in the new tabs
		for(int i=1;i<firstcolumn.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			firstcolumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{	
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		}
		}
}
