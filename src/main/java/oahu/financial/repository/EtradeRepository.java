package oahu.financial.repository;

import oahu.financial.StockOption;
import oahu.financial.StockOptionPrice;
import oahu.financial.StockPrice;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

public interface EtradeRepository<T> {
    public static enum PersistentCategory { OPTION_REF, OPTION_PRICE, STOCK_PRICE, ALL};
    Optional<StockOptionPrice> findDerivativePrice(T optionInfo);
    Optional<StockPrice> stockPrice(String ticker);
    Optional<StockPrice> stockPrice(int oid);
    Collection<StockOptionPrice> puts(String ticker);
    Collection<StockOptionPrice> puts(int oid);
    Collection<StockOptionPrice> calls(String ticker);
    Collection<StockOptionPrice> calls(int oid);
    Collection<StockOption> callPutDefs(int oid);
    Collection<StockOption> callPutDefs(String ticker);

    //void saveToPersistentDataStore(PersistentCategory category);
    // void saveToPersistentDataStore(String ticker, File suppliedFile, PersistentCategory category);

    void setDownloadDate(LocalDate localDate);

    //Tuple3<Optional<StockPrice>,Collection<DerivativePrice>,Collection<DerivativePrice>>
    //T2 parseHtmlFor(String ticker,File suppliedFile);

    void invalidateCache();
}
