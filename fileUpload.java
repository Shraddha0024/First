package ClassPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write

WebDriver driver = new ChromeDriver();
driver.get("https://altoconvertpdftojpg.com/");
driver.manage().window().maximize();
		
driver.findElement(By.id("browse")).click();
		
Thread.sleep(3000);
		
Runtime.getRuntime().exec("C:\\Users\\shraddha.borkar\\Documents\\fileupload.exe");
	}

}

//Shift focus to the file upload windows

//set text/path into file name edit box

//click open to upload file



//Au3info- record window component objects
//
//Build Script -scite.exe
//
//Save it- .au3 extenstion
//
//Convert file into .exe by compiling .au3 file
//
//Call .exe file with Runtime class in java into your selenium tests
