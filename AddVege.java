package ClassPractice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddVege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String [] myBucket = {"Cucumber", "Beetroot"};
		int j = 0;
		
		List<WebElement> vegiee = driver.findElements(By.className("product-name"));
		for (int i = 1; i < vegiee.size(); i++) 
		{
			
			String[] productName=vegiee.get(i).getText().split("-");
			String finalName = productName[0].trim();
			
			List itemsNeeded = Arrays.asList(myBucket);
			
			if (itemsNeeded.contains(finalName)) {
				
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				if (j == myBucket.length) {
					break;
					
				}
			
			}
			
		}
	}

}
