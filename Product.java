package oops;

public class Product {

	    // Private variables
	    private String productName = "Laptop";
	    private double price = 50000;

	    // Getter methods
	    public String getProductName() {
	        return productName;
	    }

	    public double getPrice() {
	        return price;
	    }

	    // Setter method
	    public void setPrice(double newPrice) {
	        if (newPrice > 0) {
	            price = newPrice;
	        } else {
	            System.out.println("Invalid price");
	        }
	    }
	}

	public class Main {
	    public static void main(String[] args) {

	        Product p = new Product();

	        System.out.println("Product: " +
	                           p.getProductName());

	        System.out.println("Old Price: " +
	                           p.getPrice());

	        p.setPrice(45000);

	        System.out.println("Updated Price: " +
	                           p.getPrice());
	    }
	}


