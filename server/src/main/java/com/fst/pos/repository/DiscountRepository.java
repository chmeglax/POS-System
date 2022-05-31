package com.fst.pos.repository;

import com.fst.pos.models.Discount;
import com.fst.pos.models.Product;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface DiscountRepository extends MongoRepository<Discount, String> {
}
