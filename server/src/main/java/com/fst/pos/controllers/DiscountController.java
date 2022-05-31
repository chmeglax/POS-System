package com.fst.pos.controllers;

import com.fst.pos.models.Discount;
import com.fst.pos.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/discount")
public class DiscountController {

    @Autowired
    DiscountService discountService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Discount discount) {
        Discount savedProduct = discountService.save(discount);
        return ResponseEntity.ok().body(savedProduct);
    }
    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<?> list = discountService.findAll();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Discount discount = discountService.findById(id);
        return ResponseEntity.ok().body(discount);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Discount discount) {
        Discount updatedSuperHero = discountService.update(discount);
        return ResponseEntity.ok().body(updatedSuperHero);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        discountService.delete(id);
        return ResponseEntity.ok().body("Deleted successfully...!");
    }
}
