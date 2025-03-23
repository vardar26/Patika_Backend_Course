package Hafta3.FilmCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    List<Film> movieCollection = new ArrayList<>();

    public void addFilm () {
        movieCollection.add(new Film("Esaretin Bedeli", 1994,"Dram",9.3 ));
        movieCollection.add(new Film("Batman, Kara Şovalye", 2008,"Aksiyon",9.0 ));
        movieCollection.add(new Film("Pursuit of Happiness", 2007,"Biyografi",8.0 ));
        movieCollection.add(new Film("The Call of the Wild", 2020,"Macera",6.7 ));
        movieCollection.add(new Film("The Godfather", 1972,"Suç",9.2 ));

    }
    public void printList () {
        System.out.println(movieCollection);
    }

    public void sortByImdbRate() {
        movieCollection.sort(Comparator.comparingDouble(Film::getImdbrate).reversed());
        System.out.println("\n🎬 IMDb Puanına Göre Sıralama:");
        movieCollection.forEach(System.out::println);
    }

    public void sortByReleaseYear() {
        movieCollection.sort(Comparator.comparingInt(Film::getReleaseyear));
        System.out.println("\n📅 Yayın Yılına Göre Sıralama:");
        movieCollection.forEach(System.out::println);
    }

    public void filterByGenre(String genre) {
        List<Film> filteredMovies = movieCollection.stream()
                .filter(film -> film.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
        System.out.println("\n🎯 " + genre + " Türündeki Filmler:");
        if (filteredMovies.isEmpty()) {
            System.out.println("Bu türe uygun film bulunamadı.");
        } else {
            filteredMovies.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();

        // Filmleri ekle
        obj.addFilm();

        // IMDb puanına göre sıralama
        obj.sortByImdbRate();

        // Yayın yılına göre sıralama
        obj.sortByReleaseYear();

        // Tür bazlı filtreleme
        obj.filterByGenre("Dram");
        obj.filterByGenre("Aksiyon");
        obj.filterByGenre("Biyografi");
        obj.filterByGenre("Suç");
        obj.filterByGenre("Macera");
    }
}







