# learning-playwright

## About the Project
This project was created for learning purposes. The goal was to gain hands-on experience with automated testing, as I had limited prior exposure to this area.

Through this project, I explored:
- The basics of test automation
- How automated tests are structured
- How browser automation works using Playwright
- Generating test reports and capturing screenshots



## Learning Goals
- Understand the fundamentals of automated testing
- Learn how to write and execute tests in Java using Playwright
- Work with test frameworks (TestNG)
- Generate reports using ExtentReports
- Capture screenshots on test failures



## Tech Stack
- Java  
- Playwright (Java)  
- TestNG  
- ExtentReports  
- Maven  



## Learning Resource
This project is based on the YouTube tutorial series:

Channel: Automation Step by Step  
Playlist: Playwright Java 2025  
Link: https://www.youtube.com/playlist?list=PLhW3qG5bs-L_kJz_Z0NnLmQHwLQ_vFFD2



## What I Practiced
- Setting up Playwright with Java
- Writing basic UI tests
- Implementing Page Object Model (POM)
- Running tests with TestNG
- Handling test setup and teardown
- Capturing screenshots on failures
- Generating HTML test reports



## Project Structure
```bash
src/
├── main/
└── test/
├── base/ # Base test setup (Playwright init, teardown)
├── pages/ # Page Object classes
├── tests/ # Test classes
└── utils/ # Utilities (screenshots, reports)
```


## How to Run
1. Clone the repository  
2. Install dependencies:
   ```bash
   mvn clean install
    ```
3. Run tests:
   ```bash
   mvn test
    ```
## Notes

This is a beginner-level learning project. The focus is on understanding concepts rather than building a production-ready framework.

