public class Book {
    // Attributes (Properties)
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true; // default value: available
    }

    // Behaviors
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getStatus() {
        if (isAvailable) {
            return "Available";
        } else {
            return "Checked Out";
        }
    }

    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }
}
