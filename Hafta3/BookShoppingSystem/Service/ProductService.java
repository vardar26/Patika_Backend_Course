package Hafta3.BookShoppingSystem.Service;

import Hafta3.BookShoppingSystem.Model.Author;
import Hafta3.BookShoppingSystem.Model.Book;
import Hafta3.BookShoppingSystem.Model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private static List<Product> productList = new ArrayList<>();

    public static void create(String name, double price, Author author, LocalDate publishedDate) {




        Product product = new Book(name,price , author, publishedDate );
        productList.add(product);

    }


        public void   list() {
            for (Product products : productList) {
                System.out.println(products);
            }
        }


}



