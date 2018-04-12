package oahu.financial.html;

import oahu.financial.OptionPurchase;
import oahu.financial.critters.Critter;

public interface ETransaction {
    void sellPurchase(OptionPurchase purchase, Critter critter);

}
