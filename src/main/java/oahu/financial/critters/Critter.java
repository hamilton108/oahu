package oahu.financial.critters;

public interface Critter {
    int getSellVolume();
    boolean apply(SellRuleArgs args);
    void inspect();
    void setStatus(int value);
}

