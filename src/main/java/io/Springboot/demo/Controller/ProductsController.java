package io.Springboot.demo.Controller;
import java.util.List;
import io.Springboot.demo.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.Springboot.demo.Server.ProductsServer;
@RestController
public class ProductsController {

@Autowired
ProductsServer server;

@RequestMapping("/products")
    public List<Products> getProducts(){
        return server.getProducts();
    }
}
