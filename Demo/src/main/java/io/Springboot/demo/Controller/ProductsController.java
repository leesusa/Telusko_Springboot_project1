package io.Springboot.demo.Controller;
import java.lang.annotation.Repeatable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import io.Springboot.demo.Model.Products;
import io.Springboot.demo.Server.ProductsServer;
@RestController
public class ProductsController {

@Autowired
ProductsServer server;

@GetMapping("/products")
    public List<Products> getProducts(){
        return server.getProducts();
    }

@GetMapping("/products/{prodId}")
    public Products getProductsById(@PathVariable int prodId){
        return server.getProductsById(prodId);
    }

@PostMapping("/products")
    public void addProduct(@RequestBody Products prod){
        server.addProduct(prod);
    }
@PutMapping("/products")
    public void changeProd(@RequestBody Products prod){
        server.changeProd(prod);
    }
@DeleteMapping("/products/{prodId}")
    public void delProduct(@PathVariable int prodId){
        server.delProduct(prodId);
    }
}
