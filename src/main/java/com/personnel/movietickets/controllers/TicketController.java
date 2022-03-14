package com.personnel.movietickets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.personnel.movietickets.dao.TicketDAO;
import com.personnel.movietickets.bo.TicketsBo;
import com.personnel.movietickets.services.TicketService;

@Controller
public class TicketController {
	
	@Autowired
	private TicketService ticketService;

	@RequestMapping("/showCreateTicket")
	public String showCreateTicket()
	{
		return "createTicket";
	}
	
	@RequestMapping("/createTicket")
	public String createTicket(TicketsBo ticket, ModelMap modelMap)
	{		
		ticketService.purchaseTicket(ticket);
		modelMap.addAttribute("msg", "Ticket purchased succefully...");
		return "createTicket";
	}
}
