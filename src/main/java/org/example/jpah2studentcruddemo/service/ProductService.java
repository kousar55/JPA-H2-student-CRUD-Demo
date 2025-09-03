package org.example.jpah2studentcruddemo.service;

import org.example.jpah2studentcruddemo.model.Product;
import org.example.jpah2studentcruddemo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository)
    {
        this.productRepository=productRepository;
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Long id,Product product)
    {
        product.setId(id);
        return productRepository.save(product);
    }
    public void deletProduct(Long id){
        productRepository.deleteById(id);
    }
}
