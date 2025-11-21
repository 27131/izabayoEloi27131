package id27131.q8;

public class Member extends Entity {
    private String memberName;
    private int memberId;
    private String contactNumber;

    public Member(int id, String createdDate, String updatedDate, String memberName, int memberId, String contactNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        if (memberName == null || memberName.isEmpty()) throw new LibraryDataException("Member name cannot be empty");
        if (memberId <= 0) throw new LibraryDataException("Member ID must be greater than 0");
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) throw new LibraryDataException("Contact number must be 10 digits");
        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }

    public String getMemberName() { return memberName; }
    public int getMemberId() { return memberId; }
    public String getContactNumber() { return contactNumber; }
}
