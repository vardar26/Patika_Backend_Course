package Hafta3.BookShoppingSystem.Service;

import Hafta3.BookShoppingSystem.Model.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {


    //Bütün kullanıcaları bu set içinde kaydediyoruz
    private static Set<User> users = new HashSet<>();

    //Kullanıcı nesnesi oluşturuyoruz
    public void create(String name, String email, String password ) {
        User user = new User(name, email, password);

        users.add(user);



    }
    //bütün kullanıcıları listelediğimiz metod

    public void list() {
        for (User user: users){
            System.out.println(user.getName()+ " -> " + user.getEmail());
        }
    }
}
