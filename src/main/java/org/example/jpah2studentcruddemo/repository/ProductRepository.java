package org.example.jpah2studentcruddemo.repository;

import org.example.jpah2studentcruddemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
