package io.Springboot.demo.Server;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import io.Springboot.demo.Products;
//import java.util.stream.Stream;
//import java.util.stream.Collectors;
@Service
public class ProductsServer {
    List<Products> product = new ArrayList<>(Arrays.asList(
        new Products(101, "Iphone", 50000),
        new Products(102, "Macbook", 70000), 
        new Products(103, "cannon", 90000)));

    public List<Products> getProducts() {
        return product;
    }
    public Products getProductsById(int prodId){
        return product.stream().filter(p -> p.getProdId() == prodId).
        findFirst().orElse(new Products(100, "no item", 0));
    }
    public void addProduct(Products prod){
        product.add(prod);
    }
    public void changeProd(Products prod) {
       //for loop
       int index = 0;
       for(int i =0; i<product.size(); i++)
       {
            if (product.get(i).getProdId() == prod.getProdId()){
                index = i;
            }
       }
       product.set(index, prod);
    }
    public void delProduct(int prodId) {
        int index = 0;
       for(int i =0; i<product.size(); i++)
       {
            if (product.get(i).getProdId() == prodId){
                index = i;
            }
       }
       product.remove(index);
    }
}
