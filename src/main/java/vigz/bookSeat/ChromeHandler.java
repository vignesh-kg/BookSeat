package vigz.bookSeat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHandler
{
    public WebDriver openNewChromeSession()
    {
        // Use WebDriverManager to setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        return driver;
    }

    public void getFlexiSite(WebDriver driver)
    {
        String flexUrl = System.getProperty("flexUrl");
        driver.get(flexUrl);
    }
}