package com.example.project_telegram_bot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class BuildingUrlService {
    @Value("${url.generate-website}")
    private String generatorUrl;
    private final String COUNT = "1";
    private final String LANGUAGE = "eng";

    public String getGeneraterUrl() {
        String url = UriComponentsBuilder.fromUriString(generatorUrl)
                .queryParam("language", LANGUAGE)
                .queryParam("count", COUNT)
                .build()
                .toUriString();
        return url;
    }
}


