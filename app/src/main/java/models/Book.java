package models;

import java.util.ArrayList;
import java.util.HashMap;

public class Book {
    private int id;
    private String imageUrl;
    private String name;
    private String author;
    private int rate;
    private String description;

    public Book(int id, String imageUrl, String name, String author, int rate, String description) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.author = author;
        this.rate = rate;
        this.description = description;
    }

    /*
    public static Book createBookFromHashMap(HashMap<String,Object> hashMap){
        return
    }
     */

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Book> generateFakeBook(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"https://www.scotsman.com/images-e.jpimedia.uk/imagefetch/http://www.scotsman.com/webimage/Prestige.Item.1.74151213!image/image.jpg",
                "Lap trinh C","Nguyen Van A",3,"Day la quyen C"));
        books.add(new Book(2,"https://www.scotsman.com/images-e.jpimedia.uk/imagefetch/http://www.scotsman.com/webimage/Prestige.Item.1.42068779!image/4101216181.jpg?crop=982:524,smart&width=640",
                "Android Kotlin","asdasd",5,"Day la quyen C"));
        books.add(new Book(3,"",
                "C# lap trinh","xcvxcv",2,"Day la quyen C"));
        books.add(new Book(4,"https://americanhumane.org/app/uploads/2016/08/john-tecuceanu-1557217-unsplash-1024x683.jpg",
                "Kotlin","tyutuyt",1,"Day la quyen C"));
        books.add(new Book(5,"https://americanhumane.org/app/uploads/2016/08/john-tecuceanu-1557217-unsplash-1024x683.jpg",
                "ReactJS","Chloe",4,"Day la quyen C"));
        books.add(new Book(6,"https://americanhumane.org/app/uploads/2016/08/john-tecuceanu-1557217-unsplash-1024x683.jpg",
                "Flutter","asdwqxz",3,"Day la quyen C"));
        books.add(new Book(7,"https://americanhumane.org/app/uploads/2016/08/john-tecuceanu-1557217-unsplash-1024x683.jpg",
                "Dotnet Core","byute",2,"Day la quyen C"));
        books.add(new Book(8,"https://americanhumane.org/app/uploads/2016/08/john-tecuceanu-1557217-unsplash-1024x683.jpg",
                "ios","qwxch",2,"Day la quyen C"));

        return books;
    }
}
