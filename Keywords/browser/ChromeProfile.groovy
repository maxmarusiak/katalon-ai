package browser

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

class ChromeProfile {

    static WebDriver createDriver() {

        ChromeOptions options = new ChromeOptions()

        options.addArguments(
            "--user-data-dir=C:\\KatalonChromeProfile"
        )

        options.addArguments(
            "--disable-notifications"
        )

        return new ChromeDriver(options)
    }
}