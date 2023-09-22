package com.tech.daoimpl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.daoi.DaoI;
import com.tech.model.Student;

@Repository
public class DaoImpl implements DaoI{

	@Autowired
	SessionFactory sf;
	@Override
	public int saveRecord(Student stu) {
	
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(stu);
		tx.commit();
		session.close();
		return stu.getSid();
	}
	@Override
	public List<Student> getSingleData(String us, String pw) {
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query query = session.createQuery("from Student where user=:user and pass=:pass");
		query.setParameter("user", us);
		query.setParameter("pass", pw);
		List studentList = query.getResultList();
		tx.commit();
		return studentList;
	}
	@Override
	public List<Student> getAllData(String us, String pw) {

     Session session=sf.openSession();
     Transaction tx=session.beginTransaction();
        Query query = session.createQuery("from Student");
        List studentsList = query.getResultList();
		return studentsList;
	}

}
