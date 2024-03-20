package student_management;
import java.util.Scanner;
public class Grade_and_achievements extends information_student {
	private float grade1;
	private float grade2;
	private float midterm_score;
	private float final_grade;
	private information_student student = new information_student();
	public Grade_and_achievements() {
		
	}
	
	public Grade_and_achievements(String name,String birth, String clas1,String numberphone, float grade1, float grade2, float midterm_score, float final_grade) {
		super(name, birth, clas1, numberphone);
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.midterm_score = midterm_score;
		this.final_grade = final_grade;
	}

	public float getGrade1() {
		return grade1;
	}

	public void setGrade1(float grade1) {
		this.grade1 = grade1;
	}

	public float getGrade2() {
		return grade2;
	}

	public void setGrade2(float grade2) {
		this.grade2 = grade2;
	}

	public float getMidterm_score() {
		return midterm_score;
	}

	public void setMidterm_score(float midterm_score) {
		this.midterm_score = midterm_score;
	}

	public float getFinal_grade() {
		return final_grade;
	}

	public void setFinal_grade(float final_grade) {
		this.final_grade = final_grade;
	}
	
	public void enterGrade() {
	    super.enterinfor();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter grade1: ");
	    this.setGrade1(sc.nextFloat());
	    System.out.println("Enter grade2: ");
	    this.setGrade2(sc.nextFloat());
	    System.out.println("Enter midterm_score: ");
	    this.setMidterm_score(sc.nextFloat());
	    this.setFinal_grade((float) (this.getGrade1() * 0.2 + this.getGrade2() * 0.3 + this.getMidterm_score() * 0.5));
	    System.out.println(this.toString());
	}


	@Override
	public String toString() {
	    return "Grade_and_achievements [name=" + getName() + ", birth=" + getBirth() + ", clas1=" + getClas1() + ", numberphone="
	            + getNumberphone() + ", grade1=" + grade1 + ", grade2=" + grade2 + ", midterm_score=" + midterm_score
	            + ", final_grade=" + final_grade + "]";
	}

	
	
	
	
}
