package com.company.task_9_2;

import java.util.HashMap;
import java.util.Map;

public class Vocabulary {
     Map<String, String> vocabulary;

    public Vocabulary() {
        vocabulary = new HashMap<String, String>();
    }

    public void addWord(String eng, String ukr) {
        vocabulary.put(eng, ukr);
    }

    public Map<String, String> getVocabulary() {
        return vocabulary;
    }
}
