package com.newproj.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.newproj.pages.GmailPage;
import com.newproj.util.UtilClass;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Gmail create account.
 */
public class GmailTest 
extends TestCase
{
	public static UtilClass util = new UtilClass();
	GmailPage gmailPage = new GmailPage();

	/**
	 * Create the test case
	 *
	 * @param testGmailLink name of the test case
	 */
	public GmailTest( String testGmailLink )
	{
		super( testGmailLink );

	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( GmailTest.class );
	}

	/**
	 * Test 
	 * @throws Exception 
	 */
	public void testApp() throws Exception
	{
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(util.getBaseUrl());

		WebElement gmailLnk = driver.findElement(gmailPage.getGmailLink());
		assertTrue("Launched google", gmailLnk.isDisplayed());
		gmailLnk.click();
		WebElement signUpLnk = driver.findElement(gmailPage.getSignUpLink());
		assertTrue("Clicked on gmail link", signUpLnk.isDisplayed());
		signUpLnk.click();
		WebElement signUpPage = driver.findElement(gmailPage.getSignUpPageDisplayed());
		assertTrue("Clicked on create account link", signUpPage.isDisplayed());
		WebElement fName = driver.findElement(gmailPage.getFirstNameFld());
		assertTrue("First Name field displayed", fName.isDisplayed());
		fName.clear();
		fName.sendKeys(util.getFirstName());
		WebElement lName = driver.findElement(gmailPage.getLastNameFld());
		assertTrue("Last Name field displayed", lName.isDisplayed());
		lName.clear();
		lName.sendKeys(util.getLastName());
		WebElement pwd = driver.findElement(gmailPage.getPasswordFld());
		assertTrue("Password field displayed", pwd.isDisplayed());
		pwd.clear();
		pwd.sendKeys(util.getPwd());
		WebElement pwdConfirm = driver.findElement(gmailPage.getPasswordConfirmFld());
		assertTrue("Confirm Password field displayed", pwdConfirm.isDisplayed());
		pwdConfirm.clear();
		pwdConfirm.sendKeys(util.getPwd());
		WebElement birthMonthDD = driver.findElement(gmailPage.getBirthMonthDropDown());
		assertTrue("Birth Month dropdown displayed", birthMonthDD.isDisplayed());
		birthMonthDD.click();
		List<WebElement> birthMonthLst = driver.findElements(gmailPage.getBirthMonthLst());
		assertTrue("Birth Month List displayed", !birthMonthLst.isEmpty());
		birthMonthLst.get(0).click();
		WebElement birthDay = driver.findElement(gmailPage.getBirthDayFld());
		assertTrue("Birth Day field displayed", birthDay.isDisplayed());
		birthDay.clear();
		birthDay.sendKeys(util.getbDay());
		WebElement birthYr = driver.findElement(gmailPage.getBirthYearFld());
		assertTrue("Birth Year field displayed", birthYr.isDisplayed());
		birthYr.clear();
		birthYr.sendKeys(util.getbYr());
		WebElement genderDD = driver.findElement(gmailPage.getGenderDropDown());
		assertTrue("Gender dropdown displayed", genderDD.isDisplayed());
		genderDD.click();
		List<WebElement> genderLst = driver.findElements(gmailPage.getGenderLst());
		assertTrue("Gender List displayed", !genderLst.isEmpty());
		genderLst.get(0).click();
		WebElement phnNo = driver.findElement(gmailPage.getPhoneNumberFld());
		assertTrue("Mobile Phone field displayed", phnNo.isDisplayed());
		//phnNo.clear();
		phnNo.sendKeys(util.getPhnNo());
		WebElement email = driver.findElement(gmailPage.getEmailAddressFld());
		assertTrue("Current Email Address field displayed", email.isDisplayed());
		email.clear();
		email.sendKeys(util.getEmail());
		WebElement skipCaptcha = driver.findElement(gmailPage.getSkipCaptchaChkBox());
		assertTrue("Skip Captcha Checkbox field displayed", skipCaptcha.isDisplayed());
		skipCaptcha.click();
		WebElement agreeToTerms = driver.findElement(gmailPage.getAgreeToTermsChkBox());
		assertTrue("Agree To Terms of Service Checkbox field displayed", agreeToTerms.isDisplayed());
		agreeToTerms.click();
		WebElement nextStepBtn = driver.findElement(gmailPage.getNextStepBtn());
		assertTrue("Next Step button displayed", nextStepBtn.isDisplayed());
		nextStepBtn.click();
		WebElement errMsg = driver.findElement(gmailPage.getEmptyUsernameErrMsg());
		assertEquals("Blank Username error message displayed", "You can't leave this empty.", errMsg.getText().trim());

		driver.quit();

	}
}
