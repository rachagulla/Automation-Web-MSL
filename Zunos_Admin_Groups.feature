Feature: TCs from Groups Page > New Group Page 
	


Scenario: Groups Page > Create New Group
    Given User navigate to Login Page 
	When User enters username "lakshmi.chaitanya@sephora.com" 
	And User click on next button 
	Then User enters password "Ilovesaahithi1" 
	And User click on login button 
	Then Verify login successfull with title "Zunos Admin"
     Given User is on home page
     When User click on users button
     And User click on groups button
     Then User click on newgroup button
     And User click on add thunbnail icon
     And User click on existing images
     Then User select image
     And User click on select button
     And User enters code "zunos_code01"
     And User enters name "zunos_name"
     And User enters managers "Jacqueline Crapo"
     And User click on active toggle button
     And User click on manager web client active toggle button
      And User click on save button
      When User click on users button
      And User click on groups button
     Then Verify new group created successfully with code "zunos_code01"
     And User select group from groups
     Then User click on delete button
     And User click on login icon
     And User click on signout button
     
     

     
           
      
 
     
     
     
     
     
     
     
     
     
     

	
 
