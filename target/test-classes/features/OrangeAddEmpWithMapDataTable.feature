Feature: Add Employee

  Scenario: Add five employees to Orange HRM
    Given I have already landed on login page
    When The title of the Webpage is OrangeHRM
    Then I enter username and password
      | username | password |
      | admin    | admin123 |
    Then I click on login button
    Then I clicks on PIM link and then on Add Employee
    Then I enter data to the fields and click save
      | FirstName | MiddleName | LastName |
      | Asel      | M.         | Umer     |
      | Haider    | S.         | Khan     |
      | Alex      | B.         | Bishop   |
      | Sumair    | M.         | Javid    |
      | Wiqas     | K.         | Khan     |
    And I close the browser
