package com.jsp.Spring.SpringProject;

import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import org.hibernate.*;

public class App 
{
	public static void main( String[] args )
	{
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction trans=session.beginTransaction();

		//@SuppressWarnings("deprecation")
		//BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//System.out.println(beanFactory.getBean(Student.class));
		//      Student student=beanFactory.getBean(Student.class);
		//      System.out.println(student);
		//BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//		Student st=beanFactory.getBean(Student.class);
		//		st.setsId(104);
		//		st.setsName("Rahul");
		//		st.setsContact(8965);
		//		session.save(st);
		//		trans.commit();
		//		session.close();
		//		System.out.println(st);
		//		
		//		Student st1=beanFactory.getBean(Student.class);
		//		st1.setsId(103);
		//		st1.setsName("santhosh");
		//		st1.setsContact(45674);
		//		session.save(st1);
		//		trans.commit();
		//		session.close();
		//		System.out.println(st1);

		//		Student bean =(Student) beanFactory.getBean("studentBean1");
		//		bean.setsId(103);
		//		bean.setsName("Rahul");
		//		bean.setsContact(123);
		//		session.save(bean);
		//		trans.commit();
		//		session.close();
		//		System.out.println(bean);

		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));

		//		Student student1=(Student) beanFactory.getBean("studentBean2");
		//		student1.setsId(105);
		//		student1.setsName("hgtydd");
		//		student1.setsContact(349056);
		//		
		//		Student s2=(Student) beanFactory.getBean("studentBean4");
		//		s2.setsId(106);
		//		s2.setsName("Subbu");
		//		s2.setsContact(85520);
		//		
		//		session.save(student1);
		//		session.save(s2);
		//		
		//		trans.commit();
		//		session.close();
		//		
		//		System.out.println(student1);
		//		System.out.println(s2);
		//		


		Student s1=new Student();
		s1.setsId(115);
		s1.setsName("xcbnmn");
		s1.setsContact(852);
		session.save(s1);

		System.out.println(s1);

		Student s2=new Student();
		s2.setsId(116);
		s2.setsName("fxghgg");
		s2.setsContact(1165);
		session.save(s2);
		trans.commit();
		session.close();
		System.out.println(s2);


	}
}