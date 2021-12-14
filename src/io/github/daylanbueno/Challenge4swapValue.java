package io.github.daylanbueno;
import java.util.Scanner;

/*
    Title: Swap value of two variables
    >> Write down a program that will swap value of two variable
    ## Test ##
    input: n1 = 2, n2 = 3  output: n1 = 3, n2 = 2
*/

public class Challenge4swapValue {
     public static void main(String [] args) {
        int n1 = 1, n3 = 3;
        int temporaryValue = n1;
        n1 = n3;
        n3 = temporaryValue;
        System.out.println("N1="+n1 + " N3="+n3);
    }
}
