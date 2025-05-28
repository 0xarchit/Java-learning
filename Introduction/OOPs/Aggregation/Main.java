package OOPs.Aggregation;

// aggregation means has-a relationship
// one object contains another object as part of its structure, but the contained object can exist independently.

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Python", 1000);
        Book book2 = new Book("Java", 1200);
        Book book3 = new Book("Javascript", 900);

        Book[] books = {book1, book2, book3};

//        System.out.println(book1.info());

        Library lib = new Library("Public Library", 1969, books);
        lib.info();

    }
}
