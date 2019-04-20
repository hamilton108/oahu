package oahu.financial.html;

import java.io.IOException;
import java.io.Serializable;

public interface EtradeDownloader<HtmlPageType, P extends Serializable> {
    HtmlPageType downloadDerivatives() throws IOException;
    HtmlPageType downloadDerivatives(String ticker) throws IOException;
    HtmlPageType downloadIndex(String stockIndex) throws IOException;
    HtmlPageType downloadPaperHistory(String ticker) throws IOException;

    HtmlPageType downloadDepth(String ticker) throws  IOException;
    HtmlPageType downloadPurchases(String ticker) throws  IOException;
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
