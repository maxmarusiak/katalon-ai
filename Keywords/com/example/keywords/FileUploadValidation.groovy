package com.example.keywords

import com.kms.katalon.core.annotation.Keyword

class FileUploadValidation {

    /**
     * Validates that a selected upload file exists, is a regular file, has an allowed
     * extension, and does not exceed the configured size limit.
     *
     * @param filePath absolute path to the file
     * @param allowedExtensions extensions without leading dots, for example ['pdf', 'png']
     * @param maxSizeBytes maximum permitted size in bytes; use 0 for no size limit
     * @return true when all validations pass
     */
    @Keyword(keywordObject = 'File Upload')
    boolean validateFile(String filePath, List<String> allowedExtensions, long maxSizeBytes = 0L) {
        if (filePath == null || filePath.trim().isEmpty()) {
            throw new IllegalArgumentException('File path must not be blank')
        }

        File file = new File(filePath)
        if (!file.exists()) {
            throw new FileNotFoundException("Upload file does not exist: ${filePath}")
        }
        if (!file.isFile()) {
            throw new IllegalArgumentException("Upload path is not a regular file: ${filePath}")
        }

        List<String> normalizedExtensions = (allowedExtensions ?: [])
                .collect { it?.trim()?.toLowerCase()?.replaceFirst(/^\\./, '') }
                .findAll { it }

        if (!normalizedExtensions.isEmpty()) {
            String fileName = file.name
            int lastDot = fileName.lastIndexOf('.')
            String extension = lastDot >= 0 ? fileName.substring(lastDot + 1).toLowerCase() : ''
            if (!normalizedExtensions.contains(extension)) {
                throw new IllegalArgumentException(
                        "Unsupported file extension '.${extension}'. Allowed extensions: ${normalizedExtensions.join(', ')}"
                )
            }
        }

        if (maxSizeBytes < 0L) {
            throw new IllegalArgumentException('Maximum file size must be zero or greater')
        }
        if (maxSizeBytes > 0L && file.length() > maxSizeBytes) {
            throw new IllegalArgumentException(
                    "File size ${file.length()} bytes exceeds the maximum of ${maxSizeBytes} bytes"
            )
        }

        return true
    }
}
