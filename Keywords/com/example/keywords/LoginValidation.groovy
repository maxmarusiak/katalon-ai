package com.example.keywords

import com.kms.katalon.core.annotation.Keyword

class LoginValidation {

    @Keyword
    static boolean validateLogin(String username, String password, String expectedUsername, String expectedPassword) {
        if (username == null || password == null) {
            return false
        }

        return username == expectedUsername && password == expectedPassword
    }
}
