import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
try {
    WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
    WebUI.click(findTestObject('Object Repository/Login/btn_MakeAppointment'))
    WebUI.setText(findTestObject('Object Repository/Login/txt_Username'), 'John Doe')
    WebUI.setText(findTestObject('Object Repository/Login/txt_Password'), 'InvalidPassword123!')
    WebUI.click(findTestObject('Object Repository/Login/btn_Login'))
    WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)
} finally {
    WebUI.closeBrowser()
}