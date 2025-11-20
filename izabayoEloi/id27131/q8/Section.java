package id27131.q8;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;

    public Section(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        setSectionName(sectionName);
        setSectionCode(sectionCode);
    }

    public String getSectionName() { return sectionName; }
    public void setSectionName(String sectionName) throws LibraryDataException {
        if (sectionName == null || sectionName.trim().isEmpty())
            throw new LibraryDataException("Section name required");
        this.sectionName = sectionName;
    }

    public String getSectionCode() { return sectionCode; }
    public void setSectionCode(String sectionCode) throws LibraryDataException {
        if (sectionCode == null || sectionCode.trim().length() < 3)
            throw new LibraryDataException("Section code ≥ 3 chars");
        this.sectionCode = sectionCode;
    }
}
