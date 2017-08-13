package com.devix.www;

public class Main {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("abc");
        int result = stringBuffer.indexOf("bc");
        System.out.println(result);
        int result2 = stringBuffer.indexOf("de");
        System.out.println(result2);
    }
}
