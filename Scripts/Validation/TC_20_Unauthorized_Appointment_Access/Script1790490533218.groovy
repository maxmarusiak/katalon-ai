import browser.ChromeProfile
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

DriverFactory.changeWebDriver(
    ChromeProfile.createDriver()
)

WebUI.navigateToUrl(
'https://katalon-demo-cura.herokuapp.com/#appointment'
)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.delay(3)

assert driver.getCurrentUrl().contains('cura')

WebUI.closeBrowser()
