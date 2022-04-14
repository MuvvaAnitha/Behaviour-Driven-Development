$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Facebook.feature");
formatter.feature({
  "name": "FaceBook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Password Minimum length validation message",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on FaceBook Login or SignUp Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click create new account",
  "keyword": "When "
});
formatter.step({
  "name": "I fill firstname \"\u003cfirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I fill lastName \"\u003clastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I fill mobileNumberOrEmailId \"\u003cmobNoOrEmailId\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I fill password \"\u003cpassword\u003e\" with less than 6 characters",
  "keyword": "And "
});
formatter.step({
  "name": "I select date of birth \"\u003cdateOfBirth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select gender \"\u003cgender\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I clicked on signup",
  "keyword": "When "
});
formatter.step({
  "name": "validation message \"\u003cvalidationMessage\u003e\" should be displayed stating Your password must be at least 6 characters long",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "mobNoOrEmailId",
        "password",
        "dateOfBirth",
        "gender",
        "validationMessage"
      ]
    },
    {
      "cells": [
        "TestFn",
        "TestLn",
        "1234567890",
        "1234",
        "1990",
        "Male",
        "An error occurred. Please try again."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Password Minimum length validation message",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on FaceBook Login or SignUp Page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestFaceBookSignUp.IamOnFacebookLoginOrSignUpPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click create new account",
  "keyword": "When "
});
formatter.match({
  "location": "TestFaceBookSignUp.clickCreateNewAcccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill firstname \"TestFn\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestFaceBookSignUp.fillFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill lastName \"TestLn\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestFaceBookSignUp.fillLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill mobileNumberOrEmailId \"1234567890\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestFaceBookSignUp.fillMobileNumOrEmailId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill password \"1234\" with less than 6 characters",
  "keyword": "And "
});
formatter.match({
  "location": "TestFaceBookSignUp.fillPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select date of birth \"1990\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestFaceBookSignUp.selectDateofBirth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select gender \"Male\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestFaceBookSignUp.selectGender(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on signup",
  "keyword": "When "
});
formatter.match({
  "location": "TestFaceBookSignUp.clickSignUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validation message \"An error occurred. Please try again.\" should be displayed stating Your password must be at least 6 characters long",
  "keyword": "Then "
});
formatter.match({
  "location": "TestFaceBookSignUp.verifyValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});