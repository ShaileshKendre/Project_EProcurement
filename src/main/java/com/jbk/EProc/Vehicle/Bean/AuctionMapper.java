package com.owner.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.owner.domain.Auction;

public class AuctionMapper implements RowMapper<Auction> {

	@Override
	public Auction mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("I Am in RowMapper....");
		Auction auction = new Auction();
		auction.setId(Integer.parseInt(rs.getString("id")));
		auction.setName(rs.getString("name"));
		auction.setRefno(rs.getString("refno"));
		auction.setPublishdate(rs.getString("publishdate"));
		auction.setMinbid(rs.getString("minbid"));
		auction.setBidstartat(rs.getString("bidstartat"));
		return auction;
	}

}