package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base {
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragging=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropping=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(dragging).click();
		actions.doubleClick(dragging).perform(); //for double click and drag
		actions.dragAndDrop(dragging, dropping).build().perform();
		
		WebElement draggin=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement droppin=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		action.moveToElement(draggin).click();
		action.doubleClick(draggin).perform();
		action.dragAndDrop(draggin, droppin).build().perform();
		
		WebElement dragi=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		WebElement dropi=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions acti=new Actions(driver);
		acti.moveToElement(dragi);
		acti.doubleClick(dragi).perform();
		acti.dragAndDrop(dragi, dropi).build().perform();
		
		WebElement dra=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		WebElement dro=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions act=new Actions(driver);
		act.moveToElement(dra).click();
		act.doubleClick(dra).perform();
		act.dragAndDrop(dra, dro).build().perform();
		
		
		
		
	}
	/*public void drag1() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragging=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement dropping=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(dragging).click();
		actions.doubleClick(dragging).perform();
		actions.dragAndDrop(dragging, dropping).build().perform();
		}*/

	public static void main(String[] args) {
		DragAndDrop drag=new DragAndDrop();
		drag.initializeBrowser();
		drag.dragAndDrop();
		//drag.drag1();

	}

}
