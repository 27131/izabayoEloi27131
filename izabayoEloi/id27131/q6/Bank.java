package id27131.q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank(int id, String createdDate, String updatedDate,
                String bankName, String branchCode, String address) throws BankDataException {
        super(id, createdDate, updatedDate);
        setBankName(bankName);
        setBranchCode(branchCode);
        setAddress(address);
    }

    public String getBankName() { return bankName; }
    public void setBankName(String bankName) throws BankDataException {
        if (bankName == null || bankName.trim().isEmpty())
            throw new BankDataException("Bank name required");
        this.bankName = bankName;
    }

    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) throws BankDataException {
        if (branchCode == null || branchCode.trim().length() < 3)
            throw new BankDataException("Branch code ≥ 3 chars");
        this.branchCode = branchCode;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws BankDataException {
        if (address == null || address.trim().isEmpty())
            throw new BankDataException("Address required");
        this.address = address;
    }
}
