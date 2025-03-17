### **What Does This Program Do?**
This program is a **test automation framework** built to automate the testing of the **Practice Software Testing** website ([https://practicesoftwaretesting.com](https://practicesoftwaretesting.com)). It simulates real user interactions with the website, such as:

1. **Registering a new user**.
2. **Logging in** with valid and invalid credentials.
3. **Searching for products**.
4. **Browsing product categories**.
5. **Adding and removing products** from the cart.
6. **Completing the checkout process**.

The program uses **Selenium WebDriver** to control the browser and **TestNG** to manage and run the tests. It also includes **logging** and **data-driven testing** to make the tests more robust and maintainable.

---

### **Key Components of the Program**

#### **1. Page Object Model (POM)**
The program uses the **Page Object Model** design pattern, which is a best practice in test automation. Here’s how it works:
- Each page of the website (e.g., Home Page, Login Page, Cart Page) is represented by a **Java class**.
- These classes contain:
    - **Web elements** (e.g., buttons, text fields) and their locators (e.g., IDs, XPaths).
    - **Methods** to interact with those elements (e.g., `clickLoginButton()`, `enterUsername()`).
- This makes the code modular, reusable, and easy to maintain.

#### **2. Test Classes**
The tests are organized into separate classes, each focusing on a specific functionality:
- **RegisterTests**: Tests user registration.
- **LoginTests**: Tests login with valid and invalid credentials.
- **SearchTests**: Tests the search functionality.
- **CategoryTests**: Tests browsing product categories.
- **ProductTests**: Tests product-related actions (e.g., adjusting price range).
- **CartTests**: Tests adding/removing products from the cart.
- **CheckoutTests**: Tests the checkout process.
- **ComprehensiveFlowTests**: Combines all the above tests into one end-to-end flow.

#### **3. Utilities**
The program includes utility classes to handle common tasks:
- **ConfigReader**: Reads configuration values (e.g., browser, URL) from a `config.properties` file.
- **DataProviderUtil**: Provides test data for data-driven testing (e.g., multiple sets of login credentials).
- **LoggerUtil**: Logs test execution details (e.g., steps, errors) using Log4j.
- **BrowserFactory**: Manages browser initialization (e.g., Chrome, Firefox, Edge).

#### **4. Hooks**
The `Hooks` class handles setup and teardown for all tests:
- **BeforeMethod**: Initializes the browser and navigates to the website before each test.
- **AfterMethod**: Closes the browser after each test.

#### **5. TestNG**
TestNG is used to:
- Define and run test suites.
- Manage test dependencies (e.g., run `LoginTests` before `CartTests`).
- Generate test reports.

---

### **How Does It Work?**
Here’s a step-by-step breakdown of how the program works:

#### **1. Setup**
- The program reads the browser and URL from the `config.properties` file.
- It initializes the browser using **WebDriverManager**, which automatically downloads the correct WebDriver executable.

#### **2. Test Execution**
- Each test class performs specific actions on the website:
    - **RegisterTests**: Fills out the registration form and submits it.
    - **LoginTests**: Enters valid/invalid credentials and checks if login succeeds or fails.
    - **SearchTests**: Enters a search term and verifies the results.
    - **CategoryTests**: Navigates to a category and verifies the products displayed.
    - **ProductTests**: Adjusts the price range slider and verifies the filtered products.
    - **CartTests**: Adds a product to the cart, verifies it’s added, and then removes it.
    - **CheckoutTests**: Enters shipping details and completes the checkout process.

#### **3. Logging**
- Every action (e.g., clicking a button, entering text) is logged using Log4j.
- If a test fails, the error is logged for debugging.

#### **4. Reporting**
- TestNG generates a detailed report showing:
    - Which tests passed or failed.
    - The steps executed.
    - Any errors encountered.

---

### **Example: Login Test**
Here’s how the **LoginTests** class works:
1. **Navigate to the Login Page**:
    - The program clicks the "Sign In" link on the Home Page.
2. **Enter Credentials**:
    - It enters the username and password (provided by the `DataProviderUtil` class).
3. **Submit the Form**:
    - It clicks the "Login" button.
4. **Verify the Result**:
    - If the credentials are valid, it verifies that the user is logged in.
    - If the credentials are invalid, it verifies that an error message is displayed.

---

### **Why Use This Framework?**
1. **Reusability**:
    - The Page Object Model ensures that code is reusable across multiple tests.
2. **Maintainability**:
    - If the website changes, you only need to update the relevant page class (e.g., `LoginPage.java`).
3. **Scalability**:
    - You can easily add new tests or modify existing ones.
4. **Data-Driven Testing**:
    - You can test multiple scenarios (e.g., different login credentials) without writing separate tests.
5. **Cross-Browser Testing**:
    - The program can run tests on different browsers (e.g., Chrome, Firefox, Edge).

---

### **How to Run the Program**
1. **Clone the Repository**:
    - Use Git to clone the project from GitHub.
2. **Run the Tests**:
    - Use Maven to run the tests:
      ```bash
      mvn clean test
      ```
3. **View the Results**:
    - Check the TestNG report to see which tests passed or failed.

---

### **Real-Life Use Case**
Imagine you’re a QA engineer working on an e-commerce website. Before every release, you need to test:
- User registration.
- Login functionality.
- Product search and filtering.
- Cart and checkout process.

Instead of manually testing each feature, you run this program. It will:
1. Automatically test all the features.
2. Log the results.
3. Highlight any issues that need fixing.

This saves time, reduces human error, and ensures a high-quality product.

---

### **Summary**
This program is a **robust test automation framework** that:
- Simulates real user interactions with a website.
- Uses the **Page Object Model** for modular and maintainable code.
- Includes **logging**, **data-driven testing**, and **cross-browser support**.
- Generates detailed reports for easy debugging.

It’s a powerful tool for developers, QA engineers, and business owners to ensure their website works flawlessly.

