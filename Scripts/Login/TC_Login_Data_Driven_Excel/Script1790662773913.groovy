import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
try {
    WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
    WebUI.click(findTestObject('Object Repository/Login/btn_MakeAppointment'))
    WebUI.setText(findTestObject('Object Repository/Login/txt_Username'), username)
    WebUI.setText(findTestObject('Object Repository/Login/txt_Password'), password)
    WebUI.click(findTestObject('Object Repository/Login/btn_Login'))

    if (expectedResult == 'SUCCESS') {
        WebUI.verifyTextPresent('Make Appointment', false)
    } else {
        WebUI.verifyTextPresent('Login failed', false)
    }
} finally {
    WebUI.closeBrowser()
}