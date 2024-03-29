package oahu.financial.html;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public interface EtradeDownloader<T, TickerInfo, P extends Serializable> {
    T downloadDerivatives(TickerInfo tickerInfo);
    /*
    HtmlPageType downloadDerivatives() throws IOException;
    HtmlPageType downloadDerivatives(TickerInfo tickerInfo) throws IOException;
    HtmlPageType downloadIndex(String stockIndex) throws IOException;
    HtmlPageType downloadPaperHistory(String ticker) throws IOException;

    HtmlPageType downloadDepth(String ticker) throws  IOException;
    HtmlPageType downloadPurchases(String ticker) throws  IOException;
    */
    // Optional<Tuple<String>> logonParam();
    /*
    void login() throws IOException;
    void logout() throws IOException;
    void close();
    HtmlPageType getLoginPage();
    HtmlPageType getLogoutPage();
    WebClientType getWebClient();
    */
}
