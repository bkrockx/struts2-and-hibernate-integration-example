package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import domain.*;
import web.*;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	@SessionTarget
	Session session;
	
	@TransactionTarget
	Transaction transaction;

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> listEmployee() {
		List<Employee> emp = null;
		try{
			emp = session.createQuery("from Employee").list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return emp;
	}
	
	@Override
	public void saveEmployee(Employee employee) {
		try{
			session.saveOrUpdate(employee);
		}catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
		}
	}
	
}
