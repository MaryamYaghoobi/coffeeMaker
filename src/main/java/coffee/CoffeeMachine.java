package coffee;

public class CoffeeMachine {
    static int water = 1200, milk = 540, coffeeBeans = 120, money = 0;

    public static void cappuccino(int cup) {
        water -= 200 * cup;
        milk -= 100 * cup;
        coffeeBeans -= 25 * cup;
        money += 560 * cup;
        System.out.println(cup + " Cups of cappuccino are ready.\n");
        System.out.println("The amount payable : " + money + " \n");

    }

    public static void black(int cup) {
        water -= 350 * cup;
        milk -= 20 * cup;
        coffeeBeans -= 1 * cup;
        money += 540 * cup;
        System.out.println(cup + " Cups of black are ready.\n");
        System.out.println("The amount payable : " + money + " \n");

    }

    public static void latte(int cup) {
        water -= 250 * cup;
        milk -= 100 * cup;
        coffeeBeans -= 9 * cup;
        money += 580 * cup;
        System.out.println(cup + " Cups of latte are ready.\n");
        System.out.println("The amount payable : " + money + " \n");

    }

    public static void americano(int cup) {
        water -= 350 * cup;
        milk -= 50 * cup;
        coffeeBeans -= 5 * cup;
        money += 520 * cup;
        System.out.println(cup + " Cups of americano are ready.\n");
        System.out.println("The amount payable : " + money + " \n");

    }

    public static void espresso(int cup) {
        water -= 350 * cup;
        milk -= 75 * cup;
        coffeeBeans -= 20 * cup;
        money += 530 * cup;
        System.out.println(cup + " Cups of espresso are ready.\n");
        System.out.println("The amount payable : " + money + " \n");

    }


}


