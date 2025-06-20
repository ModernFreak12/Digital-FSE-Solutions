import java.util.Comparator;
import java.util.Arrays;

class Product{
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String displayProduct() {
        return "ID = " + productId + ", Name = " + productName + ", Category = " + category ;
    }
}



class SearchFunctions{
    public static Product linearSearch(Product[] products, String name){
        for (Product p : products){
            if(p.productName.equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name){
        int left = 0, right = products.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            int comp = products[mid].productName.compareToIgnoreCase(name);

            if (comp == 0){
                return products[mid];
            } else if (comp < 0){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

class EcommerceSearch{
    public static void main(String args[]){
        Product[] products = {
            new Product(145, "Smartphone", "Electronics"),
            new Product(324, "Shirt", "Clothing"),
            new Product(238, "Watch", "Accessories"),
            new Product(743, "Laptop", "Electronics"),
            new Product(145, "Pant", "Clothing"),
            new Product(145, "Sunglass", "Accessories")
        };

        System.out.println("Linear Search - ");
        Product resultLinearSearch = SearchFunctions.linearSearch(products, "Watch");
        System.out.println(resultLinearSearch.displayProduct());

        
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        System.out.println("Binary Search - ");
        Product resultBinarySearch = SearchFunctions.binarySearch(products, "Laptop");
        System.out.println(resultBinarySearch.displayProduct());
    }
}
