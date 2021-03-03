package oahu.financial.repository;

import oahu.financial.StockOptionPrice;
import oahu.financial.StockPrice;

import java.util.Optional;

public interface ChachedEtradeRepository<T> {
    Optional<StockOptionPrice> findDerivativePrice(T optionInfo);
    Optional<StockPrice> findSpot(String ticker);
    void invalidateCache();
}
