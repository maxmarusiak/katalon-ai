import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
WebUI.click(findTestObject('Object Repository/Login/btn_MakeAppointment'))
WebUI.setText(findTestObject('Object Repository/Login/txt_Username'), 'Invalid User')
WebUI.setText(findTestObject('Object Repository/Login/txt_Password'), 'ThisIsNotAPassword')
WebUI.click(findTestObject('Object Repository/Login/btn_Login'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/msg_LoginFailed'), 10)
WebUI.closeBrowser()