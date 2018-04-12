package oahu.financial;


import java.util.Optional;

public interface DerivativePrice {
    Derivative getDerivative();
    StockPrice getStockPrice();
    double getDays();
    Optional<Double> getIvBuy();
    Optional<Double> getIvSell();
    double getBuy();
    double getSell();
    Optional<Double> getBreakEven();
    Optional<Double> stockPriceFor(double optionValue);
    double optionPriceFor(double stockPrice);
    int getOid();
    void setOid(int oid);
    String getTicker();
    public double getCurrentRiscOptionValue();
    public double getCurrentRisc();
    public Optional<Double> getCurrentRiscStockPrice();
}
