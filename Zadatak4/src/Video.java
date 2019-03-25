
public class Video {
	private String kod;
	private String naziv;
	private int trajanje;
	private int brPregleda;
	public Video() {
		super();
	}
	public Video(String kod, String naziv, int trajanje, int brPregleda) {
		super();
		this.kod = kod;
		this.naziv = naziv;
		this.trajanje = trajanje;
		this.brPregleda = brPregleda;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getKod() {
		return kod;
	}
	public int getTrajanje() {
		return trajanje;
	}
	public int getBrPregleda() {
		return brPregleda;
	}
	@Override
	public String toString() {
		return "Jedinstveni kod videa je " + kod + ", naziva se " + naziv + ", trajanje videa je " + trajanje + ", broj pregleda je " + brPregleda + ".";
	}
	
}
