import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
WebUI.click(findTestObject('Object Repository/Login/btn_MakeAppointment'))
WebUI.setText(findTestObject('Object Repository/Login/txt_Username'), 'John Doe')
WebUI.setText(findTestObject('Object Repository/Login/txt_Password'), 'ThisIsNotAPassword')
WebUI.click(findTestObject('Object Repository/Login/btn_Login'))
WebUI.verifyTextPresent('Make Appointment', false)
WebUI.closeBrowser()