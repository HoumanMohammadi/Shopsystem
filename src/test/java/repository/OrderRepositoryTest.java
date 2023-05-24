package repository;

import model.Order;
import model.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {

    @Test

    void list_WhenOrderMapHasOneOrder_shouldReturnOneOrder(){

        //Given
        //Instance: a concrete object of type
        Product appleKeyboard = new Product("1", "Apple Keyboard");
        Order appleKeyboardOrder = new Order("23");
        List<Order> expectedOrderList= new ArrayList<>();
        expectedOrderList.add(appleKeyboardOrder);
        OrderRepository orderRepository= new OrderRepository(expectedOrderList);

        //When
        List<Order> actualOrderList = orderRepository.list();
        int expectedListLength=1;

        //Then
        assertEquals(actualOrderList, expectedOrderList);
        assertEquals(expectedListLength, actualOrderList.size());

    }




}