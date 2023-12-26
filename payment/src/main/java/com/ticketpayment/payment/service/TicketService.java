package com.ticketpayment.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketpayment.payment.entity.Ticket;
import com.ticketpayment.payment.repository.TicketRepository;

@Service
public class TicketService {

    @Autowired
    private TicketRepository repository;

    // GET
    public List<Ticket> getTickets() {
        return repository.findAll();
    }
}
