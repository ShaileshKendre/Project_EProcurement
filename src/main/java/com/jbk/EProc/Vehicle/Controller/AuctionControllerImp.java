package com.jbk.EProc.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.EProc.Vehicle.Bean.Auction;
import com.jbk.EProc.Vehicle.Service.AuctionServiceImp;


@CrossOrigin
@RestController
@RequestMapping("/bid")
public class AuctionControllerImp implements AuctionController {

	@Autowired
	AuctionServiceImp auctionService;

	@GetMapping("/fetchalldeals")
	public List<Auction> fetchalldeals() {
		System.out.println("I Am in Controller....");
		return auctionService.fetchalldeals();
	}

	@GetMapping("/load/{id}")
	public Auction fetchdealbyid(@PathVariable("id") int id) {
		if (id > 0 && id < 5) {
			return auctionService.fetchdealbyid(id);
		} else {
			return new NosuchIdFoundException();
		/*return new RequestEntity(Auction,HttpStatus.BAD_REQUEST);*/
		}
	}
}
