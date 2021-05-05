package design_generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 Thread.sleep(3000);
       java.util.List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
       Thread.sleep(3000);
       for(WebElement check1:check)
       {
    	   System.out.println(check1.getText());
    	   check1.click();
    	   Thread.sleep(1000);
       }
	}

}
