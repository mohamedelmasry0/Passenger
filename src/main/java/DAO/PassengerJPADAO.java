package DAO;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import dataModel.Passenger;

public class PassengerJPADAO {
@Inject
SessionFactory sf;
public void create(Passenger passenger) {
	Session session = sf.openSession();

	session.save(passenger);

}

public void update(Passenger Passenger) {
	sf.openSession().update(Passenger);
}

public void delete(Passenger Passenger) {
	sf.openSession().delete(Passenger);
}

public List<Passenger> search(Passenger Passenger) {
	Query<Passenger> query = sf.openSession().createQuery("from Passenger");
	List<Passenger> list = query.list();
	return list;
}
}
