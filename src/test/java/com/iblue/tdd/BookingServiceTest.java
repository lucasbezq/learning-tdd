package com.iblue.tdd;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.iblue.tdd.service.BookingService;

@RunWith(SpringRunner.class)
public class BookingServiceTest {
	
	@Autowired
	BookingService bookingService;
	
	@Test
	public void bookingServiceDaysCalculator() {
		String name = "Lucas";
		int days = bookingService.daysCalculatorWithDatabase(name);
		Assertions.assertEquals(days, 10);
	}
	
}
