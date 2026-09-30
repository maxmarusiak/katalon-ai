import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
WebUI.click(findTestObject('Object Repository/Login/btn_MakeAppointment'))
WebUI.click(findTestObject('Object Repository/Login/btn_Login'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/msg_LoginFailed'), 10)
WebUI.closeBrowser()