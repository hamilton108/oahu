package oahu.financial.html;

import com.gargoylesoftware.htmlunit.Page;
import oahu.financial.OptionPurchase;
import oahu.financial.critters.Critter;

import java.io.IOException;
import java.util.Optional;

public interface ETransaction {
    Optional<Page> sellPurchase(OptionPurchase purchase, Critter critter, boolean isTestRun) throws IOException;

}
