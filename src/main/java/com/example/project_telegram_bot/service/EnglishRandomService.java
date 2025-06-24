package com.example.project_telegram_bot.service;

import com.example.project_telegram_bot.entity.SentenceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnglishRandomService {
    @Value("${url.generate-website}")
    private String url;
    private final RequestService requestService;
    private final BuildingUrlService buildingUrlService;

    public String getSentence() {
        String url = buildingUrlService.getGeneraterUrl();
        SentenceResponse response = requestService.getSentenceResponse(url);
        String sentence = response.getContent();
        return sentence;
    }
}
