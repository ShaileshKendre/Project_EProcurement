package com.owner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owner.dao.AuctionDaoImp;
import com.owner.domain.Auction;

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
