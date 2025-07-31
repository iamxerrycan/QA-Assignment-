# Janitri Login Automation

This is an automated test suite for testing the login functionality of the Janitri web application using **Selenium WebDriver**, **TestNG**, and **Maven**.

## 📁 Project Structure

```

JanitriLoginAutomation/
├── pom.xml
├── README.md
├── testng.xml
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/janitri/pages/LoginPage.java
│ └── test/
│ └── java/
│ ├── com/janitri/base/BaseTest.java
│ └── com/janitri/tests/LoginTest.java
└── target/

```

## ✅ Features Covered

- Verify login button is disabled when fields are empty
- Verify error message on invalid credentials
- Toggle password visibility (eye icon test)
- UI elements verification (optional, test skipped by default)

## 🧪 Tools & Technologies

- Java
- Selenium WebDriver
- TestNG
- Maven
- ChromeDriver

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/iamxerrycan/QA-Assignment-
cd QA-Assignment-

```

## Install Dependencies

```
mvn clean install

```

## Run the Tests

```
mvn test

```

## Test Cases Summary

```

| Test Case Name                            | Description                                            |
| ----------------------------------------- | ------------------------------------------------------ |
| testLoginButtonDisabledWhenFieldsAreEmpty | Validates login button is disabled if inputs are empty |
| testInvalidLoginShowsErrorMessage         | Verifies error message appears on wrong credentials    |
| testPasswordMaskedToggle                  | Checks visibility toggle (eye icon) for password field |
| testUIElementsPresent *(optional)*        | Checks presence of all required login UI elements      |


```

## Test Reports

```
/target/surefire-reports/

```

##  Author
Rajshish Singh
Frontend / Full-Stack Developer / QA
