package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import common.common1;

public class homepage extends common1{
	private WebDriver driver;
	

	 @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/div/div[1]/a[2]/u")
  private WebElement createaccount;
  
	 @FindBy(how = How.CSS, using = "[type='radio'][value='m']")
	 public WebElement male;

	 @FindBy(how = How.CSS, using = "[type='radio'][value='f']")
	 public WebElement female;
  
   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[2]/td[2]/input")
  private WebElement firstname;
  
  @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[3]/td[2]/input")
  private WebElement lastname;
  
  @FindBy(how = How.XPATH, using = "//*[@id='dob']")
  private WebElement DOB;
  
   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[5]/td[2]/input")
  private WebElement sendemail;
  
   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[1]/td[2]/input")
  private WebElement street;
  
   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[3]/td[2]/input")
  private WebElement postCode;
  
  @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[4]/td[2]/input")
  private WebElement city;
  
   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[5]/td[2]/input")
  private WebElement state;
  
   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select")
  private WebElement country;
  
   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[1]/td[2]/input")
  private WebElement phone;
  
  @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[1]/td[2]/input")
  private WebElement password;
  
   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[2]/td[2]/input")
  private WebElement cpassword;
   
 
   @FindBy(how = How.XPATH, using = "//*[@id=\"tdb4\"]/span[2]")
   private WebElement clickcontinue;
   
   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/div/div[1]/a[1]/u")
   private WebElement loginyourself;
   
   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[1]/td[2]/input")
   private WebElement loginemail;

   @FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[2]/td[2]/input")
   private WebElement loginpass;
   
   @FindBy(how = How.XPATH, using = " //*[@id='tdb5']")
   private WebElement sign_in;
   
   public homepage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void clickcreate() {
 	  click1(createaccount);
   }
   
   public void login() {
	   click1(loginyourself);
   }
   
   public void login_account() {
	   loginemail.sendKeys("ecalix@test.com");
	   loginpass.sendKeys("test123");
   }
 //*[@id='tdb5']
   public void click_signin() {
	   sign_in.click();
   }
   
   public void CreateAccount(String fname, String lname,String mail, String str, String pcode, String citi,
			String state2, String count, String phn, String pword, String cpwd, String gndr)
   {
	   
	   getfirstname(firstname,fname);
	   getlastname(lastname,lname);
	   getDOB(DOB);
	   getemail(sendemail,mail);
	   getstreet(street,str);
	   getpcode(postCode,pcode);
	   getcity(city,citi);
	   getstate(state,state2);
	   selectcountry(country,count);
	   getphone(phone,phn);
	   getpassword(password,pword);
	   getcpass(cpassword,cpwd);
	   if(gndr=="male") {
	   getgender(male, gndr);
	   }
	   else {
	  getogender(female, gndr);
	   }
  
		
	}
   
   public void CreateAccount2(String fname, String lname, String str, String pcode, String citi,
			String state2, String count, String phn, String pword, String cpwd, String gndr)
  {
	   
	   getfirstname(firstname,fname);
	   getlastname(lastname,lname);
	   getDOB(DOB);
	   getemail2(sendemail);
	   getstreet(street,str);
	   getpcode(postCode,pcode);
	   getcity(city,citi);
	   getstate(state,state2);
	   selectcountry(country,count);
	   getphone(phone,phn);
	   getpassword(password,pword);
	   getcpass(cpassword,cpwd);
	   if(gndr=="male") {
	   getgender(male, gndr);
	   }
	   else {
	  getogender(female, gndr);
	   }
 
		
	}


public void clickcontinue() {
	//click2(clickcontinue);
	driver.findElement(By.xpath("//*[@id=\"tdb4\"]/span[2]")).click();
	System.out.println("done with clicking");
	
}
}