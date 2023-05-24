package repository;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private Map<String, Product> products;

    public ProductRepository() {
        products = new HashMap<>();
    }

    public List<Product> list() {
        return new ArrayList<Product>(products.values());
    }
}
