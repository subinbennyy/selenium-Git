package testScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpSD {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor ex=(JavascriptExecutor) driver;
		
		ex.executeScript("window.scrollBy(0,3000)", ""); //scroll down
		ex.executeScript("window.scrollBy(0,-2500)", ""); //scroll up,must be is negative
	}

}
