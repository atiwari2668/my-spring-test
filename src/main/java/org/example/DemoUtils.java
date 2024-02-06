package org.example;

import java.util.List;

public class DemoUtils {

    private String str1 = "string 1";
    private String str2 = str1;
    private String[] fruits = {"banana", "orange", "apple"};

    private List<String> color = List.of("red", "black", "green");

    public String getStr1(){return str1;}
    public String getStr2(){return str2;}

    public boolean isAGreater (int a, int b){
        return a > b;
    }

    public String[] getFruits () {
        return fruits;
    }

    public List<String> getColor () {
        return color;
    }

    public boolean throwException (int a) throws Exception{
        if (a < 0){
            throw new Exception("Value should not be less then 0");
        }
        return true;
    }

}
