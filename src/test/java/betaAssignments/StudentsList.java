package betaAssignments;

import java.util.LinkedList;
import java.util.List;

public class StudentsList {
String StudId;
String StudName;
int StudClass;
char StudGrade;

	
	public static void main(String[] args) {
		
		StudentsLst s = new StudentsLst();
		s.StudId = "Sam123";
		s.StudName = "Sam";
		s.StudClass = 10;
		s.StudGrade = 'A';
		
		List<StudentsLst> ls = new LinkedList<StudentsLst>();
		ls.add(s);
		System.out.println(ls);
		}
	
		/*public static void main(String[] args)
		
		{
			Student s1 = new Student();
			s1.sId = 101;
			s1.sName = "Happy";
			
			Student s2 = new Student();
			s2.sId = 102;
			s2.sName = "Joy";
			
			Student s3 = new Student();
			s3.sId = 103;
			s3.sName = "Glory";
			
			Student s4 = new Student();
			s4.sId = 102;
			s4.sName = "Happy";
			//adding Student class to a collection
			
			LinkedList<Student> lls = new LinkedList<Student>();
			 lls.add(s1);
			 lls.add(s2);
			 lls.add(s3);
			 lls.add(s4);
			
			 
			 for(Student s : lls)
			 {
				 System.out.println(s.sName + " " + s.sId);
				
			}
			
					
		}*/
		

	


}

