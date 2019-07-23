package com.example.springsparkwordcout.Model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Map;

public class WordJson {

    @JsonProperty(value="words-json")
    private Map<String, Long> wordsJson;

    public Map<String, Long> getWordsJson() {
        return wordsJson;
    }

    public void setWordsJson(Map<String, Long> wordsJson) {
        this.wordsJson = wordsJson;
    }
}
