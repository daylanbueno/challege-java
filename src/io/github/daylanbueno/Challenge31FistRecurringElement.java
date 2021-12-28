package io.github.daylanbueno;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Title: First recurring element in an array
    >> Write down a program that will find first recurring element in an array
    ## Test ##
    input: {1, 2, 3, 4, 3}        output: 3
    input: {1, 2, 3, 4, 3, 2, 3}  output: 2
*/
public class Challenge31FistRecurringElement {
     public static void main(String [] args) {
         Integer numbs[] = {1, 2, 3, 4, 3, 2, 3};
         for (Integer i=1;  i < numbs.length; i++){
             Integer value = numbs[i];
             List<Integer> values = Arrays.stream(numbs).filter(it -> it == value).collect(Collectors.toList());
             if (values.size() > 1) {
                 System.out.println(value);
                 break;
             }
         }
     }
}
