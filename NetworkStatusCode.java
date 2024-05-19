package ClassPractice;

import java.util.Optional;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.network.Network;
import org.openqa.selenium.devtools.v96.network.model.Request;
import org.openqa.selenium.devtools.v96.network.model.Response;

public class NetworkStatusCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shraddha.borkar\\OneDrive - Perficient, Inc\\PerficientNagpurGDCFramework\\lib\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client"); // dont write
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty())); // parameters are optional
		
		devTools.addListener(Network.requestWillBeSent(), request ->
		{
			Request req = request.getRequest();
			System.out.println(req.getUrl());
		}
		);	
		
		//Event will get fired
		devTools.addListener(Network.responseReceived(), response -> 
		{
			Response res = response.getResponse();
			
			System.out.println(res.getStatus());
			
			//if (res.getStatus().toString().startsWith("4"))	
				//	{	
					//	System.out.println(res.getUrl()+"is failing with status code" );
				//	}
		});
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");	
		driver.findElement(By.xpath("//button[@routerlink='/library']")).click();
		
	}

}
