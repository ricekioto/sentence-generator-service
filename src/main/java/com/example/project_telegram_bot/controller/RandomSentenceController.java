package com.example.project_telegram_bot.controller;

import com.example.project_telegram_bot.error.EnglishRandomServiceException;
import com.example.project_telegram_bot.service.EnglishRandomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/random")
public class RandomSentenceController {

    private final EnglishRandomService englishRandomService;

    @GetMapping("/sentence")
    public String getRandomSentenceEndpoint() throws EnglishRandomServiceException {
        return englishRandomService.getSentence();
    }

    @ExceptionHandler(EnglishRandomServiceException.class)
    public ResponseEntity<String> handleRequestServiceException(EnglishRandomServiceException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}



