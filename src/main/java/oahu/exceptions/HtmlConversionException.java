package oahu.exceptions;

public class HtmlConversionException extends  RuntimeException {
    private static final long serialVersionUID = 1L;

    public HtmlConversionException () {
        super();
    }

    public HtmlConversionException (String msg) {
        super(msg);
    }
}

