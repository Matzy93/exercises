import java.util.List;
import java.util.ArrayList;

public class KindergartenGarden {

	String plants;
	String[] students;
	int no_students;


	public KindergartenGarden(String plants) {
		this.plants = plants;
		this.no_students = (plants.length()-1)/4;
	}

	public KindergartenGarden(String plants, String [] students) {
		this.plants = plants;
		this.students = students;
		this.no_students = this.students.length;
	}

	List<Plant> getPlantsOfStudent(String student) {
		char firstChar = student.charAt(0);
		int no = firstChar - 65;

		List<Plant> result = new ArrayList<Plant>();

		result.add(Plant.getPlant(this.plants.charAt(no*2)));
		result.add(Plant.getPlant(this.plants.charAt(no*2+1)));
		result.add(Plant.getPlant(this.plants.charAt(no*2+this.no_students*2+1)));
		result.add(Plant.getPlant(this.plants.charAt(no*2+this.no_students*2+2)));

		return result;
	}

}
