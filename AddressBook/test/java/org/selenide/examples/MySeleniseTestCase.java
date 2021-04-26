package org.selenide.examples;

import com.codeborne.selenide.Selectors;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class MySeleniseTestCase {

@Test
public void userCanLoginByUsername() {
        open("http://bredogenerator.xyz/addressbook/addressbook/");
        $(By.name("user")).setValue("admin");
        $(By.name("pass")).setValue("secret");
        $(byValue("Войти")).click();

        $(byText("New features")).should(disappear);

        sleep(6000);
        }
}