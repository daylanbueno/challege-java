package io.github.daylanbueno;
/*
    Title: Distance between two points
    >> Write down a program that will take two points of a straight line as input and
    >> will find the distance between two points formula: distance = sqrt of (x2-x1)^2+(y2-y1)^2
    ## Test ##
    input: x1=1, y1=2, x2=3, y2=3  output: 2.236
    input: x1=2, y1=2, x2=5, y2=5  output: 4.243
*/
public class Challenge10DistanceBetween {
     public static void main(String [] args) {
       int x1= 1, y1=2, x2=3, y2=3;
       float side1 = x2-x1;
       float side2 = y2-y1;
       double distance = Math.sqrt(side1 * side1 + side2 *side2);
       System.out.printf("distance: %.3f ", distance);
    }
}
