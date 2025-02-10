import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;

public class LoginPagetest {

    @Test
    public void loginTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.invoiceplane.com/sessions/login");

        Login login = new Login(driver);

        login.setTxtUsername("guest@invoiceplane.com");
        login.setTxtPassword("demopassword");
        login.clickLogin();
    }
}