package com.raj.demo.data;

import java.util.ArrayList;
import java.util.List;

import com.raj.demo.model.Partner;

public class DataAccess {

	public List<Partner> getPopulatedData() {
		List<Partner> partners = new ArrayList<>();
		Partner p1 = new Partner();
		p1.setName("A");
		p1.setAvailable(100.0);
		p1.setRate(1.3);
		partners.add(p1);

		Partner p2 = new Partner();
		p2.setName("B");
		p2.setAvailable(50.0);
		p2.setRate(1.35);
		partners.add(p2);

		Partner p3 = new Partner();
		p3.setName("C");
		p3.setAvailable(20.0);
		p3.setRate(1.37);
		partners.add(p3);

		return partners;
	}
}
