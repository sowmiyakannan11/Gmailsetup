package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class login {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver(ch);
		
		//Launch url
		
		dr.get("https://www.gmail.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		  //Enter email
		dr.findElement(By.id("identifierId")).sendKeys("sowmiya.dha@gmail.com");
		dr.findElement(By.xpath("//span[text()='Next']")).click();
		
		  //Enter Password	
		
		dr.findElement(By.name("password")).sendKeys("Appa@112131");
		dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		
		
		
		

	}

}
