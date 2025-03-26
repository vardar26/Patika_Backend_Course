package Hafta3.BookShoppingSystem.Service;

import Hafta3.BookShoppingSystem.Model.Author;
import Hafta3.BookShoppingSystem.Model.Book;
import Hafta3.BookShoppingSystem.Model.Magazine;
import Hafta3.BookShoppingSystem.Model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private static List<Product> productList = new ArrayList<>();

    public static void create(String name, double price, Author author, LocalDate publishedDate) {
        Product book = new Book(name,price , author, publishedDate );
        productList.add(book);

    }


    public static void create(String name, double price){
        Product magazine = new Magazine(name, price);
        productList.add(magazine);


    }
        public void   list() {
            for (Product products : productList) {
                System.out.println(products);
            }
        }
}



