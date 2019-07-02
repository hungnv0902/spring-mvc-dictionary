package com.codegym.persistence;

import java.util.HashMap;
import java.util.Map;

public class DictionnaryPersistenceImpl implements GeneralPersistence {
 HashMap<String, String> listDictionary = new HashMap<>();
    {
        listDictionary.put("hello", "xin chao");
        listDictionary.put("goodbye", "tam biet");
        listDictionary.put("computer", "may tinh");
        listDictionary.put("love", "yeu");
    }
    @Override
    public String translate(String english) {
        return listDictionary.get(english);
    }
}
