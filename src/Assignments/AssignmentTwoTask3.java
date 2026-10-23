package Assignment2;

import java.util.Arrays;

public class AssignmentTwoTask3 {
    public static void main(String[] args) {

        String[] products = {
                "Sauce Labs Backpack",
                "Sauce Labs Bike Light",
                "Sauce Labs Bolt T-Shirt",
                "Sauce Labs Fleece Jacket",
                "Sauce Labs Onesie",
                "Test.allTheThings() T-Shirt (Red)"
        };

        // Sort the array
        Arrays.sort(products);

        // Print sorted products
        System.out.println("Sorted Products:");

        for (String product : products) {
            System.out.println(product);
        }

        // Search for a product
        String searchProduct = "Sauce Labs Onesie";
        int index = Arrays.binarySearch(products, searchProduct);

        System.out.println("\nSearch Product: " + searchProduct);
        System.out.println("Product Index: " + index);

        // Reverse the array
        for (int i = 0; i < products.length / 2; i++) {
            String temp = products[i];
            products[i] = products[products.length - 1 - i];
            products[products.length - 1 - i] = temp;
        }

        // Print reversed products
        System.out.println("\nReversed Products:");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}