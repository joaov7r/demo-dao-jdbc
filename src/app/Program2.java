package app;

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

		sc.close();
	}

}
