package Hafta3.BookShoppingSystem;

import Hafta3.BookShoppingSystem.Model.Author;
import Hafta3.BookShoppingSystem.Model.enums.Gender;
import Hafta3.BookShoppingSystem.Service.AuthorService;
import Hafta3.BookShoppingSystem.Service.ProductService;
import Hafta3.BookShoppingSystem.Service.UserService;


import java.time.LocalDate;

//Burası Main classımız
public class PatikaBooks {

    public static void main(String[] args) {

        //kullanıcıyı manuel eklemek için
        UserService userService = new UserService();
        userService.create("Emrah","vardar@gmail.com","1453");
        userService.create("Hasan","hasan@gmail.com","2025");
        userService.create("Metin","metin@gmail.com","1453");
        userService.create("Çetin","cetin@gmail.com","2025");
        userService.list();


        AuthorService authorService = new AuthorService();
        AuthorService.create("Patika", "hasan", Gender.MAN);
        Author author = authorService.findAuthor("Patika");

        ProductService productService = new ProductService();
        ProductService.create("Java Kodlama",155.8,author, LocalDate.of(2022, 9, 12));
        ProductService.create("Java Kodlama 2",255.8,author, LocalDate.of(2024, 9, 12));
        ProductService.create("Java Kodlama 3",455.8,author, LocalDate.of(2025, 9, 12));


        ProductService.create("Av tutkusu", 99.9);


        productService.list();




    }
}
