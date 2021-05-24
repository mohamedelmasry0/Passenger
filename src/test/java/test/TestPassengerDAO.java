  package test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import DAO.PassengerDAO;
import dataModel.Passenger;

//2. e.
public class TestPassengerDAO {
	public static void main(String[] args) throws Exception {
		PassengerDAO dao = new PassengerDAO(new File("data.csv"));
		List <Passenger> list = dao.read();
		if(list==null||list.isEmpty()||list.size()!=17) {
			throw  new Exception("Failed");
		}
		System.out.println("suss");
	} 
	
}
