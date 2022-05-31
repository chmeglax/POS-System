package com.fst.pos.controllers;

import com.fst.pos.models.Product;
import com.fst.pos.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Product product) {
        product.setCreatedDate(new Date());
        Product savedProduct = productService.save(product);
        return ResponseEntity.ok().body(savedProduct);
    }
    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<?> list = productService.findAll();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Product product = productService.findById(id);
        return ResponseEntity.ok().body(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id,@RequestBody Product product) {
        Optional<Product> productData = Optional.ofNullable(productService.findById(id));
        if (productData.isPresent()) {
            Product _product = productData.get();
            _product.setPrice(product.getPrice());
            _product.setName(product.getName());
            _product.setQuantity(product.getQuantity());
            return new ResponseEntity<>(productService.update(_product), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        productService.delete(id);
        return ResponseEntity.ok().body("Deleted successfully...!");
    }

}
