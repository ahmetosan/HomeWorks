package com.cbt.utilities;

public class StringUtility {
    public static void verifyEquals(String expected, String actual ){

        if (expected.equals(actual)){
            System.out.printf("Passed");
        }else {
            System.out.printf("Failed");
            System.out.printf(expected);
            System.out.printf(actual);
        }

    }
}
