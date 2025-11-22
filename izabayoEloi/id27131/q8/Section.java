package id27131.q8;

public class Section extends Entity {
    private String sectionName;
    private String sectionCode;

    public Section(int id, String createdDate, String updatedDate, String sectionName, String sectionCode) throws LibraryException {
        super(id, createdDate, updatedDate);
        if (sectionName == null || sectionName.isEmpty()) throw new LibraryException("Section name cannot be empty");
        if (sectionCode == null || sectionCode.length() < 3) throw new LibraryException("Section code must be at least 3 characters");
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }

    public String getSectionName() { return sectionName; }
    public String getSectionCode() { return sectionCode; }
}
