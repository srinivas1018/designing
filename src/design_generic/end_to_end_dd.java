package design_generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class end_to_end_dd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("(//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[.=' Guwahati (GAU)'])")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("(//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[.=' Srinagar (SXR)'])"))
				.click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath("(//a[.='27'])[1]"));
		Thread.sleep(3000);
		ele2.click();
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement ele = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		ele.click();
		Thread.sleep(2000);
		Select s1 = new Select(ele);
		s1.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
	}

}
