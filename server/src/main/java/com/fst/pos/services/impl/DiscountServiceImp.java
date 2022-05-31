package com.fst.pos.services.impl;

import com.fst.pos.models.Discount;
import com.fst.pos.repository.DiscountRepository;
import com.fst.pos.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DiscountServiceImp implements DiscountService {

    @Autowired
    private DiscountRepository discountRepository;

    @Override
    public List<Discount> findAll() {
        return discountRepository.findAll();
    }

    @Override
    public Discount findById(String id) {
        return discountRepository.findById(id).orElse(new Discount());
    }

    @Override
    public Discount save(Discount discount) {
        discount.setCreatedDate(new Date());
        return discountRepository.save(discount);
    }

    @Override
    public Discount update(Discount discount) {
        return discountRepository.save(discount);
    }

    @Override
    public void delete(String id) {
        discountRepository.findById(id).ifPresent(product -> discountRepository.delete(product));
    }
}
