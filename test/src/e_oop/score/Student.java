package e_oop.score;

public class Student {

	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	
	Student(){
		
	}
	
	Student(int i){
		
		name = "학생"	 + (i + 1);
		rank = 1;
		kor = (int)(Math.random() * 100 + 1);
		eng = (int)(Math.random() * 100 + 1);
		math = (int)(Math.random() * 100 + 1);
		sum = kor + eng + math;
		avg = Math.round((double)(sum / 3) * 100) / 100d;
				
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}

	 Student[] ranking(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students.length; j++) {
				if(students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
//			System.out.println(students[i].toString());
		}
		Student temp;
		for(int i = 0; i < students.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < students.length; j++) {
				if(students[j].sum > students[min].sum) {
					min = j;
				}
			}
			temp = students[min];
			students[min] = students[i];
			students[i] = temp;
		}
			return students;
	}
		
		
		
		
//		Student temp;
//		for(int i = 0; i < students.length; i++) {
//			for(int j = i + 1; j < students.length; j++) {
//				if(students[j].rank < students[i].rank) {
//					temp = students[j];
//					students[j] = students[i];
//					students[i] = temp;
//				}
//			}
		
		
	

	void print(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			System.out.println("이름 : " + students[i].name + " / 국어 : " + students[i].kor + ", 영어 : " + students[i].eng + ", 수학 : " + students[i].math + " / 합계 : " + students[i].sum + " / 평균 " + students[i].avg + "/ 석차 : " + students[i].rank);
		}
		
		
		
	}
	
	
	
}
