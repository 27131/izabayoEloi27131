package id27131.q5;

public class Branch extends Entity {
    private String branchName;
    private String locationCode;

    public Branch(int id, String createdDate, String updatedDate, String branchName, String locationCode) throws RentalDataException {
        super(id, createdDate, updatedDate);
        if (branchName == null || branchName.isEmpty()) throw new RentalDataException("Branch name cannot be empty");
        if (locationCode == null || locationCode.length() < 3) throw new RentalDataException("Location code must be ≥3 chars");
        this.branchName = branchName;
        this.locationCode = locationCode;
    }

    public String getBranchName() { return branchName; }
    public String getLocationCode() { return locationCode; }
}
