package ClassPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {



		public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub



			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
			System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://google.com");

		driver.navigate().to("https://rahulshettyacademy.com");
		Thread.sleep(4000);
		driver.navigate().back();

		driver.navigate().forward();
		driver.navigate().refresh();
		

		}



}
