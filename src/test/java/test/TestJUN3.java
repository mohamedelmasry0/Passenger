package test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import DAO.PassengerDAO;
import dataModel.Passenger;


public class TestJUN3 {
@Test
public void TestListSizeWithRegularDataFile() throws IOException {
	//given 17 passenger
	PassengerDAO dao = new PassengerDAO(new File("data.csv"));
	
	//When I read File
	List <Passenger> list = dao.read(); 
	//Then find 17 pass
	//Assert.assertNotNull(list);
	Assert.assertEquals(17, list.size());
}
}
