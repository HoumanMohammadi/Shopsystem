package exception;

import java.util.NoSuchElementException;

public class ProductNotFoundException extends NoSuchElementException {

    public ProductNotFoundException(String id) {
        super("Product with " + id + " could not be found");
    }
}
