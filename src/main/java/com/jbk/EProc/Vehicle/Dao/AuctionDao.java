package com.owner.dao;

import java.util.List;

import com.owner.domain.Auction;

public interface AuctionDao {

	public List<Auction> fetchalldeals();

	public Auction fetchdealbyid(int id);
}
