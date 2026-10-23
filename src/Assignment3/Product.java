package Assignment3;

public class Product {

    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }

        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("Category cannot be empty");
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }

        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }

        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Product: " + name
                + ", Price: " + price
                + ", Quantity: " + quantity
                + ", Category: " + category;
    }

    public static void main(String[] args) {

        Product product = new Product(
                "Laptop", 25000, 2, "Electronics"
        );

        System.out.println(product);

        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Total: " + product.getTotal());

        product.setPrice(30000);
        product.setQuantity(3);

        System.out.println("Updated Product: " + product);
        System.out.println("Updated Total: " + product.getTotal());

        try {
            product.setPrice(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            product.setQuantity(-2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Product invalidProduct = new Product(
                    "Phone", -500, 2, "Electronics"
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}