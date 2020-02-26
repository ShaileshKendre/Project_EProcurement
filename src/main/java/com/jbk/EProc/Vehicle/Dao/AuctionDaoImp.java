package com.jbk.EProc.Vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jbk.EProc.Vehicle.Bean.Auction;
import com.jbk.EProc.Vehicle.Bean.AuctionMapper;


@Repository
public class AuctionDaoImp implements AuctionDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Auction> fetchalldeals() {
		System.out.println("I Am in Daooooooo");
		String query = "select * from portal";
		return jdbcTemplate.query(query, new AuctionMapper());
	}

	public Auction fetchdealbyid(int id) {
		String query = "select * from portal where id='" + id + "'";
		return jdbcTemplate.queryForObject(query, new AuctionMapper());
	}

}
