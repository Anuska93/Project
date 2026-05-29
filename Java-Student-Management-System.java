import java.util.Scanner;
class Student {
	int id;
	String name;
	int marks;

	Student(int id,String name,int marks) {
		this.id= id;
		this.name= name;
		this.marks= marks;
	}
	void display() {
		System.out.println("Id: "+id+"\nName: "+name+"\nMarks: "+marks);
	}
}
public class Main
{
	public static void main(String[] args) {
		Student[] students= new Student[100];
		int i=0;
		Scanner s= new Scanner(System.in);
		while(true) {
			System.out.println("\nMENU\n1.Add Student\n2.Display Student\n3.Exit\n");
			int choice= s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Id?");
				int id= s.nextInt();
				System.out.println("Name?");
				String name= s.next();
				System.out.println("Marks?");
				int marks= s.nextInt();
				students[i]= new Student(id,name,marks);
				i++;
				System.out.println("Student Added\n");
				break;
			case 2:
			    System.out.println("Displaying Students\n");
				for(int j=0; j<i; j++) {
					students[j].display();
				}
				break;
			case 3:
				return;
			case 4:
				System.out.println("Invalid Choice\n");
			}
		}
	}
}
