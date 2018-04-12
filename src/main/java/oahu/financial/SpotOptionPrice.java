package oahu.financial;

import java.time.LocalDate;

public interface SpotOptionPrice {
    int getOpxId();
    String getOpxName();
    LocalDate getPurchaseDate();
    int getDays();
    double getSpot();
    double getBuy();
    double getSell();
}

