package design_generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class auto_suggestive {

	public static void main(String[] args) throws Exception 
	{
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='✕']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]")).sendKeys("mi note6 p");
        Thread.sleep(2000);
        List<WebElement> ele = driver.findElements(By.xpath("//li[@class='Y5N33s']//a"));
        Thread.sleep(2000);
        for(WebElement ele1:ele)
        {
        	if(ele1.getText().contains("redmi note 8 pro"))
        	{
        		ele1.click();
        		break;
        	}
        }
	}

}
