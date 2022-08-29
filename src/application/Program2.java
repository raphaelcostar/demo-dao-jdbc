package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		
		System.out.println("--- TESTE 1 - department insert");
		Department dep = new Department(null, "Administrative");
		//departmentDao.insert(dep);
		System.out.println("O id inserido foi: " + dep.getId());
		System.out.println();
		
		
		System.out.println("--- TESTE 2:  department update ---");
		Department novo = new Department(9, "Food");
		departmentDao.update(novo);
		System.out.println("Update completed!");
		
		
		
	}
}
