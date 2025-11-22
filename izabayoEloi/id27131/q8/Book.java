package id27131.q8;

public class Book extends Entity {
    private String title;
    private String author;
    private String ISBN;

    public Book(int id, String createdDate, String updatedDate, String title, String author, String ISBN) throws LibraryException {
        super(id, createdDate, updatedDate);
        if (title == null || title.isEmpty()) throw new LibraryException("Title cannot be empty");
        if (author == null || author.isEmpty()) throw new LibraryException("Author cannot be empty");
        if (ISBN == null || ISBN.length() < 10) throw new LibraryException("ISBN must be at least 10 characters");
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
}
