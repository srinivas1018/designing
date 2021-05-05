package design_generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class adding_multiple_items {
;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//Beans - 1 Kg
		Thread.sleep(3000);
		int j=0;
		String[] name={"Carrot","Brinjal","Beans","Tomato","Mushroom"};
        List<WebElement> items = driver.findElements(By.xpath("//h4[@class='product-name']"));
        int itemsize=items.size();
        Thread.sleep(3000); 
        List<String> itemsNeededList = Arrays.asList(name);
        for(int i=1;i<itemsize;i++)
        {
        	String[] i_name = items.get(i).getText().split("-");
        	 String names = i_name[0].trim();
        	if(itemsNeededList.contains(names))
        	{
        		j++;
        		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
        	}
        	if(j==name.length)
        	{
        		break;
        	}
        }
	}      

}
