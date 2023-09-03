package CRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {this.driver = driver; }

    public void loginAs(String email, String password) {
        WebElement loginInput = driver.findElement(By.id("user_name")); 
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.id("username_password")); 
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        WebElement signInButton = driver.findElement(By.id("bigbutton"));
        signInButton.click();
    }
}
