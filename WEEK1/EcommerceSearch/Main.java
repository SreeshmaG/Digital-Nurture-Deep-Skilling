package WEEK1.EcommerceSearch;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "T-Shirt", "Apparel"),
            new Product(104, "Mobile", "Electronics")
        };

        
        System.out.println("Linear Search:");
        Product result1 = SearchUtility.linearSearch(products, "Laptop");
        System.out.println(result1 != null ? result1 : "Product not found");

       
        SearchUtility.sortProductsByName(products);

      
        System.out.println("Binary Search:");
        Product result2 = SearchUtility.binarySearch(products, "Laptop");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
