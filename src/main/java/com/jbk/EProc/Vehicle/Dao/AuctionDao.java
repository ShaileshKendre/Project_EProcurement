package com.jbk.EProc.Vehicle.Dao;

import java.util.List;

import com.jbk.EProc.Vehicle.Bean.Auction;


public interface AuctionDao {

	public List<Auction> fetchalldeals();

	public Auction fetchdealbyid(int id);
}
