Feature: This feature would be creating a calculator to Add and Sub
  
   Given I have calculator

  Scenario: To Add two number
    Given I have calculator
    When I add 4 and 5
    Then I see the result as 9

  Scenario: To sub
    Given I have calculator
    When I sub 6 and 3
    Then I see the result as 3

  Scenario Outline: to add number  using scenario ouline
    Given I have calculator
    When I add <num1> and <num2>
    Then I see the result as <result>

    Examples: 
      | num1 | num2 | result |
      |    4 |    7 |     11 |
      |    4 |    5 |      9 |

  Scenario: Add number using List
    Given I have calculator
    When I add below numbers using List
      | 5 |
      | 5 |
      | 5 |
      | 5 |
    Then I see the result as 20

  Scenario: Add number using datatable
    Given I have calculator
    When I add below numbers
      | 5 |
      | 5 |
      | 5 |
      | 5 |
    Then I see the result as 20

  Scenario: calcultate the total bill of the order
    Given I have calculator
    When I order below items
      | cofee | 25 |
      | tea   | 20 |
    Then I see the result as 45
    
    
  Scenario: calcultate the total bill of the ordern using dataTable
    Given I have calculator
    When I order below items and qunatity
      | cofee | 25 |2|
      | tea   | 20 |1|
    Then I see the result as 70
