package _68_entities;

public class Student {
	public String StudentName;
	public double grade1;
	public double grade2;
	public double grade3;
	


public double finalGrade() {
	return  ((grade1 * 30) + (grade2 * 35) + (grade3 * 35))/100; 
	
	
}

public double missingPoints() {
	if (finalGrade() < 60.0) {
		return 60.0 - finalGrade();
		}
		else {
		return 0.0;
		}
}

//public String toString() {
	
//}

}