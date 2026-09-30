import browser.ChromeProfile

import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

DriverFactory.changeWebDriver(
    ChromeProfile.createDriver()
)

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.id('btn-make-appointment')).click()

driver.findElement(By.id('txt-username')).sendKeys('InvalidUser')

driver.findElement(By.id('txt-password')).sendKeys('ThisIsNotAPassword')

driver.findElement(By.id('btn-login')).click()

WebUI.delay(2)

assert driver.getPageSource().contains('Login failed')

WebUI.closeBrowser()

