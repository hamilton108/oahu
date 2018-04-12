package oahu.financial.html;

import oahu.dto.Tuple;

import java.io.IOException;
import java.util.Optional;

public interface EtradeDownloader<HtmlPageType> {
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
