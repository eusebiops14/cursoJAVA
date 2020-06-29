package _68_application;

import java.util.Scanner;
import _68_entities.Student;

public class _68_program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student StudentData = new Student();
		
		
		System.out.print("Enter Student's Name: ");
		StudentData.StudentName = sc.next();
		StudentData.grade1 = sc.nextDouble();
		StudentData.grade2 = sc.nextDouble();
		StudentData.grade3 = sc.nextDouble();
		
		
		
		
		System.out.printf("FINAL GRADE = %.2f%n",StudentData.finalGrade());
		if (StudentData.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2F POINTS %n", StudentData.missingPoints());
		} 
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
