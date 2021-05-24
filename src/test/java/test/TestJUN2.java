package test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import DAO.PassengerDAO;
import dataModel.Passenger;

//Domaine2. 2.
public class TestJUN2 {
	@Test
	public void test() throws IOException {
	PassengerDAO dao = new PassengerDAO(new File("data.csv"));
	List <Passenger> list = dao.read();
	System.out.println(list);
	}
}
