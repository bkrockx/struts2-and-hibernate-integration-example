package web;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.*;
import domain.*;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {

	private Employee employee = new Employee();
	private List<Employee> employeeList = new ArrayList<Employee>();
	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
	@Override
	public Employee getModel() {
		return employee;
	}
	
	public String add(){
		employeeDAO.saveEmployee(employee);
		return SUCCESS;
	}
	
	public String list(){
		employeeList = employeeDAO.listEmployee();
		return SUCCESS;
	}
		
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}
