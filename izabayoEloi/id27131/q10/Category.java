package id27131.q10;

public class Category extends Entity {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String createdDate, String updatedDate, String categoryName, String categoryCode) throws OrderDataException {
        super(id, createdDate, updatedDate);
        if (categoryName == null || categoryName.length() < 3) throw new OrderDataException("Category name must be at least 3 characters");
        if (categoryCode == null || categoryCode.length() < 3) throw new OrderDataException("Category code must be at least 3 characters");
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
}
