package com.util;

import com.sun.deploy.util.StringUtils;

public class MathUtils {
    public static int calMathStr(String str) {
        String actualStr = StringUtils.trimWhitespace(str);
        int result = 0;
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < actualStr.length(); i++) {
            if ((actualStr.charAt(i) != '-') && (actualStr.charAt(i) != '+') &&
                    (actualStr.charAt(i) != '*') && (actualStr.charAt(i) != '/')) {
                number.append(actualStr.charAt(i));
            } else {
                if (actualStr.charAt(i) == '-') {
                    result += calMathStrMS(number.toString());
                    number = new StringBuilder("-");
                } else if (actualStr.charAt(i) == '+') {
                    result += calMathStrMS(number.toString());
                    number = new StringBuilder("+");
                } else if (actualStr.charAt(i) == '*') {
                    number.append("*");
                } else if (actualStr.charAt(i) == '/') {
                    number.append("/");
                }
            }
        }
        result += calMathStrMS(number.toString());
        return result;
    }

    private static int calMathStrMS(String str) {
        String actualStr = StringUtils.trimWhitespace(str);
        int result = 0;
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < actualStr.length(); i++) {
            if ((actualStr.charAt(i) != '-') && (actualStr.charAt(i) != '+')
                    && (actualStr.charAt(i) != '*') && (actualStr.charAt(i) != '/')) {
                number.append(actualStr.charAt(i));
            } else {
                if (actualStr.charAt(i) == '-') {
                    result += calOperator(number.toString());
                    number = new StringBuilder("-");
                } else if (actualStr.charAt(i) == '+') {
                    result += calOperator(number.toString());
                    number = new StringBuilder("+");
                } else if (actualStr.charAt(i) == '*') {
                    if(result == 0){
                        result = 1;
                    }
                    result *= calOperator(number.toString());
                    number = new StringBuilder("*");
                } else if (actualStr.charAt(i) == '/') {
                    result /= calOperator(number.toString());
                    number = new StringBuilder("/");
                }
            }
        }
        if(number.toString().contains(""))
        result *= calOperator(number.toString());
        return result;
    }

    private static int calOperator(String str) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(str) || str.equals("-")) {
            return 0;
        }
        if (str.startsWith("-")) {
            return -1 * Integer.valueOf(str.substring(1));
        } else if (str.startsWith("+") || str.startsWith("*") || str.startsWith("/")) {
            return Integer.valueOf(str.substring(1));
        }
        return Integer.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println(calMathStr("-10+2-4/2"));
    }
}
