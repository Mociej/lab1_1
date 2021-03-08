package pl.com.bottega.ecommerce.sales.domain.offer;

public class Money {
    private String currency;
    public Money(String c){
        setCurrency(c);
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
