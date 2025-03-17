package utils;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][]{
                {"testuser1", "testpassword1"},
                {"testuser2", "testpassword2"}
        };
    }

    @DataProvider(name = "invalidLoginData")
    public Object[][] getInvalidLoginData() {
        return new Object[][]{
                {"invalid@example.com", "wrongpassword"},
                {"testuser@example.com", "incorrect"}
        };
    }
}