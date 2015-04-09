/**
 * 
 */
package com.newproj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author HomePC
 *
 */
public class GmailPage {
	
	By gmailLink = By.cssSelector(".gb_m[href='https://mail.google.com/mail/?tab=wm']");	
	By signUpLink = By.id("link-signup");
	By signUpPageDisplayed = By.cssSelector(".signuponepage");
	By firstNameFld = By.id("FirstName");
	By lastNameFld = By.id("LastName");
	By passwordFld = By.id("Passwd");
	By passwordConfirmFld = By.id("PasswdAgain");
	By birthMonthDropDown = By.cssSelector("#BirthMonth .goog-flat-menu-button-dropdown");
	By birthMonthLst = By.cssSelector("#BirthMonth .goog-menuitem-content");
	By birthDayFld = By.id("BirthDay");
	By birthYearFld = By.id("BirthYear");
	By genderDropDown = By.cssSelector("#Gender .goog-flat-menu-button-dropdown");
	By genderLst = By.cssSelector("#Gender .goog-menuitem-content");
	By phoneNumberFld = By.id("RecoveryPhoneNumber");
	By emailAddressFld = By.id("RecoveryEmailAddress");
	By skipCaptchaChkBox = By.id("SkipCaptcha");
	By agreeToTermsChkBox = By.id("TermsOfService");
	By NextStepBtn = By.id("submitbutton");
	By emptyUsernameErrMsg = By.id("username-errormsg-and-suggestions");
	
	
	public By getGmailLink() {
		return gmailLink;
	}
	public void setGmailLink(By gmailLink) {
		this.gmailLink = gmailLink;
	}
	public By getSignUpLink() {
		return signUpLink;
	}
	public void setSignUpLink(By signUpLink) {
		this.signUpLink = signUpLink;
	}
	public By getSignUpPageDisplayed() {
		return signUpPageDisplayed;
	}
	public void setSignUpPageDisplayed(By signUpPageDisplayed) {
		this.signUpPageDisplayed = signUpPageDisplayed;
	}
	public By getFirstNameFld() {
		return firstNameFld;
	}
	public void setFirstNameFld(By firstNameFld) {
		this.firstNameFld = firstNameFld;
	}
	public By getLastNameFld() {
		return lastNameFld;
	}
	public void setLastNameFld(By lastNameFld) {
		this.lastNameFld = lastNameFld;
	}
	public By getPasswordFld() {
		return passwordFld;
	}
	public void setPasswordFld(By passwordFld) {
		this.passwordFld = passwordFld;
	}
	public By getPasswordConfirmFld() {
		return passwordConfirmFld;
	}
	public void setPasswordConfirmFld(By passwordConfirmFld) {
		this.passwordConfirmFld = passwordConfirmFld;
	}
	public By getBirthMonthDropDown() {
		return birthMonthDropDown;
	}
	public void setBirthMonthDropDown(By birthMonthDropDown) {
		this.birthMonthDropDown = birthMonthDropDown;
	}
	public By getBirthMonthLst() {
		return birthMonthLst;
	}
	public void setBirthMonthLst(By birthMonthLst) {
		this.birthMonthLst = birthMonthLst;
	}
	public By getBirthDayFld() {
		return birthDayFld;
	}
	public void setBirthDayFld(By birthDayFld) {
		this.birthDayFld = birthDayFld;
	}
	public By getBirthYearFld() {
		return birthYearFld;
	}
	public void setBirthYearFld(By birthYearFld) {
		this.birthYearFld = birthYearFld;
	}
	public By getGenderDropDown() {
		return genderDropDown;
	}
	public void setGenderDropDown(By genderDropDown) {
		this.genderDropDown = genderDropDown;
	}
	public By getGenderLst() {
		return genderLst;
	}
	public void setGenderLst(By genderLst) {
		this.genderLst = genderLst;
	}
	public By getPhoneNumberFld() {
		return phoneNumberFld;
	}
	public void setPhoneNumberFld(By phoneNumberFld) {
		this.phoneNumberFld = phoneNumberFld;
	}
	public By getEmailAddressFld() {
		return emailAddressFld;
	}
	public void setEmailAddressFld(By emailAddressFld) {
		this.emailAddressFld = emailAddressFld;
	}
	public By getSkipCaptchaChkBox() {
		return skipCaptchaChkBox;
	}
	public void setSkipCaptchaChkBox(By skipCaptchaChkBox) {
		this.skipCaptchaChkBox = skipCaptchaChkBox;
	}
	public By getAgreeToTermsChkBox() {
		return agreeToTermsChkBox;
	}
	public void setAgreeToTermsChkBox(By agreeToTermsChkBox) {
		this.agreeToTermsChkBox = agreeToTermsChkBox;
	}
	public By getNextStepBtn() {
		return NextStepBtn;
	}
	public void setNextStepBtn(By nextStepBtn) {
		NextStepBtn = nextStepBtn;
	}
	public By getEmptyUsernameErrMsg() {
		return emptyUsernameErrMsg;
	}
	public void setEmptyUsernameErrMsg(By emptyUsernameErrMsg) {
		this.emptyUsernameErrMsg = emptyUsernameErrMsg;
	}
	
	
}
