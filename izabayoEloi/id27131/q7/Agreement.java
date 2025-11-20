package id27131.q7;

public class Agreement extends Buyer {
    private String agreementDate;
    private String terms;

    public Agreement(int id, String createdDate, String updatedDate,
                     String agencyName, String location, String phoneNumber,
                     String agentName, String agentEmail, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String sellerContact,
                     String buyerName, String buyerEmail,
                     String agreementDate, String terms) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
              agentName, agentEmail, licenseNumber,
              propertyCode, propertyType, price,
              sellerName, sellerContact, buyerName, buyerEmail);
        setAgreementDate(agreementDate);
        setTerms(terms);
    }

    public String getAgreementDate() { return agreementDate; }
    public void setAgreementDate(String agreementDate) throws RealEstateDataException {
        if (agreementDate == null || agreementDate.trim().isEmpty())
            throw new RealEstateDataException("Agreement date required");
        this.agreementDate = agreementDate;
    }

    public String getTerms() { return terms; }
    public void setTerms(String terms) throws RealEstateDataException {
        if (terms == null || terms.trim().isEmpty())
            throw new RealEstateDataException("Agreement terms required");
        this.terms = terms;
    }
}
