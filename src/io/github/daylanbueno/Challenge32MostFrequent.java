package io.github.daylanbueno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Title: Most frequent
    >> Write down a program that will find the most frequent in an integer array
    ## Test ##
    input: {1, 2, 3, 4, 2, 2, 3}   output: 2
    input: {1, 2, 1, 3, 2, 3, 1}   output: 1
*/
public class Challenge32MostFrequent {
     public static void main(String [] args) {
         Integer numbs[] = {1, 2, 1, 3, 2, 3, 1};
         List<Integer> mostFrequentList = new ArrayList<>();
         for (Integer i=1;  i < numbs.length; i++){
             Integer value = numbs[i];
             List<Integer> values = Arrays.stream(numbs).filter(it -> it == value).collect(Collectors.toList());
             if (mostFrequentList.size() < values.size())  mostFrequentList = values;
         }
         if (mostFrequentList.size() > 0) System.out.println("Most number frequent: "+mostFrequentList.get(0));
     }
}
