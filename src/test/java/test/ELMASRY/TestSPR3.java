package test.ELMASRY;
//Domain3.3
import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert;

import dataModel.Passenger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestSPR3 {

	@Inject
	@Named("myPassenger")
	Passenger passenger;
	@Test
	public void test() {
		Assert.assertEquals("2nd", passenger.getpClass());
		
	}
	
	
}
}
