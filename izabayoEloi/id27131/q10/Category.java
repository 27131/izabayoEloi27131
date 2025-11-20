package id27131.q10;

public class Category extends Store {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String createdDate, String updatedDate,
                    String storeName, String address, String email,
                    String categoryName, String categoryCode) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email);
        setCategoryName(categoryName);
        setCategoryCode(categoryCode);
    }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) throws OnlineShoppingDataException {
        if (categoryName == null || categoryName.trim().isEmpty())
            throw new OnlineShoppingDataException("Category name required");
        this.categoryName = categoryName;
    }

    public String getCategoryCode() { return categoryCode; }
    public void setCategoryCode(String categoryCode) throws OnlineShoppingDataException {
        if (categoryCode == null || categoryCode.trim().length() < 3)
            throw new OnlineShoppingDataException("Category code must be at least 3 characters");
        this.categoryCode = categoryCode;
    }
}
