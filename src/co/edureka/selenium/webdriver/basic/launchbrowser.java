package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavaScriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class launchbrowser {
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println("hello");
		
		String Str1="ABC";
		String Str2="XYZ";
		String Str3="PQR";
		String Str4 = (Str1) + (Str2) + (Str3);
		
		System.out.println(Str4);


	}

}
