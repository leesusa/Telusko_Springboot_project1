package io.Springboot.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.Springboot.demo.Model.Products;

@Repository
public interface Productrepo extends JpaRepository<Products, Integer>{

}
