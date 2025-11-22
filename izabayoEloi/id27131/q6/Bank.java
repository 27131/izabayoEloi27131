package id27131.q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank(int id, String createdDate, String updatedDate,
                String bankName, String branchCode, String address) throws BankingException {
        super(id, createdDate, updatedDate);
        if (bankName == null || bankName.trim().isEmpty()) throw new BankingException("Bank name cannot be empty");
        if (branchCode == null || branchCode.trim().length() < 3) throw new BankingException("Branch code must be at least 3 characters");
        if (address == null || address.trim().isEmpty()) throw new BankingException("Address cannot be empty");
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }

    public String getBankName() { return bankName; }
    public String getBranchCode() { return branchCode; }
    public String getAddress() { return address; }
}
