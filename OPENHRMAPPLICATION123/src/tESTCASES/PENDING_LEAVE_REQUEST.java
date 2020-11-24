package tESTCASES;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cOMMONFUCTIONS.Common_FUNCTION123;
import pAGEOBJECTMODEL.DASHBOARD_PAGE;
import pAGEOBJECTMODEL.Login_Function123;

public class PENDING_LEAVE_REQUEST extends Common_FUNCTION123 {

	public static String WirteThis;

	public void login() {

		PageFactory.initElements(driver, Login_Function123.class);
		Login_Function123.username.sendKeys(properties.getProperty("username"));
		Login_Function123.password.sendKeys(properties.getProperty("password"));
		Login_Function123.Submit.click();

	}

	public void getLeaveRequest() {

		PageFactory.initElements(driver, DASHBOARD_PAGE.class);
		WirteThis=DASHBOARD_PAGE.PendingLeveRequest.getText();

	}
	@Test
	public void pendingLeaveREQUEST() {
		login();
		getLeaveRequest();
		Assert.assertNotEquals(WirteThis, "3 mois)");

	}


}
