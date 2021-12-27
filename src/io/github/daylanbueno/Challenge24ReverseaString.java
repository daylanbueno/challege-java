package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Reverse a string
    >> Write down a program that will reverse a string
    ## Test ##
    input: hello   output: olleh
    input: string   output: gnirts
    input: reverse  output: esrever
*/
public class Challenge24ReverseaString {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a name");
         String nome = in.nextLine();
         StringBuilder sb = new StringBuilder(nome);
         System.out.println("Name: "+sb.reverse());
     }
}
