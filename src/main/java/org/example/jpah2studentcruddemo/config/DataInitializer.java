package org.example.jpah2studentcruddemo.config;

import org.example.jpah2studentcruddemo.model.Product;
import org.example.jpah2studentcruddemo.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;

public class DataInitializer implements CommandLineRunner {

    private  final ProductRepository productRepository;

    public DataInitializer(ProductRepository productRepository){
        this.productRepository=productRepository;
    }



    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("prduct 1","description 1",100));
        productRepository.save(new Product("prduct 2","description 2",200));

    }
}
