package test;




import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import common.ReadExl;
import common.common1;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.homepage;

public class CreateStepDefination {
	private WebDriver driver;
	public common1 obj1;
	public homepage obj2;
	public  Logger logger= Logger.getLogger(CreateStepDefination.class);
	
	//@Parameters({ "BrowserType"})
	@Before
	public void setUp()
	{
	obj1=new common1();
	driver=obj1.OpenBrowser("Chrome");
	}
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
	obj1.Openurl();
	logger.info("First comment");
	
	}
	
	@When("^user clicks on login yourself link$")
	public void loginyourself() {
		obj2=new homepage(driver);
		obj2.login();
	}
	
	@And ("^user enters correct username and password$")
	public void fill_login_crident() {
		obj2=new homepage(driver);
		obj2.login_account();
	}
	
	@And ("^clicks on Signin button$")
	public void click_on_signin() {
		obj2=new homepage(driver);
		obj2.click_signin();
	}
	
	@Then ("^welcome to iBusiness page should display$")
	public void welcome_to_iBusiness_page_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  String ExpectedText="Welcome to iBusiness";
	  String ActualText=driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText();

	  Assert.assertEquals(ExpectedText, ActualText);
	}
	
	@When("^User click on create an account$")	
public void clickOnCreate() {
		obj2=new homepage(driver);
	obj2.clickcreate();
}
	
	@And("^Eneters all the details correctly$")
	public void mainTest2()
	{
		
	    ReadExl object=new ReadExl();
		
		String fname=object.sendfirstname();
		String lname=object.sendlastname();
		//String db=object.sendDOB();
		String mail=object.sendemail();
		String str=object.sendstreet();
		String pcode=object.sendpostcode();
		String citi=object.sendcity();
		String state=object.sendstate();
		String count=object.sendcountry();
		String phn=object.sendphone();
		String pword=object.sendPwd();
		String cpwd=object.sendPwd();
		String gndr=object.gender();
	    obj2=new homepage(driver);
		
	    obj2.CreateAccount(fname, lname, mail, str, pcode, citi, state, count, phn, pword, cpwd , gndr);
		logger.info("second comment");
		
	}
	
	@And("^Enters other details correctly but forget email$")
	public void mainTest3()
	{
		
	    ReadExl object=new ReadExl();
		
		String fname=object.sendfirstname();
		String lname=object.sendlastname();
		//String db=object.sendDOB();
		//String mail=object.sendemail();
		String str=object.sendstreet();
		String pcode=object.sendpostcode();
		String citi=object.sendcity();
		String state=object.sendstate();
		String count=object.sendcountry();
		String phn=object.sendphone();
		String pword=object.sendPwd();
		String cpwd=object.sendPwd();
		String gndr=object.gender();
	    obj2=new homepage(driver);
		
	    obj2.CreateAccount2(fname,lname, str, pcode, citi, state, count, phn, pword, cpwd , gndr);
		logger.info("second comment in clicking continue without filling email address");
		
	}
	
	
	@And("^User click on continue button$")
public void click_continue() {
		
		obj2=new homepage(driver);
		
	obj2.clickcontinue();
}
	
	
	@Then ("^user see's Your Account Has Been Created! page$")
public void Your_account_has_been_created_display() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  String ExpectedText="Your Account Has Been Created!";
  String ActualText=driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/h1")).getText();

  Assert.assertEquals(ExpectedText, ActualText);
}
	
	
	@Then ("^user should get alert saying Errors have occured during the process of your form$")
		public void verifyAlert() 
		{ 
		System.out.println("am here in alert method");
		    try 
		    { 
		       Alert alert= driver.switchTo().alert();
		       String alert_text=alert.getText();
		      // System.out.println(alert_text);
		       alert.accept();
//		       String ExpectedText="Errors have occured during the process of your form.\r\n" + 
//		       		"\r\n" + 
//		       		"Please make the following corrections:\r\n" + 
//		       		"\r\n" + 
//		       		"* Your E-Mail Address must contain a minimum of 6 characters.";
//		       String ActualText=alert_text;
//		       Assert.assertEquals(ExpectedText, ActualText);
		 
		    }   // try 
		    catch (NoAlertPresentException Ex) 
		    { 
		        Assert.fail("Alert window not found"); 
		    }   // catch 
		}   // isAlertPresent()
	
	
	 @Then ("^User close the browser$")
public void teardown() {
	driver.quit();
}

	/*@AfterMethod(alwaysRun=true)
	public void screenShot(ITestResult result){
		//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
			if(ITestResult.FAILURE==result.getStatus()){
				try{
					
					TakesScreenshot screenshot=(TakesScreenshot)driver;
					// Call method to capture screenshot
					File src=screenshot.getScreenshotAs(OutputType.FILE);
					// Copy files to specific location 
					// result.getName() will return name of test case so that screenshot name will be same as test case name
					FileUtils.copyFile(src, new File("C:\\Selenium\\Catalog\\catalogproject1\\screenshot\\"+result.getName()+".png"));
					logger.info("Successfully captured a screenshot");
				}catch (Exception e){
					logger.info("Exception while taking screenshot "+e.getMessage());
				} 
		}
		driver.quit();
		}*/
	
}
