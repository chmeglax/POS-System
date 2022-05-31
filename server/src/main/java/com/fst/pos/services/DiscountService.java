package com.fst.pos.services;

import com.fst.pos.models.Discount;
import com.fst.pos.models.Product;

import java.util.List;

public interface DiscountService {
    List<?> findAll();

    Discount findById(String id);

    Discount save(Discount discount);

    Discount update(Discount discount);

    void delete(String id);
}
