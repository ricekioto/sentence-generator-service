package com.example.project_telegram_bot.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SentenceResponse {
    @JsonProperty("content")
    private String content;

}
