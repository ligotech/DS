package com.learning.ds.algo;

import java.util.Locale;

public class Convert12HourTo24Hour {

    enum DayTime {
        AM,
        PM
    }

    private static DayTime getDayTime(String dayTime){
        if(dayTime.toLowerCase().endsWith("am")){
            return DayTime.AM;
        }
        else if(dayTime.toLowerCase().endsWith("pm")){
            return DayTime.PM;
        }
        else {
            throw new RuntimeException("Day Time is not present like AM or PM");
        }
    }

    private static String convert(String twelveHourFormat){
        if(twelveHourFormat == null || twelveHourFormat.isEmpty()){
            throw new RuntimeException("Null or Empty Date.");
        }
        DayTime dayTime = getDayTime(twelveHourFormat);
        if(dayTime.equals(DayTime.PM)){
            String[] arr = twelveHourFormat.split(":");
            Integer hour = Integer.getInteger(arr[0]);
            if(hour < 12){
                hour = hour + 12;
            }
            arr[0] = hour.toString();
        }
        return null;

    }

    public static void main(String[] args) {

    }
}
