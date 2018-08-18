package oahu.financial;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface StockPrice {
    double getValue();
    double getOpn();
    double getHi();
    double getLo();
    double getCls();
    double getMarketValue();
    int getVolume();
    Stock getStock();
    LocalDate getLocalDx();
    LocalTime getTm();
    int getOid();
    int getStockId();
    void assign(StockPrice other);
    List<DerivativePrice> getOptionPrices();
}
