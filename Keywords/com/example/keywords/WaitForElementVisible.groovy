package com.example.keywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class WaitForElementVisible {

    @Keyword
    static boolean waitUntilVisible(TestObject testObject, int timeoutInSeconds = 30) {
        return WebUI.waitForElementVisible(testObject, timeoutInSeconds)
    }
}
