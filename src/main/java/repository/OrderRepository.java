package repository;

import exception.ProductNotFoundException;
import model.Order;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private List<Order> orders;

    public OrderRepository() {
        orders = new ArrayList<>();
    }

    public OrderRepository(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> list() {
        return orders;
    }

    public Order getProducts(String idOfRequestedProduct) {
        for (Order singleOrderFromList: orders){
            if (singleOrderFromList.getID().equals(idOfRequestedProduct)){
                return singleOrderFromList;
            }
        }
        //if searched but not found should throw an exception
        throw new ProductNotFoundException(idOfRequestedProduct);
    }
}
