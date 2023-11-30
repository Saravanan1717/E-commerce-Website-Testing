package chromestart;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).click();
		WebElement act=driver.switchTo().activeElement();
		act.sendKeys("redmi 12 5G",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='REDMI 12 5G (Moonstone Silver, 128 GB)']")).click();
		Set<String>Windowhandles=driver.getWindowHandles();
		List<String>list=new ArrayList<String>(Windowhandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		driver.findElement(By.xpath("//span[text()='Place Order']")).click();
		driver.quit();
		
		
		
		

	}

}
