package com.ticketpayment.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketpayment.payment.entity.Ticket;
import com.ticketpayment.payment.service.TicketService;

@RestController
public class TicketController {

    @Autowired
    private TicketService service;

    // GET
    @GetMapping("/getTickets")
    public List<Ticket> getTickets() {
        return service.getTickets();
    }

}
