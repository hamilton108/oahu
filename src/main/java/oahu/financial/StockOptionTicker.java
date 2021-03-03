package oahu.financial;

public class StockOptionTicker {
    private final String value;
    public StockOptionTicker(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
