Test Automation Framework  Architecture

Summary
This framework provides a simple, optimized, and maintainable automation structure by separating setup logic from test logic, supporting cross-browser testing, and ensuring independent test execution.

The framework follows a Base Test Class approach, where all common setup and teardown logic is centralized in one place.

Key Concepts Used
- Inheritance
- TestNG Annotations
- Parameterization
- Cross-Browser Testing
- Code Reusability


BaseTest Class What it does
- Initializes WebDriver
- Launches browser dynamically
- Opens application URL
- Closes browser after execution

How it works
- WebDriver is declared as protected so child classes can access it.
- Browser and URL are read from testng.xml.
- Browser is selected at runtime (Chrome, Firefox, Edge).
- @BeforeClass launches the browser once per test class.
- @AfterClass closes the browser.
- Why this approach
- Avoids duplicate code
- Makes tests easy to maintain
- Allows cross-browser execution without code changes


Test Classes (Example: AmazonTest) What they do
- Contain only test validation logic
- Verify application behavior (Title, URL, etc.)

How they work
- Extend BaseTest
- Use WebDriver provided by parent class
- Do not initialize WebDriver

Why this approach
- Clear separation of setup and test logic
- Tests remain independent
- Easier debugging and execution

Test Design Principles
- Each test is independent
- Tests follow Arrange → Act → Assert
- No dependency between test cases
- Safe for parallel execution
-

Execution Control
- Configuration is managed via testng.xml
- Browser and URL can be changed without modifying code
- Same tests run on multiple browsers
