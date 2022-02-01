package ch.bbw.vr.reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ReservationService {
	
	private List<Reservation> reservations = new ArrayList<>(Arrays.asList(
			new Reservation (1, "Peter", "Muster", "peter@gmail.com", 5),
			new Reservation (2, "Vibishek", "Rathi", "vibigmail.com", 2),
			new Reservation (3, "Leo", "Messi", "messigmx.ch", 6)
			));
	
	public List<Reservation> getAllReservations(){
		if(reservations.isEmpty()) {
			return null;
		} 
		return reservations;
	}
	
	public void addReservation(Reservation value) {
		reservations.add(value);
	}
			

}
