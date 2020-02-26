package com.jbk.EProc.Vehicle.Controller;

import java.util.List;

import com.jbk.EProc.Vehicle.Bean.Auction;


public interface AuctionController {

	public List<Auction> fetchalldeals();

	public Auction fetchdealbyid(int id);

}
