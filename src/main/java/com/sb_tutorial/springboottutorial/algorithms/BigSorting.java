package com.sb_tutorial.springboottutorial.algorithms;

import java.util.Comparator;
import java.util.List;

public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
        unsorted.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return compareStr(o1, o2);
            }
        });
        return unsorted;
    }

    public static String trim(String num){
        System.out.printf("Trim: (%s) -> ", num);
        num = num.trim();
        while(num.charAt(0) == '0'){
            num = num.substring(1);
        }
        if(num.isEmpty() || num.isBlank()) return "0";
        System.out.printf("(%s)\n", num);
        return num;
    }

    public static int compareStr(String num1, String num2) {
        //num1 = trim(num1);
        //num2 = trim(num2);
        if (num1.length() != num2.length())
            return (num1.length() - num2.length()) / Math.abs(num1.length() - num2.length());
        for(int i = 0; i < num1.length(); i++){
            if(num1.charAt(i) == num2.charAt(i)) continue;
            return (num1.charAt(i) - num2.charAt(i)) / Math.abs(num1.charAt(i) - num2.charAt(i));
        }
        return 0;
    }
}
