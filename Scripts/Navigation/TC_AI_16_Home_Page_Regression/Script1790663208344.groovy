import browser.ChromeProfile
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

DriverFactory.changeWebDriver(ChromeProfile.createDriver())

try {
    WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
    WebDriver driver = DriverFactory.getWebDriver()
    assert driver.getTitle().contains('CURA')
} finally {
    WebUI.closeBrowser()
}