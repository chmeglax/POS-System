package com.fst.pos.services;
import java.util.List;

import com.fst.pos.models.Product;

public interface ProductService {

    List<?> findAll();

    Product findById(String id);

    Product save(Product product);

    Product update(Product product);

    void delete(String id);
}
