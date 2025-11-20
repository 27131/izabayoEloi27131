package id27131.q5;

public class Branch extends Company {
    private String branchName;
    private String locationCode;

    public Branch(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        setBranchName(branchName);
        setLocationCode(locationCode);
    }

    public String getBranchName() { return branchName; }
    public void setBranchName(String branchName) throws RentalDataException {
        if (branchName == null || branchName.trim().isEmpty())
            throw new RentalDataException("Branch name required");
        this.branchName = branchName;
    }

    public String getLocationCode() { return locationCode; }
    public void setLocationCode(String locationCode) throws RentalDataException {
        if (locationCode == null || locationCode.trim().length() < 3)
            throw new RentalDataException("Location code must be ≥ 3 chars");
        this.locationCode = locationCode;
    }
}
