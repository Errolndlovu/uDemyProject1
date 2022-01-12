
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestClass1 {

    public static  WebDriver driver;

    @BeforeMethod
    public void launchDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\6030\\Documents\\TestingUdemy\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
//        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }

    @Test
    public void Test1(){

        driver.navigate().to("https://www.LinkedIn.com");
        System.out.println("Test 1 complete" + driver.getTitle());
    }
//    @Test
//    public void Test2(){
//        driver.navigate().to("https://www.LinkedIn.com");
//        System.out.println("Test 2 complete" + driver.getTitle());
//    }
    @Test
    public void Test3(){
        driver.navigate().to("https://www.LinkedIn.com");
        System.out.println("Test 3 complete" + driver.getTitle());
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
