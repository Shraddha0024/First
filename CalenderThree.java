package ClassPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderThree {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
	System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
WebDriverWait w =new WebDriverWait(driver,5);

driver.get("https://www.path2usa.com/travel-companions");
Thread.sleep(6000);

//driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
//April 23
WebElement datesection = driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));

WebElement language = driver.findElement(By.className("p2u_sortby_wrap"));

//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(300,1400)");

Actions actions = new Actions(driver);
actions.moveToElement(language).build().perform();
//Thread.sleep(3000);
//actions.moveToElement(datesection).build().perform();
//Thread.sleep(3000);
//datesection.click();

//WebElement selenium =w.until(ExpectedConditions.elementToBeClickable(By.id("Selenium"))); 
//actions.moveToElement(datesection).build().perform();



//while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
//{
//driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
//}


//List<WebElement> dates= driver.findElements(By.className("dayContainer"));
//Grab common attribute//Put into list and iterate
//int count=driver.findElements(By.className("dayContainer")).size();

//for(int i=0;i<count;i++)
//{
//String text=driver.findElements(By.className("dayContainer")).get(i).getText();
//if(text.equalsIgnoreCase("21"))
//{
//driver.findElements(By.className("dayContainer")).get(i).click();
//break;
//}

//}
}

}