Feature: Register
  I want to use this template for my Register feature file

  @Register
  Scenario: Validate whether user is registered successfully
    Given I am in the TutorialsNinja Website
    And click the My Account section and click the Register button
    When i provide the firstname, lastname, email, telephone, password, passwordConfirm
    |firstname|lastname|email|telephone|password|passwordConfirm|
    |yuvaraj|raj|yuv3120@gmail.com|1007456980|789456|789456|
    And i click the privacy policy and click the continue
    Then I should see the Registered successfully result
