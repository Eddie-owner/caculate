package com.minitest.caculate.demo;

public class MiniTest {
    public static String test1(String input){
        boolean flag=true;
        do {
            input=remove(input);
            if (input.length()<3){
                flag=false;
            }
        }while (flag);
        return input;
    }
    public static String remove(String input) {
        char[] chars = input.toCharArray();
        int count = chars.length;
        //lengths must bigger than three
        if (count >= 3) {
            for (int i = 0; i+2 <= chars.length; i++) {
                //compare every three strings
                if (chars[i] == chars[i + 1] && chars[i + 1] == chars[i + 2]) {
                    if (i > 0) {
                        input = input.substring(0, i) + input.substring(i + 3);
                    } else {
                        input = input.substring(i + 3);
                    }
                    return input;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        String str = "aabcccbbad";
        String str2="abcccbad";
        System.out.println(test1(str));
        System.out.println(test2(str2));
    }


    private static String test2(String input) {
        boolean flag=true;
        do {
            input=replace(input);
            if (input.length()<3){
                flag=false;
            }
        }while (flag);
        return input.substring(0,1);
    }
    public static String replace(String input){
        char[] chars = input.toCharArray();
        int count = chars.length;
        //lengths must bigger than three
        if (count > 3) {
            for (int i = 0; i+2 <= chars.length; i++) {
                //compare every three strings
                if (chars[i] == chars[i + 1] && chars[i + 1] == chars[i + 2]) {
                    if (i > 0) {
//                        input = input.substring(0, i) + input.substring(i + 2);
                        input=input.replace(input.substring(i,i+3),input.substring(i-1,i));

                    } else {
//                        input = input.substring(i + 2);
                        input=input.replace(input.substring(0,i+3),input.substring(i+3,i+4));
                    }
                    return input;
                }
            }
        }
        return input;
    }
}
