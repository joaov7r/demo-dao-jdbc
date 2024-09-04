package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

//This class tests the Department implementation and connection with DB
public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST #1: department insert =====");
		Department newDept = new Department(null, "Games");
		departmentDao.insert(newDept);
		System.out.println("Inserted! New id = " + newDept.getId());
		
		System.out.println("");
		
		System.out.println("=== TEST #2: department findById =====");
		Department dept = departmentDao.findById(2);
		System.out.println(dept);
		
		System.out.println("");
		
		System.out.println("=== TEST #3: department update =====");
		dept = departmentDao.findById(7);
		dept.setName("Food");
		departmentDao.update(dept);
		System.out.println("Update completed!");
		
		System.out.println("");
		
		System.out.println("=== TEST #4: department findAll =====");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll(newDept);
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("");
		
		System.out.println("=== TEST #5: department delete =====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
