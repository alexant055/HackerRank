package com.hackerrank.algorithms;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeConversion {
    public static void main(String args[]) throws ParseException {
        System.out.println(timeConversion("07:05:45PM"));
    }

    static String timeConversion(String s) throws ParseException {
        SimpleDateFormat pa = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat st = new SimpleDateFormat("HH:mm:ss");
        return st.format(pa.parse(s));
    }
}
