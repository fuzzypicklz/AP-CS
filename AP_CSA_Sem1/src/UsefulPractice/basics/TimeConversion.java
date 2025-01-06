package UsefulPractice.basics;

public class TimeConversion {
	public static void main(String[] args) {
		final int hours = 234123443;
		final int minutes = 5244;
		final int seconds = 3;
		
		final int final_time = hours*3600+minutes*60+seconds;
		System.out.println("time in seconds: "+final_time);
	}
}
