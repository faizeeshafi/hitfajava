package Hit.day6;

public class VariableTypesOOA {
	int i=10;
	static int s=100;
	void met(){
int j=10;
	}
	public static void main(String[] args) {
		TrainingRoom gandhi=new TrainingRoom();
		TrainingRoom nehru=new TrainingRoom();
		gandhi.teach();gandhi.teach();gandhi.teach();
		nehru.teach();nehru.teach();
	}
}
class TrainingRoom{
	public TrainingRoom() {
		System.out.println("Training room object created...");
	}
	Projector pro=new Projector();
	static Toilet toilet=new Toilet();
	void teach() {
		Student s=new Student();
	}
}
class Projector{
	public Projector() {
		System.out.println("Projector object created....");
	}
}
class Toilet{
	public Toilet() {
		System.out.println("toilet object created..");
	}
}
class Student
{
	public Student() {
		System.out.println("student object created...");
	}
}


