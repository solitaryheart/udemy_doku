Feature: Login Functionality
		Here we will test login by admin, super admin, guest and customers
		

@Regression		
Scenario Outline: Login by customer
		  Given User is on Login page
		  When user enter username <username>
		  And User enter password <password>
		  And click on signin button
		  Then User should be logged in successfully
		  
		  Examples:
			| username | password |
			| testing | abc@123 |
			| testing1 | abc1234 |
			| testing2 | abc@12345 |
			
			
			
			
		
@Smoke @Regression
Scenario: Login by Guest User
		   Given User open browser
		   And Enter url
		   When User click on Guest user link
		   And User enter email id
		   And click on Submit
		   Then User should be logged in as a Guest user
		   

@Smoke
Scenario: Login by Super Admin
          Given User is on Login page
		  When user enter username "testing"
		  And  user enter password "abc"
		  And click on Login Button
		  Then User logged in successfully
		  