package Information;

public class Students extends People {
	private String studentName;
	private String studentId;
		
public Students(int number,String name,String sex,String id,int course){
	//setStudentChoose(choose);
	setNo(number);
	setStudentName(name);
	setStudentId(id);
	setCourses(course);
	}
//public void setStudentChoose(boolean choose) {
	//if (choose == true)
		//}
public int getNo(){
	return num;	
}
void setNo(int number) {
	this.num=number;	
}
public String getStudentName(){
	return studentName;	
}
void setStudentName(String studentName) {
	this.studentName = studentName;	
}
public String getStudentId(){
	return studentId;	
}
void setStudentId(String studentId) {
	this.studentId = studentId;	
}

public void setCourses(int courses) {
	super.courseNumber=courses;
}
public void addCourses(int courseNumber) {
	this.courseNumber = courseNumber+1;
}
public void reduceCourses(int courseNumber) {
	this.courseNumber = courseNumber-1;
}
public int getCourses() {
	return courseNumber;
}

}

