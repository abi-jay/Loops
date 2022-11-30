package com.perscholas.loops;
import java.util.*;
public class Mathloop {
    public static int gcd(int a, int b)
    {
        // stores minimum(a, b)
        int i;
        if (a < b)
            i = a;
        else
            i = b;
        // take a loop iterating through smaller number to 1
        for (i = i; i > 1; i--) {
            // check if the current value of i divides both numbers with remainder 0 if yes, then i is the GCD of a and b
            if (a % i == 0 && b % i == 0)
                return i;
        }
        // if there are no common factors for a and b other than 1, then GCD of a and b is 1
        return 1;
    }
    public static void main(String[] args) {
        int n1, n2, a, b;
        System.out.println("1. Multiplication Table:\n");
        for(int i=1; i<=12; i++){
            for(int j = 1; j<=12;j++){
                System.out.print(i*j+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("\n2. GCD\n");
        System.out.println("Enter 0 to exit:");
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Enter two numbers:");
            a = input.nextInt();
            b = input.nextInt();
            if(a==0 || b==0){
                break;
            }
            else{
                System.out.println("GCD = " + gcd(a, b));
            }
        }
        System.out.println("\n3. Predict Future Tuition");
        System.out.println("Enter tuition:");
        input = new Scanner(System.in);
        a=0;//year
        double tuition = input.nextDouble();
        double oldTuition = tuition;
        while(tuition < (2*oldTuition)){
            tuition = tuition * 1.07;
            a++;//year
           //System.out.println(a+"\t"+oldTuition+"\t"+tuition);
        }
        System.out.println("Tuition will be doubled in " + a + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, a);
    }
}
