package com.fst.pos.services;

import com.fst.pos.models.Product;
import com.fst.pos.models.Tickets;

import java.util.List;

public interface TicketService {
    List<?> findAll();

    Tickets findById(String id);

    Tickets save(Tickets tickets);

    Tickets update(Tickets tickets);

    void delete(String id);
}
