package coffee;

import java.util.Scanner;

import static coffee.CoffeeMachine.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("1     cappuccino     560");
        System.out.println("2     black          540");
        System.out.println("3     latte          580");
        System.out.println("4     americano      520");
        System.out.println("5     espresso       530");
        System.out.println("Please choose the drink you want:");
        Scanner coffee = new Scanner(System.in);
        String coffeeChoice = coffee.next();
        System.out.println("Please select a number:");
        Scanner cup = new Scanner(System.in);
        int cups = cup.nextInt();
        switch (coffeeChoice) {
            case "1":
                cappuccino(cups);
                break;

            case "2":
                black(cups);
                break;

            case "3":
                latte(cups);
                break;
            case "4":
                americano(cups);
                break;
            case "5":
                espresso(cups);
                break;
        }
    }

}



