package introduction_StringArray;

public class StringRunnner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String maximumLengthOfCharacters = "";
		for (String day : daysOfWeek) {
			if (day.length() > maximumLengthOfCharacters.length()) {
				maximumLengthOfCharacters = day;
			}
		}
		System.out.println("maximum Length Of  Characters : " + maximumLengthOfCharacters);
		
		for(int i = 0; i < daysOfWeek.length; i++) {
			System.out.println(daysOfWeek[i]);
		}
		
		for(int i = daysOfWeek.length -1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
