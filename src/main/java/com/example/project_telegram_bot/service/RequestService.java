package com.example.project_telegram_bot.service;

import com.example.project_telegram_bot.entity.SentenceResponse;
import com.example.project_telegram_bot.error.RequestServiceException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RequestService {
    private final RestTemplate restTemplate;

    public RequestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public SentenceResponse getSentenceResponse(String url) {
        try {
            SentenceResponse[] responseEntity = restTemplate.getForObject(url, SentenceResponse[].class);
            if (responseEntity.length != 0) {
                return responseEntity[0];
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new RequestServiceException("Ошибка во время запроса: ", e);
        }
    }
}
