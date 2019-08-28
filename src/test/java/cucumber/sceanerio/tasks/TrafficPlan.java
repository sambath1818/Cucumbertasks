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

public class TrafficPlan {
			static WebDriver driver;
		@Given("User Launch Browser")
		public void User_Launch_Browser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sambath\\Desktop\\New folder\\sceanerio\\lib\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("Click Add Traiff Plan")
	public void click_Add_Traiff_Plan() {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();    
	}
	
	//Scenario Task

	/*@When("User Provide Traffic Plan Details")
	public void user_Provide_Traffic_Plan_Details() {
		driver.manage().window().maximize();
		  driver.findElement(By.id("rental1")).sendKeys("399");
		  driver.findElement(By.id("local_minutes")).sendKeys("300");
		  driver.findElement(By.id("inter_minutes")).sendKeys("30");
		  driver.findElement(By.id("sms_pack")).sendKeys("100");
		  driver.findElement(By.id("minutes_charges")).sendKeys("20");
		  driver.findElement(By.id("inter_charges")).sendKeys("50");
		  driver.findElement(By.id("sms_charges")).sendKeys("100");
		  driver.findElement(By.name("submit")).click();
		  }
		  */
	   
	// Add Traffic Plan Using List
	
	/*@When("User Provide Traffic Plan Details")
	public void user_Provide_Traffic_Plan_Details(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> twodlist=dataTable.asLists(String.class);
	    driver.findElement(By.id("rental1")).sendKeys(twodlist.get(0).get(0));
		  driver.findElement(By.id("local_minutes")).sendKeys(twodlist.get(0).get(1));
		  driver.findElement(By.id("inter_minutes")).sendKeys(twodlist.get(0).get(2));
		  driver.findElement(By.id("sms_pack")).sendKeys(twodlist.get(0).get(3));
		  driver.findElement(By.id("minutes_charges")).sendKeys(twodlist.get(1).get(4));
		  driver.findElement(By.id("inter_charges")).sendKeys(twodlist.get(0).get(5));
		  driver.findElement(By.id("sms_charges")).sendKeys(twodlist.get(1).get(6));
		  driver.findElement(By.name("submit")).click();
	    
	}*/
	
	// Add Traffic Plan Using List
	
	@When("User Provide Traffic Plan Details")
	public void user_Provide_Traffic_Plan_Details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> twodmap = dataTable.asMaps(String.class,String.class);
		 driver.findElement(By.id("rental1")).sendKeys(twodmap.get(0).get("rent"));
		  driver.findElement(By.id("local_minutes")).sendKeys(twodmap.get(0).get("lmin"));
		  driver.findElement(By.id("inter_minutes")).sendKeys(twodmap.get(0).get("intermin"));
		  driver.findElement(By.id("sms_pack")).sendKeys(twodmap.get(0).get("sms"));
		  driver.findElement(By.id("minutes_charges")).sendKeys(twodmap.get(1).get("min"));
		  driver.findElement(By.id("inter_charges")).sendKeys(twodmap.get(0).get("intermin_char"));
		  driver.findElement(By.id("sms_charges")).sendKeys(twodmap.get(1).get("sms_char"));
		  driver.findElement(By.name("submit")).click();
	    
	}

	
	
 
	@Then("Verify Plan Sholuld be Added")
	public void verify_Plan_Sholuld_be_Added() {
		driver.manage().window().maximize();
	   // Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Congratulation you add Tariff Plan')]")));
	Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}

}
