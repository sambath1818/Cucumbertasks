package cucumber.sceanerio.tasks;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sceanerio {
	static WebDriver driver;
	@Given("User Should Launch The Browser")
	public void user_Should_Launch_The_Browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sambath\\Desktop\\New folder\\sceanerio\\lib\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("Click Add Customer Link")
	public void click_Add_Customer_Link() {
	   driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
	}
	
	//Sceanerio Task

/*	@When("User Provide Vaild Details")
	public void user_Provide_Vaild_Details() {
		driver.manage().window().maximize();
	 driver.findElement(By.xpath("//label[text()='Done']")).click();
	  driver.findElement(By.id("fname")).sendKeys("sambath");
	  driver.findElement(By.id("lname")).sendKeys("kumar");
	  driver.findElement(By.id("email")).sendKeys("sambath@gmail.com");
	  driver.findElement(By.name("addr")).sendKeys("cbe");
	  driver.findElement(By.id("telephoneno")).sendKeys("123456990");
	  driver.findElement(By.name("submit")).click();
	}*/
	
	//SceanerioOutline Task
	
/*	@When("User Provide Vaild Details {string},{string},{string},{string},{string}")
	public void user_Provide_Vaild_Details(String fname, String lname, String email, String address, String phoneno) {
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//label[text()='Done']")).click();
		  driver.findElement(By.id("fname")).sendKeys(fname);
		  driver.findElement(By.id("lname")).sendKeys(lname);
		  driver.findElement(By.id("email")).sendKeys(email);
		  driver.findElement(By.name("addr")).sendKeys(address);
		  driver.findElement(By.id("telephoneno")).sendKeys(phoneno);
		  driver.findElement(By.name("submit")).click();
	}*/
	
	//One Dimensional using List 
	
	/*@When("User Provide Vaild Details")
	public void user_Provide_Vaild_Details(io.cucumber.datatable.DataTable dataTable) {
		driver.manage().window().maximize();
		List<String> oned=dataTable.asList(String.class); 
		 driver.findElement(By.xpath("//label[text()='Done']")).click();
		  driver.findElement(By.id("fname")).sendKeys(oned.get(0));
		  driver.findElement(By.id("lname")).sendKeys(oned.get(1));
		  driver.findElement(By.id("email")).sendKeys(oned.get(2));
		  driver.findElement(By.name("addr")).sendKeys(oned.get(3));
		  driver.findElement(By.id("telephoneno")).sendKeys(oned.get(4));
		  driver.findElement(By.name("submit")).click();   
	}*/
	
	//One Dimensional using Map
	
	@When("User Provide Vaild Details")
	public void user_Provide_Vaild_Details(io.cucumber.datatable.DataTable dataTable) {
		driver.manage().window().maximize();
		Map<String,String> oned =dataTable.asMap(String.class, String.class) ;
		 driver.findElement(By.xpath("//label[text()='Done']")).click();
		  driver.findElement(By.id("fname")).sendKeys(oned.get("fname"));
		  driver.findElement(By.id("lname")).sendKeys(oned.get("lname"));
		  driver.findElement(By.id("email")).sendKeys(oned.get("email"));
		  driver.findElement(By.name("addr")).sendKeys(oned.get("address"));
		  driver.findElement(By.id("telephoneno")).sendKeys(oned.get("phoneno"));
		  driver.findElement(By.name("submit")).click();
	   
	}
	 

	@Then("To Verify Customer ID Displayed OR Not")
	public void to_Verify_Customer_ID_Displayed_OR_Not() {
		
	   // Assert.assertTrue("verified Customer Id",driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
	    Assert.assertTrue("Verified Customer Id",driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
	
	}

}
