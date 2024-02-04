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
line 35-36 get count of items in inventory
line 37- check to make sure inventory is empty before uploading sample database
line 40-46- make outsourced parts and update each field
line 41-76- input part data and info
line 77-82- create products with info in parameters
line 84-88- save products

### F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

### G.  Modify the parts to track maximum and minimum inventory by doing the following:

### H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:


### I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


### J.  Remove the class files for any unused validators in order to clean your code.


### K.  Demonstrate professional communication in the content and presentation of your submission.
