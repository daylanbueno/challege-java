package io.github.daylanbueno;
/*
    Title: Sort values of three variables in ASC order
    >> Write down a program that will takes three number as input and
    >> will sort them in ASC order
    ## Test ##
    input: n1=5 n2=8 n3=3 output: n1=3 n2=5 n3=8
    input: n1=5 n2=2 n3=9 output: n1=2 n2=5 n3=9
*/
public class Challenge8SortThreeNumberOtherSoluction {
     public static void main(String [] args) {
        int n1 = 5, n2 = 8, n3= 3  ;
        int min = n1 < n2 && n1 < n3 ? n1 : n2 < n1 && n2 < n3 ? n2 : n3;
        int max = n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3;
        int asc = n1 < n2 && n1 > n3 ? n1 : n2 < n1 && n2 > n3 ? n2 : n3;
        System.out.println("N1="+min + " N2="+asc+" N3="+max);
    }
}
