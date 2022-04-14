package com.sg.fb.tests;

public interface IFaceBookSignUpObjRep {
	
	public static final String createNewAccount="//a[text()='Create New Account']";
	public static final String firstName="//input[@name='firstname']";
	public static final String lastName="//input[@name='lastname']";
	public static final String mobOrEmailId="//input[@name='reg_email__']";
	public static final String password="//input[@name='reg_passwd__']";
	public static final String year="year";
	public static final String gender="//label[text()='{0}']/following-sibling::input[@name='sex']";
	public static final String signup="//button[@name='websubmit']";
	public static final String validationMessage="//div[@id='reg_error' and not(contains(@class,'hidden'))]/div";

}
