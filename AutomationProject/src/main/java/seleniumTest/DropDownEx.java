package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx extends BaseEx {
	public void dropDown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectField=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		selectField.click();
		Select slt=new Select(selectField);
		//slt.selectByIndex(1);
		//slt.selectByValue("Yellow");
		slt.selectByVisibleText("Green");
		
	}

	public static void main(String[] args) {
		DropDownEx dropping=new DropDownEx();
		dropping.webOpen();
		dropping.dropDown();
		

	}

}
