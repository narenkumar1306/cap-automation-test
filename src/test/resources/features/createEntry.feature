Feature: As a User, I want to create an entry

  Background:
    Given a browser is at hotel management platform "http://localhost:3003/"
    And clicks on the login menu
    And enters the username as "admin" and password ad "password"
    When I clicks on the login button

  Scenario: Login
    Then I should see create button on the home page

  Scenario: Create an Entry
    And enters hotel name as "Hilton"
    And enters address as "Heathrow terminal 3"
    And enters owner as "Conrad Hilton"
    And enters phone number as "123456"
    And enters email as "123@gmail.com"
    When I clicks on the create button
    Then I should see an entry is created

  Scenario: Delete an Entry
    When I click on deleteIcon
    Then I should see entry is deleted

@Create
  Scenario Outline: Multiple Entries
    And enters "<hotelname>","<address>","<owner>", "<phonenumber>" and "<email>"
    When I clicks on the create button
    Then I should see an entry is created
    Examples:
      | hotelname    |  | address    |  | owner |  | phonenumber |  | email            |
      | ibis         |  | london     |  | abc   |  | 42351       |  | abc@yahoo.com    |
      | marriot      |  | birmingham |  | bcd   |  | 86759       |  | 456@gmail.com    |
      | travel lodge |  | manchester |  | cde   |  | 09643       |  | 0987@hotmail.com |
