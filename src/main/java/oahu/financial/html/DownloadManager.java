package oahu.financial.html;

import java.io.File;
import java.io.IOException;

public interface DownloadManager<T> {
    T getLastDownloadedHtmlPage(String ticker) throws IOException;
    File getLastDownloadedFile(String ticker) throws IOException;
}
