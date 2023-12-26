package com.ticketpayment.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketpayment.payment.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    
}
