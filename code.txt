package introduction_array;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = {90,60,80};
		Student student = new Student("name",marks);
		int number = student.getNumberOfMarks();
		int sum = student.getSumOfTotalMarks();
		
		System.out.println("number of marks " + number);
		System.out.println("Sum of marks "+ sum);
		
		int maximumMark = student.getMaximumMarks();
		System.out.println("maximum marks "+ maximumMark);
		
		int minimumMarks = student.getMinimumMarks();
		System.out.println("mimimum value "+ minimumMarks);

	}

}
