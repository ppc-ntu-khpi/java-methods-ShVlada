//package test;

//import domain.Exercise;

import java.util.Scanner;
public class TestResult {

    public static void main(String[]args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Введіть m: ");
      int m = in.nextInt();
      System.out.print("Введіть n: ");
      int n = in.nextInt();
        System.out.println("Result:"+Exercise.Ackermann(m,n));
      
    }
}