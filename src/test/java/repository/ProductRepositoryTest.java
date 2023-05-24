package repository;

import model.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    //Method + should + when
    //
    @Test

    void list_WhenProductMapIsEmpty_shouldReturnNoProduct() {

        //Given
        //Instance: a concrete object of type

        List<Product> expectedProductList = new ArrayList<>();

        ProductRepository productRepository = new ProductRepository(expectedProductList);
        //List<Product> expectedProductList= new ArrayList<>();

        //When
        List<Product> actualProductList = productRepository.list();
        int expectedListLength = 0;

        //Then
        assertEquals(actualProductList, expectedProductList);
        assertEquals(expectedListLength, actualProductList.size());
    }



    @Test

    void list_WhenProductMapHasOneProduct_shouldReturnOneProduct(){

        //Given
        //Instance: a concrete object of type

        Product appleKeyboard = new Product("1", "Apple Keyboard");
        List<Product> expectedProductList= new ArrayList<>();
        expectedProductList.add(appleKeyboard);
        ProductRepository productRepository= new ProductRepository(expectedProductList);

        //When
        List<Product> actualProductList = productRepository.list();
        int expectedListLength=1;

        //Then
        assertEquals(actualProductList, expectedProductList);
        assertEquals(expectedListLength, actualProductList.size());

    }

}