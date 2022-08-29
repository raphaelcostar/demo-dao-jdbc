package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		/*
		System.out.println("--- TESTE 1 - department insert");
		Department dep = new Department(null, "Administrative");
		//departmentDao.insert(dep);
		System.out.println("O id inserido foi: " + dep.getId());
		System.out.println();
		
		
		System.out.println("--- TESTE 2:  department update ---");
		Department novo = new Department(9, "Food");
		departmentDao.update(novo);
		System.out.println("Update completed!");
	
		
		System.out.println("--- TESTE 3: department delete ---");
		int id = novo.getId();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
	
		
		System.out.println("--- TESTE 4: department findById");
		System.out.print("Id : ");
		id = sc.nextInt();
		Department test = departmentDao.findById(id);
		System.out.println(test);
		System.out.println();
		*/
		System.out.println("--- TESTE 5: department findAll");
		List<Department> depList = departmentDao.findAll();
		for(Department department : depList) {
			System.out.println(department);
		}
	}
}
