package OOP.Task1;

import java.util.ArrayList;

public class Book {
    private String name;
    private String authors;
    private String publishingHouse;
    private int year;
     Book(){
         name = "";
         authors = "";
         publishingHouse = "";
         year = 0;
     };
     Book(String name, String authors){
         this.name = name;
         this.authors = authors;
         publishingHouse = "";
         year = 0;
     }
     Book(String name, String authors, String publishingHouse){
         this.name = name;
         this.authors = authors;
         this.publishingHouse = publishingHouse;
     }
     Book(String name, String authors, String publishingHouse, int year){
         this.name = name;
         this.authors = authors;
         this.publishingHouse = publishingHouse;
         this.year = year;
     }

    @Override
    public String toString() {
        return String.format("%s;%s;%s;%d", name, authors, publishingHouse, year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
