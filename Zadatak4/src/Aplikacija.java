
public class Aplikacija {

	public static void main(String[] args) {
Autor a = new Autor("Nikola", "12345678");
		
		a.addVideo(new Video("432", "Video1", 100, 1000));
		a.addVideo(new Video("432", "Video2", 200, 90000));
		a.addVideo(new Video("433", "Video3", 300, 2000));
		a.addVideo(new Video("434", "Video4", 50, 5000));
		
		System.out.println(a.toString());
		System.out.println("Kod videa sa najkracim trajanjem je: "+a.getShortestVideo());
		System.out.println("Ukupno trajanje je: "+a.getUkupnoTrajanje());
		
		a.removeVideo("432");
		System.out.println(a.toString());

	}

}
