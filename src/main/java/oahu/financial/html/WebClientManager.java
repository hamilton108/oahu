package oahu.financial.html;

import java.util.Optional;

public interface WebClientManager<Page> {
    Page getPage(String url);
    Optional<Page> logout();
}
