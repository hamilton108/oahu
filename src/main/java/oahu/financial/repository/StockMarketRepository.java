package oahu.financial.repository;

import oahu.exceptions.FinancialException;
import oahu.financial.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public interface StockMarketRepository {
    void insertDerivative(Derivative derivative, Consumer<Exception> errorHandler);
    Optional<Derivative> findDerivative(String derivativeTicker);
    Stock findStock(String ticker);

    Collection<Stock> getStocks();

    Collection<StockPrice> findStockPrices(String ticker, LocalDate fromDx);

    void registerOptionPurchase(DerivativePrice purchase, int purchaseType, int volume);
    OptionPurchase registerOptionPurchase(int purchaseType, String opName, double price, int volume, double spotAtPurchase, double buyAtPurchase)
    throws FinancialException;


    Collection<SpotOptionPrice> findOptionPrices(int opxId);
    Collection<SpotOptionPrice> findOptionPricesStockId(int stockId, LocalDate fromDate, LocalDate toDate);
    Collection<SpotOptionPrice> findOptionPricesStockIds(List<Integer> stockIds, LocalDate fromDate, LocalDate toDate);
    Collection<SpotOptionPrice> findOptionPricesStockTix(List<String> stockTix, LocalDate fromDate, LocalDate toDate);
    String getTickerFor(int oid);
}
