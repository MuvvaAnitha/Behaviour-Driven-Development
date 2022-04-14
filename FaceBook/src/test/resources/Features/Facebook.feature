Feature: FaceBook

Scenario Outline: Verify Password Minimum length validation message

Given I am on FaceBook Login or SignUp Page
When I click create new account
And I fill firstname "<firstName>"
And I fill lastName "<lastName>"
And I fill mobileNumberOrEmailId "<mobNoOrEmailId>"
And I fill password "<password>" with less than 6 characters
And I select date of birth "<dateOfBirth>"
And I select gender "<gender>"
When I clicked on signup
Then validation message "<validationMessage>" should be displayed stating Your password must be at least 6 characters long

Examples:

| firstName | lastName | mobNoOrEmailId | password | dateOfBirth | gender | validationMessage |
| TestFn | TestLn | 1234567890 | 1234 | 1990 | FeMale | An error occurred. Please try again. |





