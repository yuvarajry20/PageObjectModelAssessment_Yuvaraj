Feature: Login
  I want to use this template for my Login feature file

  @ValidCredentials
  Scenario Outline: Validate Valid Credentials 
    Given I am in the TutorialsNinja Website
    And click the My Account section and click the Login button
    When i provide the "<email>", "<password>"
    And i click the login button
    Then I validate the "<result>"

    Examples: 
      |email             |password |result                                               |
      |yuvaraj@gmail.com |789456   |Logout                                               |
      |auj@gmail.com     |123456   |Warning: No match for E-Mail Address and/or Password.|
      |yuvaraj@gmail.com |         |Warning: No match for E-Mail Address and/or Password.|
      |                  |789456   |Warning: No match for E-Mail Address and/or Password.|