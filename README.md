<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

### A.  Create your subgroup and project by logging into GitLab using the web link provided and using the “GitLab How-To” web link, and do the following:

### B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.


### C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Mainscreen.html:
line 14- changed title of page to my cookie shop
line 16- added a background color to the page
line 19- changed font size and name of shop
line 21- changed to ingredients
line 32- added new background color
line 53- change title of table to cookies
line 71- changed name of column in table to cookies

### D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
about.html:
line 1-10- initialize the html page
line 12-15- set the title and color of the page
line 16- create the header for the page 
line 18-19- added an about section explaining the business to the customer
line 21- add a button to return to the main screen

aboutcontroller.html:
line 1-5- imports
line 7-13- mapping about template to /about request

Mainscreen.html: 
line 21- Added an about us button to the top of the main screen

### E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
bootstrapdata.java
line 35-36 get count of items in inventory
line 37- check to make sure inventory is empty before uploading sample database
line 40-46- make outsourced parts and update each field
line 41-76- input part data and info
line 77-82- create products with info in parameters
line 84-88- save products

### F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
fail.html
line 1-12- html file template to display the buy was a fail
suc.html
line 1-12- html file template to display the buy was a success
productservice.java
line 20- new method declaration in interface for decrement
productserviceimpl.java 
line 69-80- method implementation of decrement  
line 71- find product by id
line 73- check if inventory less than 1
line 74- decrement the inventory
line 75- save the product to repo
line 76- return true
line 78- return false otherwise
Mainscreen.html
line 86- add button to table to buy 
Mainscreencontroller.java
line 13- import ability to request parameters
line 56-62- get mapping in controller for the button to decrement inventory if possible

### G.  Modify the parts to track maximum and minimum inventory by doing the following:
application.properties
line 6- changed the name of the data file saved
Part.java 
line 32-33- declare min and max variables
line 42- add min and max to constructor
line 46-47- initialize min and max
line 50-51- add min and max to constructor
line 56-57- initialize min and max
line 92-106- getters and setters for min and max
line 108-113- method to check if inventory count is above max or below min
mainscreen.html
line 39-40- add column header to table for min and max
line 49-50- add columns to table for min and max
inhousepartform.html
line 24-25- added field to the inhouse part form for min and max inventory
outsourcedpartform.html
line 25-26- added field to the outsourced part form for min and max inventory
bootstrapdata.java
line 47-48-set min and max for part 1
line 57-58-set min and max for part 2
line 66-67-set min and max for part 3
line 75-76-set min and max for part 4
line 84-85-set min and max for part 5
addinhousepartcontroller.java
line 42- if statement to see if form part inventory number is within the forms min and max
line 54- else statement to see send error message to page and make user reenter form
addoutsourcedpartcontroller.java
line 43- if statement to see if form part inventory number is within the forms min and max
line 55- else statement to see send error message to page and make user reenter form

### H.  Add validation for between or at the maximum and minimum fields.
AddProductController.java
line 19- import set
line 80- get set of all parts associated with product
line 81- loop through all parts
line 82- check if part inventory is less than adjusted product total
line 83- send error message
line 84-98- return productform template with associated parts and available parts values correct

### I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
PartTest.java
line 129-136- unit test for get min
line 137-144- unit test for set min
line 145-152- unit test for get max
line 153-160- unit test for set max

### J.  Remove the class files for any unused validators in order to clean your code.

