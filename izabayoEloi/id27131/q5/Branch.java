package id27131.q5;

public class Branch extends Company {
    private String branchName;
    private String locationCode;

    public Branch(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode) throws RentalException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        if (branchName == null || branchName.trim().isEmpty())
            throw new RentalException("Branch name cannot be empty");
        if (locationCode == null || locationCode.length() < 3)
            throw new RentalException("Location code must be at least 3 chars");
        this.branchName = branchName;
        this.locationCode = locationCode;
    }

    public String getBranchName() { return branchName; }
    public String getLocationCode() { return locationCode; }
}
