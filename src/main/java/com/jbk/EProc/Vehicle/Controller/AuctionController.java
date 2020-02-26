package com.owner.controller;

import java.util.List;

import com.owner.domain.Auction;

public interface AuctionController {

	public List<Auction> fetchalldeals();

	public Auction fetchdealbyid(int id);

}
