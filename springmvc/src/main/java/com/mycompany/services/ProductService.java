package com.mycompany.services;

import com.mycompany.domain.Product;

import java.util.List;

/**
 * Created by mohamedsultan on 05/04/2017.
 */
public interface ProductService {
    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveOrUpdateProduct(Product product);

    void dropProductById(Integer id);
}
