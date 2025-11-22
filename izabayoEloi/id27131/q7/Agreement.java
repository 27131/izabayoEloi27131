package id27131.q7;

public class Agreement extends Entity {
    private String agreementDate;
    private String terms;

    public Agreement(int id, String createdDate, String updatedDate, String agreementDate, String terms) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (agreementDate == null || agreementDate.isEmpty()) throw new RealEstateDataException("Agreement date cannot be empty");
        if (terms == null || terms.isEmpty()) throw new RealEstateDataException("Terms cannot be empty");
        this.agreementDate = agreementDate;
        this.terms = terms;
    }

    public String getAgreementDate() { return agreementDate; }
    public String getTerms() { return terms; }
}
