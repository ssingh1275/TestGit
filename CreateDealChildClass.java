package HiveAutTestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateDealChildClass extends CreateDealClass {

	public void CreateDealChildFunc() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasingh\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hive-qa.apps.discovery.com/clm/");
		
		//if (Thread.interrupted())  // Clears interrupted status!
		      
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("okta-signin-username")).sendKeys("satvinder_singh@qadci.com");
		driver.findElement(By.id("okta-signin-password")).sendKeys("Monumonu@12");
		
		driver.findElement(By.id("okta-signin-submit")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(driver.getTitle().contains("HIVE - Home"))
		    //Pass
		    
			System.out.println("Page title contains \"HIVE - Home\" ");
		else
		    //Fail
		    System.out.println("Page title doesn't contains \"HIVE - Home\" ");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Clicking on the Deals
		driver.findElement(By.xpath("//*[@id='dealsSubsystem-menuBarItem']")).click();
		
		//Create Deal Click
		driver.findElement(By.id("addDealButton_label")).click();
		
		//Acquisition Click
		driver.findElement(By.id("createAQDeal_text")).click();
		
		Thread.sleep(1000);
		
		//Title*:
		driver.findElement(By.id("createDealName")).sendKeys("SatDeal - New Program");
		
		
		//DCI Contracted Contribution*:
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("dciContributions")).sendKeys("$1-$1000");
		
		//Select s = new Select(driver.findElement(By.id("dciContributions")));
		//s.selectByVisibleText("$1-$1000");
		
		
		WebElement inputField = driver.findElement(By.id("dciContributions"));
		inputField.sendKeys(Keys.TAB);
		
		Thread.sleep(500);
		
		driver.findElement(By.id("cdOriginatingNetwork")).sendKeys("3Net");
		Thread.sleep(500);
		
		WebElement NetInputField = driver.findElement(By.id("cdOriginatingNetwork"));
		NetInputField.sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//*[@id='discovery_widget_AjaxFilteringSelect_1']")).sendKeys("Output Deal - All Regions");
		Thread.sleep(500);
	
		driver.findElement(By.id("dijit_form_SimpleTextarea_1")).sendKeys("This is a Test Create deal.") ;
		
		//driver.close();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		driver = new ChromeDriver(options);
		//driver.close();
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		//s.selectByValue("DEL");
		s.deselectByIndex(1);
		
		}

	
	}
