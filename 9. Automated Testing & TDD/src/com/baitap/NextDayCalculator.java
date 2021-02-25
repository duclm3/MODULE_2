package com.baitap;

public class NextDayCalculator {
    public static boolean checkLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0))|| (year % 400 == 0);
    }
    public static boolean checkDay(int day,int month,int year){
        if(month < 1 || month > 12){
            return false;
        }
        if(month==1||month ==3||month==5||month==7||month==8||month==10||month==12){
            return (1 > day || day > 31 ? false : true);
        }
        if(month==4||month==6||month==9||month==11){
            return (1 > day || day > 30 ? false : true);
        }
        if(checkLeapYear(year)){
            return (1 > day || day > 29 ? false : true);
        }else{
            return (1 > day || day > 28 ? false : true);
        }
    }
    public static int[] nextDay(int day,int month, int year){
        for (int i = 0; i < 1; i++) {
            day+=1;
            if(checkDay(day,month,year)){
                continue;
            }
            day = 1;
            month+=1;
            if(checkDay(day,month,year)){
                continue;
            }
            month = 1;
            year+=1;
        }
        return new int[]{day,month,year};
    }
}
