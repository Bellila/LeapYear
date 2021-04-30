package com.kata;

public class LeapYear {

    public boolean check(int year) {
        if (isDivisibleBy4(year) && (!isDivisibleBy100(year) || isDivisibleBy400(year))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isDivisibleBy4(int year) {
        return (year % 4) == 0;
    }

    private boolean isDivisibleBy100(int year) {
        return (year % 100) == 0;
    }

    private boolean isDivisibleBy400(int year) {
        return (year % 400) == 0;
    }

}
