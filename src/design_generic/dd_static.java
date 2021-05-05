package design_generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dd_static {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.spicejet.com/");
        Thread.sleep(3000);
        WebElement ele = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
 //       List<WebElement> ele2=driver.findElements(By.cssSelector("#ctl00_mainContent_DropDownListCurrency option"));
        ele.click();
        Thread.sleep(3000);
        Select s=new Select(ele);
//        // selecting by uisng index
//        s.selectByIndex(2);
//        Thread.sleep(3000);
//        // selecting by uisng TEXT
//        s.selectByVisibleText("USD");
//        Thread.sleep(3000);
//        //selecting by using VALUE
//        s.selectByValue("BDT");
        
        //selecting all options ONE BY ONE and getting TEXT of all options
        List<WebElement> options = s.getOptions();
        for(WebElement option:options)
        {
        	System.out.println(option.getText());
        	option.click();
        	Thread.sleep(2000);
        }
        System.out.println(s.getFirstSelectedOption().getText());
	}

}
