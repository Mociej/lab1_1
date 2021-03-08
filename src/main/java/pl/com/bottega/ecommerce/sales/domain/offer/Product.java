package pl.com.bottega.ecommerce.sales.domain.offer;

public class Product {

    private String productId;
    private String productType;
    private String productName;

    public Product(String id,String pt, String pn){
        setProductId(id);
        setProductType(pt);
        setProductName(pn);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
