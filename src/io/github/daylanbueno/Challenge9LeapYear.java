package io.github.daylanbueno;
/*
    Title: Leap Year
    >> Write down a program that will take a year as input and will check the given
    >> year is a leap year or not
    ## Test ##
    input: 2020  output: true
    input: 2021  output: false
*/
public class Challenge9LeapYear {
     public static void main(String [] args) {
        int year = 2020;
        boolean isLeap = year%4 == 0 ? true : false;
        System.out.println(year+" is a leap year ? "+isLeap);
    }
}
