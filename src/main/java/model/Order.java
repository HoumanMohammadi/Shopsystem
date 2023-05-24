package model;

import java.util.*;

public class Order {

    private String id;

    private List<Product> products= new ArrayList<>();

    public Order(String id) {
        this.id=id;
       // products= new List<>();// sollte initialliziert werden, weil sonst product  null ist
    }

    public Order(String id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                '}';
    }

    public Object getID() {
        return null;
    }
}
