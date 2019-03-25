import java.util.ArrayList;
public class Autor extends User {
	private ArrayList<Video> videi = new ArrayList<Video>();
	private int subscribovanih;
	public Autor() {
		super("DefaultUser", "12345");
	}
	public Autor(String korisnickoIme, String lozinka) {
		super(korisnickoIme, lozinka);
		subscribovanih = 0;
	}
	public ArrayList<Video> getVidei() {
		return videi;
	}
	public void setVidei(ArrayList<Video> videi) {
		this.videi = videi;
	}
	public int getSubscribovanih() {
		return subscribovanih;
	}
	public void setSubscribovanih(int subscribovanih) {
		this.subscribovanih = subscribovanih;
	}
	public String getShortestVideo() {
		Video shortest=null;
		for(Video v: videi) {
			if(shortest!=null) {
				if(v.getTrajanje()<shortest.getTrajanje()) {
					shortest = v;
				}
			}
			else {
				shortest=v;
			}
		}
		
		if(shortest==null) return "";
		else return shortest.getKod();
	}
	public boolean addVideo(Video v) {
		for(Video vi:videi) {
			if(vi.getKod().equals(v.getKod())) {
				return false;
			}
		}
		return videi.add(v);
	}
	public int getUkupnoTrajanje() {
		int i=0;
		for(Video v:videi) {
			i+=v.getTrajanje();
		}
		return i;
	}
	public boolean removeVideo(String kod) {
		int toDelete=-1;
		for(int i=0;i<videi.size();i++) {
			if(videi.get(i).getKod().equals(kod)) {
				toDelete=i;
				break;
			}
		}
		if(toDelete==-1) {
			return false;
		}
		else {
			videi.remove(toDelete);
			return true;
		}			
	}
	@Override
	public String toString() {
		String retVal = super.toString();
		retVal+=" i imam "+subscribovanih+" subscribovanih korisnika."+"\nVideo koje je objavio su:\n";
				
		for(Video v:videi) {
			retVal+=v.toString()+"\n";
		}
		
		return retVal;
	}
}

