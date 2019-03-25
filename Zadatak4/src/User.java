
public class User {
	private String korisnickoIme;
	private String lozinka;
	public User() {
		super();
	}
	public User(String korisnickoIme, String lozinka) {
		super();
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
	}
	@Override
	public String toString() {
		return "Korisnicko ime je " + korisnickoIme + ", a lozinka je " + lozinka;
	}
	
}
