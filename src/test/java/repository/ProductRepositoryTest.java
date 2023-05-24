package repository;

import model.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    //Method + should + when
    @Test

    void list_WhenProductMapIsEmpty_shouldReturnNoProduct(){

        //Given
        //Instance: a concrete object of type

        ProductRepository productRepository= new ProductRepository();
        List<Product> expectedProductList= new ArrayList<>();

        //When
        List<Product> actualProductList = productRepository.list();
        int expectedListLength=0;

        //Then
        assertEquals(actualProductList, expectedProductList);
        assertEquals(expectedListLength, actualProductList.size());

    }

}