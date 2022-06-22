package cucumber.projects2;

import org.openqa.selenium.By;
import org.test1.TestProjects1.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberPrac2 extends BaseClass {

	@Given("Open bose page")
	public void open_bose_page() {
	    browserLaunch("https://www.bose.com");
	}

	@When("type product name")
	public void type_product_name() {
		driver.findElement(By.xpath("//span[text()=\"                   Stay here               \"]")).click();
	    driver.findElement(By.xpath("//input[@name=\"queryForDisplay\"]")).sendKeys("NC700");
	}

	@Then("Hit search option")
	public void hit_search_option() throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    System.out.println("Search was successfull");
System.out.println("testing");
	}

	
}
