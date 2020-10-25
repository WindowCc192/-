# -
实验三选课系统
## 实验目的
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。

1.编写上述实体类以及测试主类（注意类之间继承关系的适用）

2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息
## 实验方法
实验课堂上讲基本的架构基本功能进行实现，课后结合资料与人讨论完善系统，期间对每个重要版本进行保存。尽可能去尝试新的东西，在运用的过程中发现程序的bug或者是程序逻辑上的不完整的地方，尽力去除bug，完善逻辑。解决bug的一般方法是，语法错误则读提示，查相关语法资料，逻辑bug则可以设置断点，或者分模块调试。程序的逻辑不完善则需要重新构思，新模块的实现方法和与老模块的兼容性。

## 核心代码  
主类定义：
public static void main(String[] args) {
		// People peo0= new People();每次定义为一个人，再分学生老师
		Students stu0 = new Students(1,"Lily","女","S1001",0);
		//Students stu1 = new Students("S1002","Bob");
		Teachers tea1 = new Teachers(1,"Sua","T1001","线性代数");
		Courses cou0 = new Courses(1,"线性代数","教104",0);
		
		for(;;) {
		System.out.println("<学生选课系统>");
		System.out.println("<学生信息>");
		System.out.println("编号   姓名   学号   课数");
		System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		//System.out.println("Name:"+stu1.getStudentName()+"ID:"+stu1.getStudentId());
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入学生编号：");
		int x =reader.nextInt();
		if(x==1) {//1号学生
			System.out.println("选课：请输入1");
			System.out.println("退课：请输入2");
			int y =reader.nextInt();
	        
		if(y==1){//1为选课
			System.out.println("<课程信息>");
			System.out.println("编号   课程名称   教学地点   选课人数");
			System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
			System.out.println("请输入选择课程编号：");
			int z =reader.nextInt();
			if(z==1) {
				cou0.addStuNo(cou0.getStuNo());
				stu0.addCourses(stu0.getCourses());
				System.out.println("选课人数"+cou0.getStuNo()+"选课数"+stu0.getCourses());
				System.out.println("<教师信息>");
				System.out.println("编号   姓名   学号   授课");
				System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
						}
			else {
				System.out.println("无此课程信息，请重新选择！");
			}
		}
		else if(y==2) {//2为退课
			System.out.println("<课程信息>");
			System.out.println("编号   课程名称   教学地点   选课人数");
			System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
			System.out.println("请输入选择课程编号：");
			int z =reader.nextInt();
			if(z==1) {
				cou0.reduceStuNo(cou0.getStuNo());
				stu0.reduceCourses(stu0.getCourses());
				System.out.println("选课人数"+cou0.getStuNo()+"选课数"+stu0.getCourses());
				System.out.println("<教师信息>");
				System.out.println("编号   姓名   学号   授课");
				System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
						}
			else {
				System.out.println("无此课程信息，请重新选择！");
			}
		}
		else System.out.println("输入有误，请输入1~2");
	}
		else System.out.println("没有相关学生信息");
	}

people：
class People {
 int num;
 String id;
 String name;
 int courseNumber;//用数组length
 char sex;//true 男，false 女
 String course;//改成数组
 course：public class Courses {
	int num;
	int stuNo;
	String name;
	String add;
	
public Courses(int number,String name,String add,int stuNo){
	setNo(number);
	setName(name);
	setAdd(add);
	setStuNo(stuNo);
	}
## 实验结果
  如文件中图片所示
## 实验感想  
实验最初只完成了最基本的一些功能，不能叫做系统。在看了同学们的分享之后，完善了系统的逻辑，对整个系统搭建一个大致的结构。在修改程序的过程中，遇到了很多bug，主要是在使用数组时，需要对数组进行实例化内存分配。在完善程序的过程中，遇到了很多自己解决不了的问题，bug，通过询问同学和在网上查询资料解决问题。 搜索了网上的相关实验，我觉得我们掌握的东西不够多，课堂上讲解的内容也不够多，需要我们在实验中，在空余时间进一步学习。如果只掌握一些理论知识，离编写出程序还是有很大差距的。
