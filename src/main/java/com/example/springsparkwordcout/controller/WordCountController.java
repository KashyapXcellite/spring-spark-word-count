package com.example.springsparkwordcout.controller;

import com.example.springsparkwordcout.Model.WordCount;
import com.example.springsparkwordcout.service.WordCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class WordCountController {

    @Autowired
    WordCountService service;

    @GetMapping("/wordcount")
    public String wordcountForm(Model model) {
        model.addAttribute("wordsList", new WordCount());
        return "wordcount";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/wordcount")
    public String count(@ModelAttribute WordCount wordsList,Model model) {
        List<String> wordList = Arrays.asList(wordsList.getWords().split("\\|"));
        model.addAttribute("wordJson",service.getCount(wordList).getWordsJson().toString());
        return "sparkcount";
    }
}
