package com.sg.fb.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sg.fb.constants.Constants;
import com.sg.fb.driver.DriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFaceBookSignUp{

	WebDriver driver;

	@Before
	public void setup()
	{
		driver=DriverManager.getDriver(Constants.browserName);
		driver.manage().timeouts().implicitlyWait(Constants.maxTimeOut, TimeUnit.SECONDS).pageLoadTimeout(Constants.maxTimeOut, TimeUnit.SECONDS);
		driver.get(Constants.url);
		driver.manage().window().maximize();
	}


	@Given("^I am on FaceBook Login or SignUp Page$")
	public void IamOnFacebookLoginOrSignUpPage()
	{

	}

	@When("^I click create new account$")
	public void clickCreateNewAcccount()
	{
		driver.findElement(By.xpath(IFaceBookSignUpObjRep.createNewAccount)).click();
	}

	@And("^I fill firstname \"(.*)\"$")
	public void fillFirstName(String firstName)
	{
		System.out.println("firstName:"+firstName);
		driver.findElement(By.xpath(IFaceBookSignUpObjRep.firstName)).sendKeys(firstName);
	}

	@And("^I fill lastName \"(.*)\"$")
	public void fillLastName(String lastName)
	{
		driver.findElement(By.xpath(IFaceBookSignUpObjRep.lastName)).sendKeys(lastName);
	}


	@And("^I fill mobileNumberOrEmailId \"(.*)\"$")
	public void fillMobileNumOrEmailId(String mobNoOrEmailId)
	{
		driver.findElement(By.xpath(IFaceBookSignUpObjRep.mobOrEmailId)).sendKeys(mobNoOrEmailId);
	}

	@And("^I fill password \"(.*)\" with less than 6 characters$")
	public void fillPassword(String password)
	{
		driver.findElement(By.xpath(IFaceBookSignUpObjRep.password)).sendKeys(password);
	}

	@And("^I select date of birth \"(.*)\"$")
	public void selectDateofBirth(String yearr)
	{

		WebElement yearele=driver.findElement(By.id(IFaceBookSignUpObjRep.year));
		Select year=new Select(yearele);
		year.selectByVisibleText(yearr);
	}


	@And("^I select gender \"(.*)\"$")
	public void selectGender(String gender)
	{
		driver.findElement(By.xpath(IFaceBookSignUpObjRep.gender.replace("{0}", gender)))
		.click();
	}


	@When("^I clicked on signup$")
	public void clickSignUp()
	{
		driver.findElement(By.xpath(IFaceBookSignUpObjRep.signup)).click();
		new WebDriverWait(driver, Constants.maxTimeOut).until
		(ExpectedConditions.presenceOfElementLocated(By.xpath(IFaceBookSignUpObjRep.validationMessage)));
	}

	@Then("^validation message \"(.*)\" should be displayed stating Your password must be at least 6 characters long$")
	public void verifyValidationMessage(String vMessage)
	{

		String validationMessage=((JavascriptExecutor)driver).executeScript("return document.getElementById('reg_error_inner').innerText").toString();

		if(validationMessage.contains(vMessage))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	}

	@After
	public void tearDown()
	{
		driver.quit();
	}

}
