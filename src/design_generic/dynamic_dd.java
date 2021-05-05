package design_generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamic_dd {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	        WebDriver driver=new FirefoxDriver();
	        driver.get("https://www.spicejet.com/");
	        Thread.sleep(2000);
	        WebElement ele = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT"));
	        ele.click();
//	        driver.findElement(By.xpath("//a[.=' Srinagar (SXR)']")).click();
//	        Thread.sleep(2000);
//	        driver.findElement(By.xpath("(//a[.=' Goa (GOI)'])[2]")).click();
	        
	        
	        driver.findElement(By.xpath("(//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[.=' Guwahati (GAU)'])")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[.=' Srinagar (SXR)'])")).click();
	}

}
