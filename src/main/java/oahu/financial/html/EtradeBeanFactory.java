package oahu.financial.html;

import java.time.LocalDate;
import java.time.LocalTime;

public interface EtradeBeanFactory {
    /*
    private String optionName;
    private String optionType;
    private String xPrice;
    private String expiry;
    private String buy;
    private String sell;
    */
    void onDerivativeParsed(String optionName,
                            String optionType,
                            double exercisePrice,
                            LocalDate expiry,
                            double buy,
                            double sell);
    void onStockPriceParsed(LocalTime spotTime,
                            double opn,
                            double hi,
                            double lo,
                            double close,
                            int volume);
    void onStockPriceParsed(LocalDate spotDate,
                            LocalTime spotTime,
                            double opn,
                            double hi,
                            double lo,
                            double close,
                            int volume);
}
