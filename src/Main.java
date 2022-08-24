import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        // new Cupcake object named cupcake
        Cupcake cupcake = new Cupcake();

        // new RedVelvet object named redVelvet
        RedVelvet redVelvet = new RedVelvet();

        // new Chocolate object named chocolate
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" +
                "\nthe menu but we need to decide on pricing");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);


        // new ArrayList which contains drinkMenu
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the drink menu. We currently have three types of drinks on" +
                "\nthe menu but we need to decide on pricing");

        System.out.println("We are deciding on the price for our bottled water. Here is the description: ");
        water.type();
        System.out.println("How much would you like to charge for the water bottle?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);

        System.out.println("We are deciding on the price for our bottle of soda. Here is the description: ");
        soda.type();
        System.out.println("How much would you like to charge for the bottled soda?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        System.out.println("We are deciding on the price for our bottle of milk. Here is the description: ");
        milk.type();
        System.out.println("How much would you like to charge for the bottled milk?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        // add to drinkMenu
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        System.out.println("\n---Cupcake Menu---\n");
        for(Cupcake i : cupcakeMenu) {
            System.out.println(i.getClass().getSimpleName() + " Price: " + i.getPrice());
        }
        System.out.println("\n---Drink Menu---\n");
        for(Drink i : drinkMenu) {
            System.out.println(i.getClass().getSimpleName() + " Price: " + i.getPrice());
        }

    }

    // new parent class
    static class Cupcake {
        public double price;
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public void type() {
            System.out.println("A basic, generic cupcake, with vanilla frosting");
        }
    }
    static class RedVelvet extends Cupcake {
        public void type() {
            System.out.println("A red velvet based cupcake, with cream cheese frosting");
        }
    }
    static class Chocolate extends Cupcake {
        public void type() {
            System.out.println("A chocolate based cupcake, with chocolate frosting");
        }
    }

    // new parent class
    static class Drink {
        public double price;
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public void type() {
            System.out.println("A bottle of water");
        }
    }
    static class Soda extends Drink {
        public void type() {
            System.out.println("A bottle of soda");
        }
    }
    static class Milk extends Drink {
        public void type() {
            System.out.println("A bottle of milk");
        }
    }

}
