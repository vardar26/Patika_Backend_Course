package Hafta3.BookShoppingSystem.Service;

import Hafta3.BookShoppingSystem.Model.Author;
import Hafta3.BookShoppingSystem.Model.enums.Gender;

import java.util.HashMap;
import java.util.Map;

public class AuthorService {

    public static Map<String,Author> authors = new HashMap();

    public static void create(String name, String surname, Gender gender) {


        Author author = new Author(name,surname,gender);
        authors.put(author.getName(), author);
    }

    public Author findAuthor(String name){
        return authors.get(name);

    }
}
