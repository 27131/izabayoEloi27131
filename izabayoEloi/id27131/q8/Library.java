package id27131.q8;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;

    public Library(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber) throws LibraryException {
        super(id, createdDate, updatedDate);
        if (libraryName == null || libraryName.isEmpty()) throw new LibraryException("Library name cannot be empty");
        if (location == null || location.isEmpty()) throw new LibraryException("Location cannot be empty");
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new LibraryException("Phone number must be 10 digits");
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getLibraryName() { return libraryName; }
    public String getLocation() { return location; }
    public String getPhoneNumber() { return phoneNumber; }
}
