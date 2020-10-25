package Information;

public class Teachers extends People {
	private String teacherName;
	private String teacherId;
public Teachers(int number,String name,String id,String course){
	setNo(number);
	setTeacherName(name);
	setTeacherId(id);
	setTeaCourse(course);
}
public int getNo(){
	return num;	
}
void setNo(int number) {
	this.num=number;	
}
public String getTeacherName(){
	return teacherName;	
}
void setTeacherName(String teacherName) {
	this.teacherName = teacherName;	
}
public String getTeacherId(){
	return teacherId;	
}
void setTeacherId(String teacherId) {
	this.teacherId = teacherId;	
}
public void setTeaCourse(String course) {
	super.course=course;
	}
public String getTeaCourse() {
	return super.course;
	}
}
