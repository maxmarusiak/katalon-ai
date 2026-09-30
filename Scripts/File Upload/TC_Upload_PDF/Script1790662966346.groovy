import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
try {
    WebUI.navigateToUrl('https://your-application.example.com/upload')
    WebUI.uploadFile(findTestObject('Object Repository/File Upload/input_File'), pdfFilePath)
    WebUI.verifyElementVisible(findTestObject('Object Repository/File Upload/msg_UploadSuccess'))
} finally {
    WebUI.closeBrowser()
}