package OOPs.Aggregation;

public class Book {
    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;

    }

    String info(){
        return this.title + " of pages " + this.pages;
    }
}
