package ClassPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSecond {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/?cid=Display|Affiliate|LF|LA11|2994_275");
	
		driver.findElement(By.className("react-datepicker-ignore-onclickoutside")).click();
		Thread.sleep(3000);	
		
		List <WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker'] // div[@class= 'react-datepicker__month-container'][1]"));
		int count = driver.findElements(By.xpath("//div[@class='react-datepicker'] // div[@class= 'react-datepicker__month-container'][1]")).size();
		
		for (int i =0 ; i < count; i ++) {
			String text = driver.findElements(By.xpath("//div[@class='react-datepicker'] // div[@class= 'react-datepicker__month-container'][1]")).get(i).getText();
			if (text.equalsIgnoreCase("24")) {
				driver.findElements(By.xpath("//div[@class='react-datepicker'] // div[@class= 'react-datepicker__month-container'][1]")).get(i).click();
				break;
				
			}
			
			//driver.close();
			
		}
			
		}
	
		
		

	}
