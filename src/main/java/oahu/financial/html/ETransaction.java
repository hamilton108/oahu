package oahu.financial.html;

import oahu.financial.OptionPurchase;
import oahu.financial.critters.Critter;

import java.util.Optional;

public interface ETransaction<Page> {
    Optional<Page> sellPurchase(OptionPurchase purchase, Critter critter, boolean isTestRun);
}
