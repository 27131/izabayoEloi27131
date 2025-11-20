package id27131.q8;

public class Book extends Section {
    private String title;
    private String author;
    private String ISBN;

    public Book(int id, String createdDate, String updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        setTitle(title);
        setAuthor(author);
        setISBN(ISBN);
    }

    public String getTitle() { return title; }
    public void setTitle(String title) throws LibraryDataException {
        if (title == null || title.trim().isEmpty())
            throw new LibraryDataException("Title required");
        this.title = title;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) throws LibraryDataException {
        if (author == null || author.trim().isEmpty())
            throw new LibraryDataException("Author required");
        this.author = author;
    }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) throws LibraryDataException {
        if (ISBN == null || ISBN.trim().length() < 10)
            throw new LibraryDataException("ISBN ≥ 10 chars");
        this.ISBN = ISBN;
    }
}
