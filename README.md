# Ravenholm Requiem - Selenium TestNG Login Automation

This project demonstrates how to automate a login page using **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)**. The script uses CSS selectors to locate elements and includes test cases for both successful and invalid login scenarios.

---

## **Instructions on How to Run the Script**

### **Prerequisites**

Before running the script, ensure you have the following installed:

1. **Java Development Kit (JDK)**:
   - Download and install JDK 8 or higher from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Maven**:
   - Download and install Maven from [Apache Maven](https://maven.apache.org/download.cgi).

3. **ChromeDriver**:
   - Download the ChromeDriver executable that matches your Chrome browser version from [ChromeDriver](https://sites.google.com/chromium.org/driver/).
   - Place the `chromedriver` executable in a directory and note its path.

4. **Git**:
   - Install Git from [Git](https://git-scm.com/downloads).

---

### **Steps to Run the Script**

#### **Step 1: Clone the Repository**
1. Open a terminal or command prompt.
2. Run the following command to clone the repository:

   ```bash
   git clone https://github.com/semihaydin/ravenholm-requiem.git

3. Navigate to the project directory
   ```bash
   cd ravenholm-requiem

5. Run Maven command
   ```bash
   mvn clean test
   
#Explanation of the Script's Functionality
1. Page Object Model (POM)

The project follows the Page Object Model (POM) design pattern, which separates the test logic from the page-specific logic. This makes the code modular, reusable, and easier to maintain.

    LoginPage.java: Contains the locators and methods for interacting with the login page.

    BaseTest.java: Handles the setup and teardown of the WebDriver.

    LoginTest.java: Contains the TestNG test cases for the login functionality.

2. CSS Selectors

The script uses CSS selectors to locate elements on the login page. For example:

    [data-test='username']: Locates the username field.

    [data-test='password']: Locates the password field.

    [data-test='login-button']: Locates the login button.

3. TestNG Framework

TestNG is used for organizing and running the test cases. Key features include:

    Annotations: @BeforeMethod, @AfterMethod, and @Test are used to define setup, teardown, and test methods.

    Assertions: Used to validate the expected outcomes of the tests.

4. Test Cases

The script includes two test cases:

    testSuccessfulLogin:

        Enters valid credentials (username and password).

        Clicks the login button.

        Verifies that the user is redirected to the expected URL after login.

    testInvalidLogin:

        Enters invalid credentials.

        Clicks the login button.

        Verifies that an error message is displayed.

5. WebDriver Management

The BaseTest.java class handles the initialization and cleanup of the WebDriver. This ensures that each test runs in a fresh browser session.

Dependencies

The project uses the following dependencies, which are managed by Maven:

    Selenium WebDriver: For browser automation.

    TestNG: For test execution and reporting.

    WebDriverManager: For managing WebDriver executables (optional).

These dependencies are defined in the pom.xml file.
