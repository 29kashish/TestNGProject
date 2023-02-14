package testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjectmodel.LoginPageObjects;
import pageobjectmodel.signupPageObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.constants;

public class verifySignup extends BaseClass 
{  
	@Test
	public void signup() throws IOException,InterruptedException
	{
//		driverInitilize();
		    // This driver have scope
//		driver.get("https://login.salesforce.com/");
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.clickOntryForFree().click();
		
		signupPageObjects spo = new signupPageObjects(driver);
		
		Thread.sleep(5000);
		
		spo.enterFirstname().sendKeys(constants.firstname);
		
/*		Select s = new Select(spo.selectEmployee());
		s.selectByIndex(1);
*/		
		CommonMethods.selectDropdown(spo.selectEmployee(), 1);
		
		CommonMethods.selectDropdown(spo.selectCountry(), 2);
		
	}

}
