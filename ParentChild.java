package ClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {

	public static void main(String[] args) {

			// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write
			WebDriver driver = new ChromeDriver();

			// Sibling - Child to parent traverse

			//header/div/button[1]/following-sibling::button[1]

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");

			System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());



			System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());



	}

}
