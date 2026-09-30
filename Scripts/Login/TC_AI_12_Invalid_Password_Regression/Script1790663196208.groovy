import browser.ChromeProfile
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

DriverFactory.changeWebDriver(ChromeProfile.createDriver())

try {
    WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
    WebDriver driver = DriverFactory.getWebDriver()
    driver.findElement(By.id('btn-make-appointment')).click()
    driver.findElement(By.id('txt-username')).sendKeys('John Doe')
    driver.findElement(By.id('txt-password')).sendKeys('InvalidPassword123!')
    driver.findElement(By.id('btn-login')).click()
    assert driver.getPageSource().contains('Login failed!')
} finally {
    WebUI.closeBrowser()
}