package com.example.keywords

import com.kms.katalon.core.annotation.Keyword

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

class FileUploadVerification {

    @Keyword
    static boolean verifyUploadedFile(String filePath, long maximumSizeInBytes = Long.MAX_VALUE) {
        if (filePath == null || filePath.trim().isEmpty()) {
            return false
        }

        Path path = Paths.get(filePath)
        return Files.isRegularFile(path) && Files.size(path) <= maximumSizeInBytes
    }
}
