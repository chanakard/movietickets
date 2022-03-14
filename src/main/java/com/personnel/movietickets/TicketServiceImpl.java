package com.personnel.movietickets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personnel.movietickets.dao.TicketDAO;
import com.personnel.movietickets.bo.TicketsBo;
import com.personnel.movietickets.services.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketDAO ticketDao;
	
	@Override
	public void purchaseTicket(TicketsBo ticket) {
		//process Payment
		com.personnel.movietickets.entities.Tickets ticketentity = new com.personnel.movietickets.entities.Tickets();
		
		ticketDao.create(ticketentity);
		//send an email
	}
		

}
