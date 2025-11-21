package id27131.q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank(int id, String createdDate, String updatedDate, String bankName, String branchCode, String address) throws BankingDataException {
        super(id, createdDate, updatedDate);
        if (bankName == null || bankName.isEmpty()) throw new BankingDataException("Bank name cannot be empty");
        if (branchCode == null || branchCode.length() < 3) throw new BankingDataException("Branch code must be ≥3 chars");
        if (address == null || address.isEmpty()) throw new BankingDataException("Address cannot be empty");
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }

    public String getBankName() { return bankName; }
    public String getBranchCode() { return branchCode; }
    public String getAddress() { return address; }
}
