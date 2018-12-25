package oahu.financial.repository;

import oahu.dto.Tuple3;
import oahu.financial.Derivative;
import oahu.financial.DerivativePrice;
import oahu.financial.StockPrice;

import java.io.File;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

public interface EtradeRepository<T,T2> {
    public static enum PersistentCategory { OPTION_REF, OPTION_PRICE, STOCK_PRICE, ALL};
    Optional<DerivativePrice> findDerivativePrice(T optionInfo);
    Optional<StockPrice> stockPrice(String ticker);
    Optional<StockPrice> stockPrice(int oid);
    Collection<DerivativePrice> puts(String ticker);
    Collection<DerivativePrice> puts(int oid);
    Collection<DerivativePrice> calls(String ticker);
    Collection<DerivativePrice> calls(int oid);
    Collection<Derivative> callPutDefs(String ticker);

    //void saveToPersistentDataStore(PersistentCategory category);
    // void saveToPersistentDataStore(String ticker, File suppliedFile, PersistentCategory category);

    void setDownloadDate(LocalDate localDate);

    Tuple3<Optional<StockPrice>,Collection<DerivativePrice>,Collection<DerivativePrice>>
        parseHtmlFor(String ticker,File suppliedFile);

    void invalidateCache();
}
