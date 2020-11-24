package tESTCASES;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import cOMMONFUCTIONS.Common_FUNCTION123;
import pAGEOBJECTMODEL.USER_ROLE;

public class TEST_USER_ROLE extends Common_FUNCTION123 {

	public String UserRoleValue=null;
	public String UserStatusValue=null;


	public void MovetoUsers() {
		PageFactory.initElements(driver, USER_ROLE.class);
		Actions actions=new Actions(driver);
		actions.moveToElement(USER_ROLE.adminLink);
		actions.moveToElement(USER_ROLE.UserManagementLink);
		actions.moveToElement(USER_ROLE.UsersLink);
		actions.click().build().perform();
	}

	public void SelectRole() {
		Select selectrole=new Select(USER_ROLE.UserRole);
		selectrole.selectByIndex(1);

	}

	public void Selectstatus() {
		Select selectrole3=new Select(USER_ROLE.UserStatus);
		selectrole3.selectByIndex(1);
	}
	
	@Test
	public void VerifyTestStatus() {
		MovetoUsers();
		SelectRole();
		Selectstatus();
		USER_ROLE.Search.click();
		UserRoleValue=USER_ROLE.UserRoleValue.getText();
		UserStatusValue=USER_ROLE.UserStatusValue.getText();
		
		Assert.assertNotEquals(UserRoleValue, "actual2");
		Assert.assertNotEquals(UserStatusValue, "actual1");
		
	}

}
