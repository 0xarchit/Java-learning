package OOPs.Aggregation;

public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void info(){
        System.out.println(this.year + " " + this.name + " has following books: ");
        for(Book book : books){
            System.out.println(book.info());
        }
    }
}
