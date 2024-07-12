package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.College;
import com.bean.Student;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student stu = new Student();
		Student st = new Student(1002,"akki","karur",96);
		Student st1 = new Student(1003,"diwan","Trichy",96);
		Student st2 = new Student(1004,"hari","dindigul",96);
		Student st3 = new Student(1005,"tharun","kerala",96);
		/*st.setS_id(30);
		st.setName("Ammu Kutty");
		st.setAddress("Karur");
		st.setMarks(98);*/
		Configuration con = new Configuration();
	       con.configure("Resource/hibernate.cfg.xml");
	       SessionFactory sf= con.buildSessionFactory();
	       Session ss= sf.openSession();
	       Transaction trns = ss.beginTransaction();
	      /* ss.save(st);
	       ss.save(st1);
	       ss.save(st2);
	       ss.save(st3);
	       */
	       
	    /*  College cg= new College();
	       cg.setNo_of_staffs(15);
	       cg.setHod_name("Anbumani Sir");
	       cg.setDept_name("CSE");
	       ss.save(cg);*/
	      
	       
	      Object obj= ss.load(Student.class, new Integer(1002));
	      //Student get= (Student) obj;
	       trns.commit();
	     //  System.out.println(get);
	       System.out.print(obj);
	       
	}

}
