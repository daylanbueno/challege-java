package io.github.daylanbueno;

import java.util.Arrays;
import java.util.List;

/*
    Title: Summing array elements
    >> Write down a program that will takes an integer array as input and will
    >> print the summation of that array elements
    ## Test ##
    input: {1, 2, 3, 4, 5} output: 15
    input: {3, 5, 7, 9}    output: 24
*/
public class Challenge11SumArrayElements {
     public static void main(String [] args) {
         List<Integer> numbers = Arrays.asList(3, 5, 7, 9);
         Integer sum = numbers.stream().reduce(0, (subValue, item) -> subValue + item);
         System.out.println("Sum: "+sum);
     }
}
