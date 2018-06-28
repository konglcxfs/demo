package com.example.service;

public class ExampleService {

    private String th;

    public ExampleService(String th){
        this.th = th;
    }

    public String replaceStr(String word,String split){
        if(null != word && !"".equals(word)){
           return word.replaceAll(split,th);
        }
        return "";
    }

}
