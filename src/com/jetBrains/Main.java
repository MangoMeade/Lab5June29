package com.jetBrains;
import java.util.Random;
import java.util.Scanner;

//author: Andres Ibarra
//This program asks the user how many sides a dice has
//then it rolls an virtual dice
//one method uses random() and the other method uses Math.random()
public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the Grand Circus Casino! ");
        Scanner scnr = new Scanner(System.in);
        String userInput;
        String Loop = "y";
        int rollCount = 1;

        System.out.println("How many sides should each dice have? ");
        userInput = scnr.next();
        while (Loop.equalsIgnoreCase("y") ) {
            System.out.println("Roll " + rollCount); //
            System.out.println(randomNum());
            System.out.println(randomNum2());
            rollCount += 1;
            System.out.println("Roll again?");
            Loop = scnr.next();
        }
        if (Loop.equalsIgnoreCase("n")) {
            System.out.println("Bye!");
        }
    }

    public static int randomNum() {
        Random rand = new Random();
        int randNum = rand.nextInt(6) + 1;
        return randNum;
    }

    public static int randomNum2() {
        int randNum = (int)(1 + Math.random() * 6);
        return randNum;
    }
}
