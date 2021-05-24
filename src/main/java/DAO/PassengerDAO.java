package DAO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import dataModel.Passenger;

//2)b,c
public class PassengerDAO {
	private static final String DELIM = ";";
	private File file;
	public PassengerDAO(File file) {
		this.file= file;
	
	}
	
	public List<Passenger> read() throws IOException{
		//File file = new File("data.csv");
		List<Passenger> passengers = new ArrayList<Passenger>();
		List<String>lines = Files.readAllLines(file.toPath());
		lines.remove(0);
		for (String line:lines) {
			String[] passengerParts = line.split(DELIM);
			Passenger passenger = new Passenger();
			passenger.setName(passengerParts[0].trim());
			passenger.setpClass(passengerParts[1].trim());
			String rawAge= passengerParts[2];
			if (rawAge!=null&&!rawAge.trim().isEmpty()) {
				Double age =Double.valueOf(rawAge.trim());
				passenger.setAge(age);
			}
			
			
			String sex = passengerParts[3].trim();
			passenger.setSex(sex);
			String rawSurvived= passengerParts[4];
			if (rawSurvived!=null&&!rawSurvived.trim().isEmpty()) {
				Integer survived =Integer.valueOf(rawSurvived.trim() );
				passenger.setSurvived(survived);
			}
			passengers.add(passenger);
		}
		return passengers;
	}
	//2. d
	public void sortbyPasengerClass(List<Passenger>passengers) {
		passengers.sort( (p1,p2) -> p1.getpClass().compareTo(p2.getpClass()));
	}
}
