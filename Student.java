import java.io.*;

public class Student extends StudentDetails {

	public static void main(String[] args) throws Exception {

		int studNum;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of students in class : ");
		studNum = Integer.parseInt(br.readLine());
		
		Student[] studentList = new Student[studNum];
		
		for(int i = 0; i < studentList.length; i++){
			
			studentList[i] = new Student();
			System.out.print("\nEnter name of Student " + (i+1) + " : ");
			studentList[i].studentName = br.readLine();
			System.out.print("\nEnter Roll No. of Student " + (i+1) + " : ");
			studentList[i].studentRollNo = Integer.parseInt(br.readLine());
			System.out.print("\nEnter Reg. No. of Student " + (i+1) + " : ");
			studentList[i].studentRegNo = Integer.parseInt(br.readLine());
		}
		
		System.out.println("\nDetails of students :");
		System.out.println("\nStudent Name\t\tRoll No\t\tRegistration No");
		for(int i = 0; i < studentList.length; i++){
			
			System.out.println(studentList[i].studentName + "\t\t" + studentList[i].studentRollNo + "\t\t" + studentList[i].studentRegNo);
			
		}
	}

}
