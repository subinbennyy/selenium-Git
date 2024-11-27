package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotic {
	public WebDriver driver;
	public void file() {
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");	
		driver.manage().window().maximize();
		WebElement selectPdf=driver.findElement(By.xpath("//div[@id='uploader']")); 
		selectPdf.click();
		selectPdf.sendKeys("C:\\Users\\DELL\\Downloads\\Testcase techniques.pdf");
	}
	public void robotClass() throws AWTException {
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");	
		driver.manage().window().maximize();
		WebElement selectPdf=driver.findElement(By.xpath("//div[@id='uploader']"));
		selectPdf.click();
		StringSelection find=new StringSelection("\"C:\\Users\\DELL\\Downloads\\Davidson -Resume1 (2).pdf\""); //StringSelection is a class
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(find,null);
		Robot robi=new Robot();
		robi.delay(2500);
		robi.keyPress(KeyEvent.VK_CONTROL);
		robi.keyPress(KeyEvent.VK_V);
		robi.keyRelease(KeyEvent.VK_CONTROL);
		robi.keyRelease(KeyEvent.VK_V);
		robi.keyPress(KeyEvent.VK_ENTER);
		robi.keyRelease(KeyEvent.VK_ENTER);
	}
	public void newTab() throws AWTException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Robot robi=new Robot();
		robi.delay(2500);
		robi.keyPress(KeyEvent.VK_CONTROL);
		robi.keyPress(KeyEvent.VK_T);
		robi.keyRelease(KeyEvent.VK_CONTROL);
		robi.keyRelease(KeyEvent.VK_T);
		
	
	}

	public static void main(String[] args) throws AWTException {
		Robotic robotics=new Robotic();
		//robotics.robotClass();
		robotics.newTab();

	}

}
