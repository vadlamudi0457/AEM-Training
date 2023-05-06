package introduction_array;

public class Student {

	private Object name;
	private int[] marks;
	

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
		
	}


	public int getNumberOfMarks() {
		
		return marks.length;
	}


	public int getSumOfTotalMarks() {
		int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
		return sum;
	}


	public int getMaximumMarks() {
		int maximum= Integer.MIN_VALUE;
		for(int mark:marks) {
			if(mark > maximum) {
				maximum = mark;
			}
		}
		
		return maximum;
	}


	public int getMinimumMarks() {
		int minimum= Integer.MAX_VALUE;
		for(int mark:marks) {
			if(mark < minimum) {
				minimum = mark;
			}
		}
		
		return minimum;
	}


	

}
