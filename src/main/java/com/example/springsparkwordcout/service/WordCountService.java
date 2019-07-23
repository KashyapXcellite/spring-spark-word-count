package com.example.springsparkwordcout.service;

import com.example.springsparkwordcout.Model.WordJson;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordCountService {

    @Autowired
    JavaSparkContext sc;

    public WordJson getCount(List<String> wordList) {
        JavaRDD<String> words = sc.parallelize(wordList);
        WordJson wordCounts = new WordJson();
        wordCounts.setWordsJson(words.countByValue());
        return wordCounts;
    }
}
