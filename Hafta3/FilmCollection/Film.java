package Hafta3.FilmCollection;

public class Film {

   String name;
   int  releaseyear;
   String genre;
   double imdbRate;

    public Film(String name, int releaseyear, String genre, double imdbrate) {
        this.name = name;
        this.releaseyear = releaseyear;
        this.genre = genre;
        this.imdbRate = imdbrate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbrate() {
        return imdbRate;
    }

    public void setImdbRate(double imdbRate) {
        this.imdbRate = this.imdbRate;
    }





    @Override
    public String toString() {
        return "Film " +
                " Name= " + name + "\n" +
                " Release year= " + releaseyear + "\n" +
                " Genre= " + genre +  "\n" +
                " Imdb Rate= " + imdbRate + "\n" ;

    }
}
