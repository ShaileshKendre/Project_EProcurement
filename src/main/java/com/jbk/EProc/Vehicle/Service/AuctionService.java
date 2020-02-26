package com.owner.service;

import java.util.List;

import com.owner.domain.Auction;

public interface AuctionService {

	public List<Auction> fetchalldeals();

	public Auction fetchdealbyid(int id);

}
