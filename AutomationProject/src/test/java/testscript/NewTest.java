package testscript;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 1)
  public void firstTest() {
	  
	  System.out.println("Hello wolrd");
  }
  @Test(priority = 2)
  public void anextTest() {
	  System.out.println("Hai Subin");
  }
  @Test(priority = 3)
  public void testTesting() {
	  System.out.println("checking");
  }
}
