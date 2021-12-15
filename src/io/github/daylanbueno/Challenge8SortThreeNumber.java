package io.github.daylanbueno;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    Title: Sort values of three variables in ASC order
    >> Write down a program that will takes three number as input and
    >> will sort them in ASC order
    ## Test ##
    input: n1=5 n2=8 n3=3 output: n1=3 n2=5 n3=8
    input: n1=5 n2=2 n3=9 output: n1=2 n2=5 n3=9
*/
public class Challenge8SortThreeNumber {
     public static void main(String [] args) {
        int n1 = 18, n2 = 5, n3= 8  ;
         List<Integer> values = Arrays.asList(n1,n2,n3);
         Collections.sort(values);
         values.forEach(System.out::println);
    }
}
