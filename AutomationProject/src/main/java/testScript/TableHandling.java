package testScript;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	public void tableHandling() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']")); // to get full table data
		System.out.println(table.getText());
		
	}
	public void tableDetails() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement rowDetails=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]")); //to get details of a single row
		System.out.println(rowDetails.getText());
		
	}
	public void tableSingleData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement firstRowData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]")); //to get single value of a row
		System.out.println(firstRowData.getText());
		
	}
	public void elementSearch() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="System Architect";
		List<WebElement> findData=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[2]"));
		for(WebElement tabledata:findData) {
			if(tabledata.getText().equals(input)) {
				System.out.println(tabledata.getText());
				
			}
		}
		
		
		
		
	}

	public static void main(String[] args) {
		TableHandling thandle=new TableHandling();
		thandle.initializeBrowser();
		//thandle.tableHandling();
		//System.out.println("<---row details--->");
		//thandle.tableDetails();
		//System.out.println("<--singledata-->");
		//thandle.tableSingleData();
		thandle.elementSearch();
		

	}

}
