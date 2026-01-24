package io.Springboot.demo.Server;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import io.Springboot.demo.Products;

//import scala.collection.immutable.List;
@Service
public class ProductsServer {
    List<Products> product = Arrays.asList(
        new Products(101, "Iphone", 50000),
        new Products(102, "Macbook", 70000), 
        new Products(103, "cannon", 90000));

    public List<Products> getProducts() {
        return product;
    }
}
