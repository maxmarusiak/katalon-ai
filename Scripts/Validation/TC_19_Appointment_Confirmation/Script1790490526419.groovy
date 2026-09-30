import browser.ChromeProfile
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.Select

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

DriverFactory.changeWebDriver(
    ChromeProfile.createDriver()
)

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.id('btn-make-appointment')).click()

driver.findElement(By.id('txt-username')).sendKeys('John Doe')
driver.findElement(By.id('txt-password')).sendKeys('ThisIsNotAPassword')

driver.findElement(By.id('btn-login')).click()

new Select(driver.findElement(By.id('combo_facility')))
.selectByVisibleText('Tokyo CURA Healthcare Center')

driver.findElement(By.id('txt_visit_date'))
.sendKeys('01/01/2027')

driver.findElement(By.id('txt_comment'))
.sendKeys('Confirmation test')

driver.findElement(By.id('btn-book-appointment'))
.click()

assert driver.getPageSource()
.contains('Appointment Confirmation')

WebUI.closeBrowser()
