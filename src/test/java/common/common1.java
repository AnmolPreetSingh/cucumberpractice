package common;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class common1 {
	 public WebDriver driver;
	  public  Logger logger= Logger.getLogger(common1.class);
	  public WebDriver OpenBrowser(String sBrowserType)  {
		   
		  // readProperty read=new readProperty();
			 // String getBrowserType = read.datapass("BrowserType");
			  
		   if(sBrowserType.equalsIgnoreCase("Firefox")) {
			    System.setProperty("webdriver.gecko.driver", "Driver\\geckodriver.exe");
			    logger.info("opening browser");
				  driver = new FirefoxDriver();
			}else if(sBrowserType.equalsIgnoreCase("Chrome")){
				 System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
				    logger.info("opening browser");
					  driver = new ChromeDriver();
			}
			else if(sBrowserType.equalsIgnoreCase("InternetExplorer")){
				 System.setProperty("webdriver.ie.driver", "Driver\\IEDriverServer.exe");
				    logger.info("opening browser");
					  driver = new InternetExplorerDriver();
			}
		   else {
			   logger.info("No browser Selected");
				}
				
			//String getUrl= read.datapass("URL");
				//  driver.get(getUrl);       //"http://107.170.213.234/catalog/"  is url given in config.properties and calling from readProperties.java
			//    System.out.println("opened oscommerce");
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    return driver;
			    
			    
			  }
	  
	   public void Openurl()
	   {
	
		  driver.get("http://107.170.213.234/catalog/");
		  logger.info("opened oscommerce");
		
	   
	      }
	 
		
		  public void closeBrowser() 
		{
		    driver.quit();
		}
		  
		  public void click1(WebElement createaccount)
		  {
			  try
			  {
				 createaccount.click();
				 logger.info(createaccount+ "clicked ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  
		  public void click2(WebElement clickcontinue)
		  {
			  try
			  {
				  System.out.println("first in click");
				  clickcontinue.click();
				  
				  Alert alert= driver.switchTo().alert();
			       String alert_text=alert.getText();
			       System.out.println(alert_text);
			       alert.accept();
				  
				 logger.info(clickcontinue+ "clicked ");
				 System.out.println("2nd in click");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  public void getfirstname(WebElement firstname,String fname)
		  {
			  try
			  {
				  
				 firstname.sendKeys(fname);
				 logger.info(firstname+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  
		  public void getlastname(WebElement lastname,String lname)
		  {
			  try
			  {
				  
				 lastname.sendKeys(lname);
				 logger.info(lastname+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		   
		  public void getDOB(WebElement DOB)
		  {
			  try
			  {
				  
				 DOB.sendKeys("01/10/1996");
				 logger.info(DOB+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  public void getemail(WebElement sendemail, String email)
		  {
			  try
			  {
				 sendemail.sendKeys(email);
				 logger.info(sendemail+ "entered ");

			  
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  
		  public void getemail2(WebElement sendemail)
		  {
			  try
			  {
				 sendemail.sendKeys(" ");
				 logger.info(sendemail+ "entered ");

			  
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  
		  public void getstreet(WebElement street,String str)
		  {
			  try
			  {
				  
				 street.sendKeys(str);
				 logger.info(street+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  
		  public void getpcode(WebElement postcode,String postc)
		  {
			  try
			  {
				  
				 postcode.sendKeys(postc);
				 logger.info(postcode+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		 
		  public void getcity(WebElement city,String citi)
		  {
			  try
			  {
				  
				 city.sendKeys(citi);
				 logger.info(city+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		   
		  public void getstate(WebElement state, String sta )
		  {
			  try
			  {
				  
				 state.sendKeys(sta);
				 logger.info(state+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  
		 
		  public void selectcountry(WebElement country,String coun)
		  {
			  try
			  {
				  
				 country.sendKeys(coun);
				 logger.info(country+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		   
		  public void getphone(WebElement phone,String num)
		  {
			  try
			  {
				  
				 phone.sendKeys(num);
				 logger.info(phone+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  public void getpassword(WebElement password,String word)
		  {
			  try
			  {
				  
				 password.sendKeys(word);
				 logger.info(password+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  public void getcpass(WebElement cpassword,String cpass)
		  {
			  try
			  {
				  
				 cpassword.sendKeys(cpass);
				 logger.info(cpassword+ "entered ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  public void getgender(WebElement male,String gndr)
		  {
			  try
			  {
				  
				 male.click();
				 logger.info(male+ "checked ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
		  public void getogender(WebElement female,String gndr)
		  {
			  try
			  {
				  
				 female.click();
				 logger.info(female+ "checked ");
			  }
			  catch(Exception e){
				  Assert.fail();
				  
			  }
		  }
}
