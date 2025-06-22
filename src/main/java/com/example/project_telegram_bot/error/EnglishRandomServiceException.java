package com.example.project_telegram_bot.error;

public class EnglishRandomServiceException extends RuntimeException {

    public EnglishRandomServiceException(String message) {
        super(message);
    }

    public EnglishRandomServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

