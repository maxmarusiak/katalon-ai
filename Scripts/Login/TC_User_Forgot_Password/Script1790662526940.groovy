import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
try {
    WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
    WebUI.click(findTestObject('Object Repository/Login/btn_MakeAppointment'))
    WebUI.click(findTestObject('Object Repository/Login/lnk_ForgotPassword'))
    WebUI.setText(findTestObject('Object Repository/Login/txt_ResetEmail'), 'registered.user@example.com')
    WebUI.click(findTestObject('Object Repository/Login/btn_ResetPassword'))
    WebUI.verifyElementText(findTestObject('Object Repository/Login/msg_ResetPasswordConfirmation'), 'If an account exists for this email, password reset instructions have been sent.')
} finally {
    WebUI.closeBrowser()
}