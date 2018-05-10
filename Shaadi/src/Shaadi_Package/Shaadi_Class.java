package Shaadi_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Shaadi_Class extends InterruptedException{
	
	public static void main(String[]args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\\\\\Geckodriver\\\\\\\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.shaadi.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[15]/div/div/div[3]/div[2]/form/div/div[4]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("layer_email")).sendKeys("pratikbangal35@gmail.com");
		driver.findElement(By.id("layer_password1")).sendKeys("Myshaadi888$");
		
		//Point point=driver.findElement(By.id("layer_password1")).getLocation();
		//System.out.println("X Position : "+point.x);
		//System.out.println("X Position : "+point.y);
		
	    //Actions builder = new Actions(driver);   
	   // builder.moveToElement(driver.findElement(By.id("layer_password1")), 20, 20).click().build().perform();
	    
		driver.findElement(By.id("layer_password1")).sendKeys(Keys.TAB, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		//driver.findElement(By.id("layer_password1")).sendKeys(Keys.ENTER);
		//driver.findElement(By.cssSelector("css=#s2id_layer_postedby > a.select2-choice > span.select2-chosen")).sendKeys(Keys.ENTER);
		//driver.findElement(By.id("select2-drop-mask")).click();
		//driver.findElement(By.cssSelector("css=div.reg_layer_frm_wrap")).submit();
		
	}

}
