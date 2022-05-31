package com.fst.pos.services.impl;

import com.fst.pos.models.Product;
import com.fst.pos.models.Tickets;
import com.fst.pos.repository.TicketRepository;
import com.fst.pos.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketServiceImpl implements TicketService {


    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Tickets> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public Tickets findById(String id) {
        return (Tickets) ticketRepository.findById(id).orElse(new Tickets());
    }

    @Override
    public Tickets save(Tickets tickets) {
        return ticketRepository.save(tickets);
    }

    @Override
    public Tickets update(Tickets tickets) {
        return ticketRepository.save(tickets);
    }

    @Override
    public void delete(String id) {
        ticketRepository.findById(id).ifPresent(product -> ticketRepository.delete(product));
    }
}
