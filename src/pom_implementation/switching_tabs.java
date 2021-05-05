package pom_implementation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switching_tabs {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> i1 = handle.iterator();
		
		//this is one way to switch
//		for(int i=1; i<=2;i++)
//		{
//			String id = i1.next();
//			driver.switchTo().window(id);
//		}
		
		//this is second way to switch
		String p_id = i1.next();
		String c_id = i1.next();
		driver.switchTo().window(c_id);
		String eamil = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(eamil);
		driver.switchTo().window(p_id);
		driver.findElement(By.cssSelector("input#username")).sendKeys(eamil);
		System.out.println("test case got passed");
	}

}
