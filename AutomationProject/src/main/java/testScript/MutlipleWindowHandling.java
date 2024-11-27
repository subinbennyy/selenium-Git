package testScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlipleWindowHandling {
	public WebDriver driver;
	public void handling() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contact=driver.findElement(By.xpath("//a[@href='Contact-Us/contactus.html']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();;
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> childWindows=driver.getWindowHandles();
		System.out.println(childWindows);
		String title="";
		
		for(String temp:childWindows)
		{
			if(!temp.equals(parent))
			{
				System.out.println(temp);
				driver.switchTo().window(temp);
				//System.out.println(driver.getTitle());
				title=driver.getTitle();
			}
			if(title.equals("WebDriver | Contact Us"))
			{
				
				WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
				
				firstname.sendKeys("Subin");
				WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
				lastName.sendKeys("Benny");
				WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
				email.sendKeys("Subinbenny270@gmail.com");
				WebElement message=driver.findElement(By.xpath("//textarea[@name='message']"));
				message.sendKeys("Hai Subin Benny");
				}
			if(title.equals("WebDriver | Login Portal"))
			{
				
				WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
				
				username.sendKeys("Subinbennt7165");
				WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
				password.sendKeys("******");
				
				
			}
			
		}
	}
	

	public static void main(String[] args) {
		MutlipleWindowHandling handle=new MutlipleWindowHandling();
		handle.handling();

	}

}
