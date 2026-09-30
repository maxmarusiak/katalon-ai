import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
WebUI.click(findTestObject('Object Repository/Login/btn_MakeAppointment'))
WebUI.setText(findTestObject('Object Repository/Login/txt_Username'), 'John Doe')
WebUI.setEncryptedText(findTestObject('Object Repository/Login/txt_Password'), 'ThisIsNotAPassword')
WebUI.click(findTestObject('Object Repository/Login/btn_Login'))
WebUI.verifyTextPresent('Make Appointment', false)
WebUI.click(findTestObject('Object Repository/Login/lnk_Logout'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Login/btn_MakeAppointment'), 10)
WebUI.verifyTextNotPresent('Make Appointment', false)
WebUI.closeBrowser()