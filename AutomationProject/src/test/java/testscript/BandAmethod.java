package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BandAmethod {
  @Test
  public void print() {
	  System.out.println("Just printing");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }
  @Test
  public void beforeAfterCheck() {
	  System.out.println("Which one is excuting first");
  }

}
