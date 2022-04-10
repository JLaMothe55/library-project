import java.util.ArrayList;

public class Library {

    // Properties of class Library
    private String address;
    private ArrayList<Book> libraryBooks = new ArrayList<Book>();

    // Constructor for class Library
    public Library(String location){
        address = location;
    }

    // Adds books to the classes ArrayList property
    public void addBook(Book bookTitle){
        libraryBooks.add(bookTitle);
    }

    // Prints the address of library
    public void printAddress(){
        System.out.println(address);
    }

    // Looks for book among the list of books in the library and marks it as borrowed by using the Book class
    public void borrowBook(String nameOfBook){
        for(Book book : libraryBooks){
            if(book.getTitle().equals(nameOfBook)){
                book.borrowed();
            }
        }
    }

    // Sorts through the ArrayList libraryBooks, printing all books that aren't borrowed/ rented
    public void printAvailableBooks(){
        for(Book book : libraryBooks){
            if(book.isBorrowed() == false){
                System.out.println(book);
            }
        }
    }

    // Looks for the name of the book in question among libraryBooks. If the book in question matches a book and the book is marked as borrowed then it marks the book as returned using the Book class
    public void returnBook(String nameOfBook){
        for(Book book : libraryBooks){
            if(book.getTitle().equals(nameOfBook) && book.isBorrowed()){
                book.returned();

            }
           }
        }


    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        //Adding Books to firstLibrary
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Library hours section will go here

        //Library Address
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        //Borrowing Lord of The Rings
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        //Printing titles available from libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();


        //Returning Lord of The Rings
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        //Printing titles available from libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();


    }
}