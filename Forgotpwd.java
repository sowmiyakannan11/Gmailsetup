package gmail;


  import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;
import org.openqa.selenium.By;
public class Forgotpwd {
	
	public static void main(String[] args) {

	
	ChromeOptions ch = new ChromeOptions();
	ch.addArguments("--disable-notifications");
	// TODO Auto-generated method stub
	
	ChromeDriver dr = new ChromeDriver(ch);
	dr.get("https://www.gmail.com");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	 //Enter email
	dr.findElement(By.id("identifierId")).sendKeys("sowmiyapeoantony@gmail.com");
	dr.findElement(By.xpath("//span[text()='Next']")).click();
	
	
	//Forgot password
	dr.findElement(By.xpath("//span[text()='Forgot password?']")).click();
	
	//Authentication
	dr.findElement(By.id("phoneNumberId")).sendKeys("9003222389");
	dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
	
	
	
}
}
