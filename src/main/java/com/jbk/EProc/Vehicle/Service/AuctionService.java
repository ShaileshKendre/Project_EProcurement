package com.jbk.EProc.Vehicle.Service;

import java.util.List;

import com.jbk.EProc.Vehicle.Bean.Auction;


public interface AuctionService {

	public List<Auction> fetchalldeals();

	public Auction fetchdealbyid(int id);

}
