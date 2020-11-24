package pAGEOBJECTMODEL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class USER_ROLE {
	

	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[1]/a/b")
	public static WebElement adminLink;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/a")
	public static WebElement UserManagementLink;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]/ul/li/a")
	public static WebElement UsersLink;
	
	@FindBy(xpath="//*[@id='searchSystemUser_userType']")
	public static WebElement UserRole;
	
	@FindBy(xpath="//*[@id='searchSystemUser_status']")
	public static WebElement UserStatus;
	
	@FindBy(id="searchBtn")
	public static WebElement Search;
	
	@FindBy(xpath="//tr/td[3]")
	public static WebElement UserRoleValue;
	
	@FindBy(xpath="//tr/td[5]")
	public static WebElement UserStatusValue;


}
