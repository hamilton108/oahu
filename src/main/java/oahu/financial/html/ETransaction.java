package oahu.financial.html;

import oahu.financial.OptionPurchase;
import oahu.financial.critters.Critter;

import java.io.IOException;

public interface ETransaction {
    void sellPurchase(OptionPurchase purchase, Critter critter, boolean isTestRun) throws IOException;

}
