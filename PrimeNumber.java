package oob;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number ");

        int userInput= input.nextInt();
        int count = 0;
        for (int i=1;i<=userInput;i++) {
            if (userInput % i == 0) {
                count++;
            }
        }
        if (count==2){
            System.out.println(userInput+" it's prime number .");}
        else System.out.println(userInput+" it's not prime number .");

    }

}
