package io.github.daylanbueno;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
    Title: Two sum
    >> Write down a program that will take an array of integers as input and return indices of
    >> two numbers such that they add up to a specific target. You may assume that each input would
    >> have exactly one solution and you may not use one element twice
    ## Test ##
    input: array = {2,7,11,15} target = 13    output: {0,2}
*/
public class Challenge33TwoSum {
     public static void main(String [] args) {
         Integer numbs[] = {2,7,11,15};
         Boolean invalidTarget = true;

         System.out.println("Enter an target integer");
         Integer target = new Scanner(System.in).nextInt();

         for (Integer i=0; i < numbs.length; i++) {
             Integer indexValue = numbs[i];
             Integer index2 = getIndexBySum(Arrays.asList(numbs), indexValue, target);
             if (index2 != null) {
                 System.out.println(Arrays.asList(i,index2));
                 invalidTarget = false;
                 break;
             }
         }
         if (invalidTarget) System.out.println("The target is invalid.");
     }

     public static  Integer getIndexBySum(List<Integer> arr, Integer indexOneValue, Integer target) {
            for (Integer i = 0; i < arr.size(); i++) {
                Integer actualIndexValue = arr.get(i);
                if (indexOneValue + actualIndexValue  == target ) {
                    return i;
                }
            }
            return null;
     }
}
