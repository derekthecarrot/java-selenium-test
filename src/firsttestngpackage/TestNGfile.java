package firsttestngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestNGfile {

//  @Test
//  public void verifyHomepageTitle() {
//       
//		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.carrotportfolio.com/");
//	    String expectedTitle = "Jeffery Pastva Portfolio";
//	    String actualTitle = driver.getTitle();
//	    Assert.assertEquals(actualTitle, expectedTitle);
//	    System.out.println("Page title is : " + driver.getTitle());
//  }
//}
//	@Test
//  Commenting out due to issues with website thinking I'm a robot.

//	public void expediaAutoBook() {
//	
//		
//		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		
//		driver.get("https://www.expedia.com/");
//		WebElement webPageLoad = driver.findElement(By.xpath("//*[@id='wizardMainRegionV2']/div/div/div/div/ul/li[2]/a"));
//		
//		webPageLoad.click();
//		
//		WebElement firstResult = driver.findElement(By.xpath("//*[@id='wizard-flight-tab-roundtrip']/div[2]/div[1]/div/div[1]/div/div/div/div[1]/div"));
//        firstResult.click();
//        
//        WebElement searchBarFrom = driver.findElement(By.xpath("//*[@id='location-field-leg1-origin']"));
//        
//        searchBarFrom.sendKeys("RDU");
//	}
//	

		@Test
		public void shoppingAutomation() {
	
		
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		Actions action = new Actions(driver);
		
		
		driver.get("http://automationpractice.com/");
		
		//Hover over "Women" categorization
		WebElement webPageWomen = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		action.moveToElement(webPageWomen);

		//After hovering over "Women" category, hover over T-shirts then click
		WebElement tshirtResult = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a"));
        action.moveToElement(tshirtResult);
        action.click().build().perform();
		
		//Hover over image, mouse over add to cart button, then add to cart.
		WebElement hoverToAdd = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		WebElement addToCart = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"));
		
		action.moveToElement(hoverToAdd);
		action.moveToElement(addToCart);
		action.click().build().perform();
	}
}