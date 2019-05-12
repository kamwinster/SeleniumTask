import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class YandexMarket {
    public WebDriver driver;

    @Before
    public void start(){
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void myfirsttest() {
        driver.get("https://www.yandex.ru/");
        driver.findElement(By.xpath(".//*[text()='Маркет']/..")).click();
        driver.findElement(By.xpath(".//*[text()='Компьютерная техника']/..")).click();
        driver.findElement(By.xpath(".//*[text()='Ноутбуки']/..")).click();
    }
}
