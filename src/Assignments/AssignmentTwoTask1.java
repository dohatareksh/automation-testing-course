package Assignments;

public class AssignmentTwoTask1 {
// 1. Write a program that declares variables for: a product name (String), its price (double), the quantity ordered
//(int), and whether it is in stock (boolean). Print a formatted receipt showing all four values. Then calculate and
//print the total price (price × quantity).
public static void main(String[] args) {

    String productName = "iPhone";
    double price = 75000.0;
    int quantity = 2;
    boolean inStock = true;

    System.out.println("===== Receipt =====");
    System.out.println("Product Name: " + productName);
    System.out.println("Price: " + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("In Stock: " + inStock);

    double totalPrice = price * quantity;
    System.out.println("Total Price: " + totalPrice);
}
}
