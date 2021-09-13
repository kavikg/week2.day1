package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		driver.findElement(By.className("decorativeSubmit")).click();
				
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("First");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last");
		
		WebElement S = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(S);
		source.selectByIndex(8);
		
		WebElement MC = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select MC1 = new Select(MC);
		MC1.selectByVisibleText("Automobile");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/13/21");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9172581479");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("02");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Neighbour");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tr@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.gmail.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sri");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Aish");	
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("14 boom st");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("cross st");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600025");
		
		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select Contry = new Select(Country);
		Contry.selectByVisibleText("India");
		
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select province = new Select(State);
		province.selectByValue("IN-TN");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600012");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println("The title of the page is:" + title);
		
		
		
	}
}