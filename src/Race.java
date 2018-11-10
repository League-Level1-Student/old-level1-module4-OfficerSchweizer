
public class Race {

	public static  class Athlete {

		static int nextBibNumber;
		static String raceLocation = "New York";
		static String raceStartTime = "9.00am";

		String name;
		int speed;
		int bibNumber;

		Athlete(String name, int speed) {
			this.name = name;
			this.speed = speed;
			nextBibNumber++;
			
		}

		public static void main(String[] args) {
			Athlete athlete1 = new Athlete("Athlete", 10);
			Athlete athlete2 = new Athlete("Athlete2", 20);
			
			System.out.println(athlete1.nextBibNumber);
			
			raceLocation = "asdf";
		}

	}
}