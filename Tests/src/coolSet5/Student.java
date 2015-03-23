package coolSet5;

public class Student implements Comparable<Student> {
	public String fName;
	private String lName;
	private int iD;
	public Student(int id)  {
		iD = id;
		fName = randString();
		lName = randString();
	}
	
	public String toString() {
		return String.format("%-7s %-7s %05d\n", fName, lName, iD);
	}
	
	public static String randString() {
		String retStr = "";
		retStr += (char)((int)(Math.random() * 26 + 65));
		for (int i = 0; i< 6; i++) {
			if (Math.random() > .2) {
				retStr += (char)((int)(Math.random() * 26 + 97));
			}
		}
		return retStr;
	}
	
	public int compareTo(Student s) {
		return fName.compareTo(s.fName);
	}
}
