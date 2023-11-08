package vigz.bookSeat;

import org.openqa.selenium.WebDriver;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Let's book your seat");
        ChromeHandler chromeHandler = new ChromeHandler();
        WebDriver driver = chromeHandler.openNewChromeSession();
        chromeHandler.getFlexiSite(driver);
        try
        {
            Thread.sleep(7000);
        }
        catch (Exception e){}

        driver.quit();
    }
}