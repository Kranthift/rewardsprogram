**REWARDS PROGRAM**

This application is for calculating the rewards of the customers based on the amount spent.

Local Setup for running this application :

1. Install JDK preferably Java 1.8 and set the JAVA_HOME path
2. Install Maven and set M2_HOME path
3. Install an IDE like STS or IntelliJ
4. Install MySQL and set path variable in the system environment variables
5. Install Postman
6. Install Git

**Steps for starting the application:**

1. Start the MySQL server by configuring the Environmental variables.
2. Start the MySQL command line client and provide the password.
3. Once the MySQL server starts create a schema with name "rewardprogram".
4. Clone the code into local machine using git commands
5. Import the code into any IDE.
6. The application sever port is given 9090 this can be configured in application property file.
7. Update the MySQL username and password in the application property file as per your system.
8. Run the application.

**Postman Curls in Order** :

1. curl --location 'http://localhost:9090/rewardsprogram/customerRegistration' \
--header 'Content-Type: application/json' \
--data-raw '{
"firstName": "South",
"lastName": "Star",
"userName": "SouthStar",
"emailId": "SouthStar@gmail.com",
"mobileNumber": "2203304401"
}'

2. curl --location 'http://localhost:9090/rewardsprogram/transaction' \
   --header 'Content-Type: application/json' \
   --data '{ "customerId":"2", "transactionAmount":"120" }'

3. curl --location 'http://localhost:9090/rewardsprogram/reward_points/2'

4. curl --location 'http://localhost:9090/rewardsprogram/total_reward_points/2' \
   --header 'startDate;' \
   --header 'endDate;'
