package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods 
{
	public static void selectDropdown(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public static void handleAssertions(String actual, String expected, String message)
	{
		SoftAssert a = new SoftAssert();
		
		String ac = actual;
		String exp = expected;
		
		a.assertEquals(ac, exp, message);
		
		a.assertAll();
	}

}
