package service;

import model.Order;
import model.Product;
import repository.OrderRepository;
import repository.ProductRepository;

import java.util.List;

public class ShopService {

    // dependencies -> the shopservice needs these properties

    private ProductRepository productRepository;
    private OrderRepository orderRepository;

    public ShopService(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public Order getOrderByID(String id){
        return orderRepository.getProducts(id);
    }

    public Product getProductByID(String id){
        return productRepository.getProducts(id);
    }

    public List<Product> listProducts(){
        return  productRepository.list();

    }

    public List<Order> listOrders(){
        return orderRepository.list();
    }
}
