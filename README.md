# puppyProject
Automation of puppy adoption agency


- This project use Maven so the dependencies are gathered in a pom.xml file. Make sure the pom.xml is imported on your project.

- This project use ChromeDriver as open source tool for automated testing of webapps. The current ChromeDriver version for this proyect is 85.0.4183.87, Make sure your chrome browser has a compatible version, or you can also download a compatible one, depending on your case.

- Change the chromedriver path according to your case. This project locates the cromedriver at the following path: /Users/user/fp1/PuppyadoptionAgency/drivers/chromedriver850418387,  this is indicated in the class called "MainPuppyAdoption" line 24, so you will need to modify this line according to your local project.
Specifically you will have to modify the following line:

String chromePath = System.getProperty("user.dir") + "/drivers/chromedriver850418387";
