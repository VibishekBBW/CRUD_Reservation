package ch.bbw.vr.reservation;

public class Reservation {
	public long id;
	public String vorname;
	public String name;
	public String email;
	public long anzahl;
	
	public Reservation() {
		super();
	}

	public Reservation(long id, String vorname, String name, String email, long anzahl) {
		super();
		this.id = id;
		this.vorname = vorname;
		this.name = name;
		this.email = email;
		this.anzahl = anzahl;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(long anzahl) {
		this.anzahl = anzahl;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", vorname=" + vorname + ", name=" + name + ", email=" + email + ", anzahl="
				+ anzahl + "]";
	}
	
	
	
	
	
	

}
