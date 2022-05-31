package com.fst.pos.controllers;

import com.fst.pos.models.Product;
import com.fst.pos.models.Tickets;
import com.fst.pos.services.ProductService;
import com.fst.pos.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/ticket")
public class TicketController {
    @Autowired
    ProductService productService;
    @Autowired
    TicketService ticketService;
    @PostMapping
    public ResponseEntity<?> save(@RequestBody List<String> idsProducts) {
        List<Product> listProducts = new ArrayList<>();
        float total=0;
        Product _p = new Product();
        for (int i = 0; i < idsProducts.size(); i++) {
            _p =productService.findById(idsProducts.get(i));
            _p.setQuantity(_p.getQuantity()-1);
            productService.update(_p);
            listProducts.add(_p);
            total+=listProducts.get(i).getPrice();
        }
        Tickets _t = new Tickets();
        _t.setProductlist(listProducts);
        _t.setCreatedDate( new Date());
        _t.setTotal(total);
        Tickets savedTicket =ticketService.save(_t);
        return ResponseEntity.ok().body(savedTicket);
    }

    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<?> list = ticketService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
