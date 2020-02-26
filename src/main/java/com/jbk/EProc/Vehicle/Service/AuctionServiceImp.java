package com.jbk.EProc.Vehicle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.EProc.Vehicle.Bean.Auction;
import com.jbk.EProc.Vehicle.Dao.AuctionDaoImp;

@Service
public class AuctionServiceImp implements AuctionService{

	@Autowired
	AuctionDaoImp auctionDao;
	
	public List<Auction> fetchalldeals() {
		System.out.println("I Am in Service....");
		return auctionDao.fetchalldeals();
	}

	public Auction fetchdealbyid(int id) {
		return auctionDao.fetchdealbyid(id);
	}

}
