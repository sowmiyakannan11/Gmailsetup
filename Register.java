package gmail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver(ch);
		dr.get("https://www.gmail.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Thread.sleep(30);
		dr.findElement(By.xpath("//span[text()='Create account']")).click();
		dr.findElement(By.xpath("//li[@role='menuitem']")).click();
		
		//Assert.isTrue(false, "", args)
		//Input Personal details
		dr.findElement(By.name("firstName")).sendKeys("Sowmi123op");
		dr.findElement(By.id("lastName")).sendKeys("Kannan300");
		dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		
		//Input DOB 
		dr.findElement(By.id("day")).sendKeys("03");
		dr.findElement(By.id("year")).sendKeys("1994");
		WebElement cd = dr.findElement(By.id("month"));
		Select op= new Select(cd);
		op.selectByIndex(1);
		WebElement cd1 = dr.findElement(By.id("gender"));
		Select op1= new Select(cd1);
		op1.selectByVisibleText("Female");
		dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		
		//Select user ID
		
		WebElement rd= dr.findElement(By.xpath("//div[@class='wEIpqb nQOrEb'][1]"));
		dr.executeScript("arguments[0].click();", rd);
		Thread.sleep(2000);
		WebElement rd1= dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		dr.executeScript("arguments[0].click();", rd1);
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
		//Enter password
		dr.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("allisWELL28***");
		dr.findElement(By.xpath("//input[@name='PasswdAgain']")).sendKeys("allisWELL28***");
		WebElement rd3= dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		dr.executeScript("arguments[0].click();", rd3);
		Thread.sleep(2000);
		
		//Enter recovery mail id
		dr.findElement(By.xpath("//input[@id='recoveryEmailId']")).sendKeys("blakshmi19.5.93@gmail.com");
		WebElement dn2= dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		dr.executeScript("arguments[0].click();", dn2);
		Thread.sleep(1000);
		WebElement dn3= dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		dr.executeScript("arguments[0].click();", dn3);
		Thread.sleep(1000);
		WebElement dn4= dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		dr.executeScript("arguments[0].click();", dn4);
		
		//Authentication
		dr.findElement(By.id("phoneNumberId")).sendKeys("9003222389");
		dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
	}
}
