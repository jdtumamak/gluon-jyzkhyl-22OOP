/*
* Distinction between the Book class and Book objects.
* A class serves as a template that outlines what a book is.
* Conversely, Book objects are real instances generated from that class,
* each one representing an individual book with its specific title and author.
 */
public class TestBook {
    public static void main(String[] args) {


        // Create two Book instances
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction");
        Book book2 = new Book("The Alchemist", "Paulo Coehlo", "Fantasy");



        // Displaying details
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor());
        System.out.println("Genre: " + book1.getGenre());
        System.out.println("Status: " + book1.getStatus()); 
        System.out.println();

        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor());
        System.out.println("Genre: " + book2.getGenre());
        System.out.println("Status: " + book2.getStatus());
        System.out.println();



        // Demonstrating behaviors
        book1.checkOut();
        System.out.println("Status after checkout: " + book1.getStatus());
        book1.returnBook();
        System.out.println("Status after return: " + book1.getStatus());



        
    }
}
