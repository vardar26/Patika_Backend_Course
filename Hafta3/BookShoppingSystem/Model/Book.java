package Hafta3.BookShoppingSystem.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Book extends Product{

    private Author author;

    private LocalDate publishedDate;

    private LocalDateTime createdDate;





    public Book(String name, double price, Author author, LocalDate publishedDate) {
        super(name, price);
        this.author = author;
        this.publishedDate=publishedDate;
        this.createdDate = LocalDateTime.now();
    }

    public Author getAuthor() {
        return author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name= " + getName() +
                ", price" + getPrice()+
                ", author=" + author +
                ", publishedDate=" + publishedDate +
                ", createdDate=" + createdDate +
                '}';
    }
}
