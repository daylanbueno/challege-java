package io.github.daylanbueno;

/*
    Title: find min, max of two numbers
    >> Write down a program that will takes two number as input and
    >> find min and max using ternary operator
    ## Test ##
    input: 1 2 output: Min= 1 Max= 2
    input: 6 5 output: Min= 5 Max= 6
*/
public class Challenge5MinMaxValueTernaryOperator {
     public static void main(String [] args) {
        int n1 = 6, n2 = 5;
        int min = n1 < n2 ? n1 : n2;
        int max = n2 > n1 ? n2 : n1;
        System.out.println("Min= "+min+" Max= "+max);
    }
}
