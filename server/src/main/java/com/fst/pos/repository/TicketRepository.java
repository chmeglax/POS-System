package com.fst.pos.repository;

import com.fst.pos.models.Product;
import com.fst.pos.models.Tickets;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Tickets, String> {
}
