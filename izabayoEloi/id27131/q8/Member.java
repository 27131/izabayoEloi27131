package id27131.q8;

public class Member extends Book {
    private String memberName;
    private int memberId;
    private String contactNumber;

    public Member(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
              sectionName, sectionCode, title, author, ISBN);
        setMemberName(memberName);
        setMemberId(memberId);
        setContactNumber(contactNumber);
    }

    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) throws LibraryDataException {
        if (memberName == null || memberName.trim().isEmpty())
            throw new LibraryDataException("Member name required");
        this.memberName = memberName;
    }

    public int getMemberId() { return memberId; }
    public void setMemberId(int memberId) throws LibraryDataException {
        if (memberId <= 0) throw new LibraryDataException("Member ID > 0");
        this.memberId = memberId;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws LibraryDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new LibraryDataException("Contact must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
