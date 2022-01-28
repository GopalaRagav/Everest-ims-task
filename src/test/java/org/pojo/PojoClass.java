package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()='Hello, Sign in']")
	private WebElement signBtn;

	public WebElement getSignBtn() {
		return signBtn;
	}
	
	@FindBy(xpath ="//input[@id='ap_email']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement continueBtn;

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signInBtn;

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
	
	@FindBy(xpath = "//a[@id='nav-logo-sprites']//parent::div//following-sibling::div//child::a")
	private WebElement addressBtn;

	
	@FindBy(xpath = "//a[contains(text(),'Add an address or pick-up point ')]")
	private WebElement pickPoint;
	
	@FindBy(xpath = "//h2[contains(text(),'Add address')]")
	private WebElement addAdressBtn;
	
	@FindBy(xpath = "//input[contains(@id,'FullName')]")
	private WebElement fullName;
	
	
	@FindBy(xpath = "//input[contains(@id,'PhoneNumber')]")
	private WebElement phoneNum;
	
	@FindBy(xpath = "//input[contains(@id,'PostalCode')]")
	private WebElement postalCode;
	
	
	@FindBy(xpath = "//input[contains(@id,'AddressLine1')]")
	private WebElement addLine1;
	
	@FindBy(xpath = "//input[contains(@id,'AddressLine2')]")
	private WebElement addLine2;
	
	@FindBy(xpath = "//input[contains(@id,'landmark')]")
	private WebElement landMark;
	
	@FindBy(xpath = "//input[@type='submit']//following-sibling::span")
	private WebElement confirmAddress;

	public WebElement getAddressBtn() {
		return addressBtn;
	}

	public WebElement getPickPoint() {
		return pickPoint;
	}

	public WebElement getAddAdressBtn() {
		return addAdressBtn;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getPhoneNum() {
		return phoneNum;
	}
	
	
	public WebElement getCity() {
		return city;
	}

	@FindBy(xpath = "//input[contains(@id,'AddressCity')]")
	private WebElement city;
	

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getAddLine1() {
		return addLine1;
	}

	public WebElement getAddLine2() {
		return addLine2;
	}

	public WebElement getLandMark() {
		return landMark;
	}

	public WebElement getConfirmAddress() {
		return confirmAddress;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
