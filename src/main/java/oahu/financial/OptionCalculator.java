/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oahu.financial;


public interface OptionCalculator {

    double delta(DerivativePrice d);
    double spread(DerivativePrice d);
    double breakEven(DerivativePrice d);
    double stockPriceFor(double optionPrice, DerivativePrice o);
    double iv(DerivativePrice d, int priceType);

    double ivCall(double spot, double strike, double yearsExpiry, double optionPrice);
    double ivPut(double spot, double strike, double yearsExpiry, double optionPrice);
    double callPrice(double spot, double strike, double yearsExpiry, double sigma);
    double putPrice(double spot, double strike, double yearsExpiry, double sigma);
}
