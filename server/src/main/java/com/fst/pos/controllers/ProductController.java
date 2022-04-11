package com.fst.pos.controllers;

import com.fst.pos.models.Product;
import com.fst.pos.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Product product) {
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

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Product product) {
        Product updatedSuperHero = productService.update(product);
        return ResponseEntity.ok().body(updatedSuperHero);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        productService.delete(id);
        return ResponseEntity.ok().body("Deleted successfully...!");
    }

}
