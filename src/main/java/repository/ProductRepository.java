package repository;

import exception.ProductNotFoundException;
import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
    }

    public ProductRepository(List<Product> products) {
        this.products = products;
    }

    public List<Product> list() {
        return products;
    }

    public Product getProducts(String idOfRequestedProduct) {
        for (Product singleProductFromList: products){
            if (singleProductFromList.getId().equals(idOfRequestedProduct)){
                return singleProductFromList;
            }
        }
        //if searched but not found should throw an exception
        throw new ProductNotFoundException(idOfRequestedProduct);
    }
}
