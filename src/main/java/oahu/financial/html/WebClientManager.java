package oahu.financial.html;

import com.gargoylesoftware.htmlunit.Page;

import java.io.IOException;
import java.util.Optional;

public interface WebClientManager {
    Page getPage(String url) throws IOException;
    Optional<Page> logout() throws IOException;
}
