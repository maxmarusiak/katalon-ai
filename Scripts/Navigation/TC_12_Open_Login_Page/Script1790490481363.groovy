import browser.ChromeProfile
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

DriverFactory.changeWebDriver(
    ChromeProfile.createDriver()
)

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.id('btn-make-appointment')).click()

assert driver.getCurrentUrl().contains('profile.php')

WebUI.closeBrowser()
