package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDef.Hooks;

public class login_page {

    public login_page(WebDriver driver) {Hooks.driver = driver; }

    public WebElement usernamePOM () {return Hooks.driver.findElement(By.className("email"));}
    public WebElement passwordPOM () {return Hooks.driver.findElement(By.id("Password"));}

    public void loginPage (String username , String Password)
    {
        //enter username and password using POM
        usernamePOM().sendKeys(username);
        passwordPOM().sendKeys(Password);
    }


}
