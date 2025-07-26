package com.store.products.services;

import com.store.products.model.Product;
import com.store.products.repoistory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){

        try {
            return productRepository.findAll();
        }catch (Exception ex){
            throw new RuntimeException("bsdjbh");
        }
    }

    public Product save(Product product){
        product.setId(productRepository.count()+1);
        return productRepository.save(product);
    }

    public Optional<Product> findById(Long id ) {
        return productRepository.findById(id);
    }

    public Product updateProduct(Long id, Product product) {
        Product product1=findById(id).get();
        product1.setImage(product.getImage());
        product1.setName(product.getName());
        product1.setRate(product.getRate());
        product1.setSize(product.getSize());
        product1.setInventoryQuantity(product.getInventoryQuantity());
        return productRepository.save(product);
    }
}
