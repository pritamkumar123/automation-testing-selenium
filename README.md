# Automation Testing with Selenium

This repository contains a comprehensive **Test Automation Framework** for web applications, utilizing **Java**, **Selenium WebDriver**, **Cucumber (BDD)**, and **Rest Assured**. The framework is designed to perform **functional**, **regression**, and **smoke testing**, with a focus on maintainability and scalability. It also integrates with **Jenkins CI/CD** for automated execution.

## 🔧 Technologies Used

- **Programming Language:** Java
- **Automation Tools:** Selenium WebDriver, Cucumber (BDD), Rest Assured
- **Build & Dependency Management:** Maven
- **Continuous Integration/Continuous Deployment (CI/CD):** Jenkins
- **Version Control:** Git/GitHub
- **Issue Tracking:** Jira
- **Browser Testing:** Chrome, Firefox, Edge, Safari

## 📁 Project Structure

```
src/
 ├── main/java       # Page Object Classes
 ├── test/java       # Step Definitions & Test Runner
 ├── resources       # Feature Files, Config Files
pom.xml              # Maven configuration
```

## 🚀 Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/pritamkumar123/automation-testing-selenium.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd automation-testing-selenium
   ```

3. **Install dependencies using Maven:**

   ```bash
   mvn clean install
   ```

4. **Run tests using Maven:**

   ```bash
   mvn test
   ```

## 🧪 Features

- Developed using **Java + Selenium WebDriver + Cucumber (BDD)**.
- Implements **Page Object Model (POM)** design pattern for maintainable automation scripts.
- Supports **cross-browser testing** (Chrome, Firefox, Edge, Safari).
- Automated **REST API testing** using **Rest Assured**.
- Integrated with **Jenkins CI/CD** for parallel execution and scheduled runs.
- Detailed logging and **screenshot capture** for failed test cases.
- Agile-friendly with **test coverage**, **risk analysis**, and **defect tracking** in Jira.
- Code quality maintained through **code reviews** and reusable step definitions.

## 🛠 Scheduled Execution

To schedule the execution of tests, you can integrate this framework with Jenkins. Here's a basic guide:

1. **Install Jenkins** on your machine or use a cloud-based Jenkins service.

2. **Create a new Jenkins job**:

   - Choose **Freestyle project**.
   - Under **Source Code Management**, select **Git** and provide the repository URL.
   - Under **Build Triggers**, select **Build periodically** and set the schedule using cron syntax (e.g., `H 0 * * *` for daily midnight runs).
   - Under **Build**, add a **Build step** to execute shell commands:

     ```bash
     mvn clean test
     ```

3. **Save the job** and Jenkins will execute the tests as per the defined schedule.

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. **Fork** the repository.
2. **Clone** your fork:

   ```bash
   git clone https://github.com/your-username/automation-testing-selenium.git
   ```

3. **Create a new branch**:

   ```bash
   git checkout -b feature/YourFeature
   ```

4. **Make your changes** and **commit** them:

   ```bash
   git commit -m "Add new feature"
   ```

5. **Push** to your fork:

   ```bash
   git push origin feature/YourFeature
   ```

6. **Create a pull request** to the main repository.

## 📬 Contact

- **Author:** Pritam Kumar Das
- **GitHub:** [https://github.com/pritamkumar123](https://github.com/pritamkumar123)
- **Email:** mynamepritamdas@gmail.com
