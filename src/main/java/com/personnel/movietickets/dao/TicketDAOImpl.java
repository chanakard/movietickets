package com.personnel.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.personnel.movietickets.entities.Tickets;

@Repository
public class TicketDAOImpl implements TicketDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static String sql = "INSERT INTO TICKET(movie,screen,seat) VALUES(?,?,?)";

	@Override
	public void create(Tickets ticket) {

		jdbcTemplate.update(sql, ticket.getMovie(), ticket.getScreen(), ticket.getSeat());

	}

}
