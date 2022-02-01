package ch.bbw.vr.reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ReservationController {
	@Autowired
	private ReservationService reservations;
	
	@GetMapping("/reservationlist")
	public String showReservation(Model model) {
		model.addAttribute("listOfReservations", reservations.getAllReservations());
		return "reservationlist";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	
	@GetMapping("/add-reservation")
	public String getRequestReservation(Model model) {
		Reservation value = new Reservation();
		model.addAttribute("reservation", value);
		return "inputform";
	}
	
	@PostMapping ("/add-reservation")
	public String postRequestReservation(@ModelAttribute Reservation reservation, Model model) {
		reservations.addReservation(reservation);
		return "redirect:/reservationlist";
	}
}
