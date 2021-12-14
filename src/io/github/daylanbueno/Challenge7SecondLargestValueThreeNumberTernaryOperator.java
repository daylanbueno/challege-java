package io.github.daylanbueno;

/*
    Problem: Second largest of three (Ternary operator)
    Title: Second largest of three numbers
    >> Write down a program that will find second largest of three numbers using ternary operator
    ## Test ##
    input: 1 2 3 output: 2
    input: 5 9 3 output: 5
*/
public class Challenge7SecondLargestValueThreeNumberTernaryOperator {
     public static void main(String [] args) {
        int n1 = 5, n2 = 9, n3= 5  ;
        int secondLargest = n1 > n2 && n1 <n3 ? n1 : n2 > n1 && n2 < n3 ?  n2 : n3;
        System.out.println("Second largest= "+secondLargest);
    }
}
