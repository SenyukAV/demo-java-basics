package by.itacademy.aliaksandrsianiuk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {
    protected String HOME_URL = BASE_URL + "wiki/Main_Page";

    @Override
    public void open() {
        super.BASE_URL=HOME_URL;
        super.open();
    }

    public String getTitel() {

        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to(HOME_URL);
        return webDriver.getTitle();
    }

    public void   clickLogin() {
        WebDriver webDriver=new ChromeDriver();
        webDriver.navigate().to(HOME_URL);
        String Path="//*[@id=\"container\"]/div/div/header/div[2]/div/div[2]/div[3]/div[2]/div[1]/div[1]";
        By by=By.xpath(Path);
        WebElement webElement=webDriver.findElement(by);
        webElement.click();
        System.out.println("Пользователь кликнул по кнопке Войти");

    }


}
