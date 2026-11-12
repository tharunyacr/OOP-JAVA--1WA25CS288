class Book {
    int bookId;
    String title;
    String author;
    double price;

    static int totalBooks = 0;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;

        totalBooks++;
    }
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }


    void search(int id) {
        if (bookId == id) {
            System.out.println("Book found by ID!");
            display();
        }
    }
    void search(String name) {
        if (title.equalsIgnoreCase(name)) {
            System.out.println("Book found by Title!");
            display();
        }
    }

 
    Book costlierBook(Book b) {
        if (this.price > b.price) {
            return this;
        } else {
            return b;
        }
    }
}


public class BookDemo {
    public static void main(String[] args) {


        Book b1 = new Book(101, "Java", "James Gosling", 500);
        Book b2 = new Book(102, "Python", "Guido", 650);
        Book b3 = new Book(103, "C Programming", "Dennis Ritchie", 400);


        System.out.println("BOOK DETAILS");
        b1.display();
        b2.display();
        b3.display();
        System.out.println("SEARCH BY ID");
        b1.search(101);


        System.out.println("SEARCH BY TITLE");
        b2.search("Python");

        
        System.out.println("COSTLIER BOOK");
        Book costly = b1.costlierBook(b2);
        costly.display();


        System.out.println("Total Books Created: " + Book.totalBooks);
    }
}
