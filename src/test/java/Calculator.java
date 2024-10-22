import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calculator {
    @Test
    public void  test1 (){
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String xPath="/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By by= By.xpath(xPath);
        WebElement webElement =webDriver.findElement(by);
        webElement.click();

    }
}
