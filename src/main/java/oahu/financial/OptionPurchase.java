package oahu.financial;

import oahu.financial.critters.Critter;

import java.util.List;
import java.util.Optional;

public interface OptionPurchase {
    List<Critter> acceptedForSale();
    String getOptionName();
    Optional<DerivativePrice> getDerivativePrice();
    int getOid();
    boolean isFullySold();
}

