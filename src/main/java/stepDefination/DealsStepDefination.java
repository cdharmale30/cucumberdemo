/*package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDefination {
	WebDriver driver;
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page(){
		System.setProperty("webdriver.chrome.driver", "C:\\selelib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credinitals) {
		List<List<String>> data=credinitals.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String title = driver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("CRMPRO", title);
	}
	@Then("^user moves to new deals page$")
	public void user_moves_to_new_deals_page(){
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	

	@Then("^user enters Deals details scenario$")
	public void user_enters_Deals_details_scenario(DataTable dealData){
		List<List<String>> dataValues=dealData.raw();
		driver.findElement(By.id("title")).sendKeys(dataValues.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dataValues.get(0).get(1));
		
		//(//*[@id="prospectForm"]/table/tbody/tr/td/input[@type='submit'])[1]
		driver.findElement(By.id("amount")).sendKeys(dataValues.get(0).get(1));
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.close();
		
	}


}
*/