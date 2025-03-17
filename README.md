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
   cd ravenholm-requiem

4. Run Maven command
   mvn clean test
