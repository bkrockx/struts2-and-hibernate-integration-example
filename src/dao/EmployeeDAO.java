package dao;

import java.util.List;
import domain.*;
import web.*;

public interface EmployeeDAO {

	public void saveEmployee(Employee employee);
	public List<Employee> listEmployee();
	
}
