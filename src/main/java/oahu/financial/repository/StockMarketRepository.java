package oahu.financial.repository;

import oahu.exceptions.FinancialException;
import oahu.financial.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;


public interface StockMarketRepository {
    void insertDerivative(StockOption stockOption);

    Optional<StockOption> findDerivative(String derivativeTicker);
    //Optional<StockOption> findDerivative(String derivativeTicker, Consumer<Exception> errorHandler);

    Stock findStock(String ticker);
    Stock findStock(int oid);

    Collection<Stock> getStocks();

    Collection<StockPrice> findStockPrices(String ticker, LocalDate fromDx);
    Collection<StockPrice> findStockPrices(int oid, LocalDate fromDx);

    void registerOptionPurchase(StockOptionPrice purchase, int purchaseType, int volume);
    //void registerOptionPurchase(StockOptionPrice purchase, int purchaseType, int volume, Consumer<Exception> errorHandler);

    OptionPurchase registerOptionPurchase(int purchaseType,
                                          String opName,
                                          double price,
                                          int volume,
                                          double spotAtPurchase,
                                          double buyAtPurchase);
    /*
    OptionPurchase registerOptionPurchase(int purchaseType,
                                          String opName,
                                          double price,
                                          int volume,
                                          double spotAtPurchase,
                                          double buyAtPurchase,
                                          Consumer<Exception> errorHandler);
     */


    Collection<SpotOptionPrice> findOptionPrices(int opxId);
    Collection<SpotOptionPrice> findOptionPricesStockId(int stockId, LocalDate fromDate, LocalDate toDate);
    Collection<SpotOptionPrice> findOptionPricesStockIds(List<Integer> stockIds, LocalDate fromDate, LocalDate toDate);
    Collection<SpotOptionPrice> findOptionPricesStockTix(List<String> stockTix, LocalDate fromDate, LocalDate toDate);
    Collection<OptionPurchase>  purchasesWithSalesAll(int purchaseType, int status, StockOption.OptionType ot);

    String getTickerFor(int oid);
}
