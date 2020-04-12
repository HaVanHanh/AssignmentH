package com.vti.template.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.template.controller.StudentController;
import com.vti.template.controller.UserController;
import com.vti.template.dto.LoginInformationDto;
import com.vti.template.dto.StudentDto;
import com.vti.template.form.LoginForm;
import com.vti.template.form.StudentForm;
import com.vti.template.form.Userform;
import com.vti.template.utils.Constant;
import com.vti.template.utils.ScannerUtil;

/**
 * This class is all functions of program.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 29, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 29, 2019
 */
public class Function {

	private StudentController studentController;
	
	private UserController userController;

	/**
	 * Constructor for class Function.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 8, 2020
	 */
	public Function() {
		studentController = new StudentController();
		userController = new UserController();
	}

	/**
	 * This method is used login .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 10, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 10, 2020
	 */
	public void login() {
		// demo login
		Scanner scanner = new Scanner(System.in);
		
		// input
		LoginForm loginForm = null;
		System.out.println("********* Demo Login *********");
		while (true) {
			// input account
			System.out.println("Inputting Account: ");
			String account = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);

			// input password
			System.out.println("Inputting Password: ");
			String password = ScannerUtil.readString(scanner, Constant.ERROR_VALIDATE_STRING);

			// convert to Object LoginForm
			loginForm = new LoginForm(account, password);

			// request login
			LoginInformationDto loginInformationDto = userController.login(loginForm);

			// get result
			if (null != loginInformationDto) {
				System.out.println("Login success!");

				if ("Admin".equals(loginInformationDto.getRole())) {
					System.out.println("Welcome Admin!");
				} else if ("Teacher".equals(loginInformationDto.getRole())) {
					System.out.println("Welcome Teacher " + loginInformationDto.getFullName() + "!");
				} else {
					System.out.println("Welcome Student " + loginInformationDto.getFullName() + "!");
				}
				// break while
				break;
			} else {
				System.out.println("Please! input again!");
			}
		}

		System.out.println("Home Page");
	}

	/**
	 * This method gets all the students .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 8, 2020
	 */
	public void getAllStudent() {
		// get all
		System.out.println("**********************************");
		System.out.println("Get All List Student");

		List<StudentDto> dtos = studentController.getAllStudent();

		// get result
		if (null != dtos) {
			System.out.println("List Students: ");
			for (StudentDto dto : dtos) {
				System.out.println(dto);
			}
		}
	}

	/**
	 * This method get student by student's ID .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 8, 2020
	 */
	public void getStudentByID() {
		// get by ID
		System.out.println("\n\n\n**********************************");
		System.out.println("Get Student By ID");

		System.out.println(studentController.getStudentByID(30));
	}

	/**
	 * This method create student.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 8, 2020
	 */
	public void createStudent() {
		// create
		System.out.println("\n\n\n**********************************");
		System.out.println("Create Student");

		String name = "Duy";
		StudentForm form = new StudentForm(name, 18, true, "1234abcd");
		studentController.createStudent(form);
	}

	/**
	 * This method is update student.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 8, 2020
	 */
	public void updateStudent() {
		// update
		System.out.println("\n\n\n**********************************");
		System.out.println("Update Student");

		int id = 1;
		StudentDto dto = studentController.getStudentByID(id);
		dto.setAge(30);
		dto.setName("hung");
		
		StudentForm form = new StudentForm(dto.getId(), dto.getName(), dto.getAge(), dto.isGender(), dto.getPassword());
		
		studentController.updateStudent(form);
	}

	/**
	 * This method delete student.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 8, 2020
	 */
	public void deleteStudent() {
		// delete
		System.out.println("\n\n\n**********************************");
		System.out.println("Delete Student");

		int id = 2;
		studentController.deleteStudent(id);
	}

	/**
	 * This method gets all the users .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 8, 2020
	 */
	public void getUserByID() {
		// get by ID
		System.out.println("\n\n\n*********DEMO CALL PROCEDURE*************************");
		System.out.println("Get User By ID");

		System.out.println(userController.getUserById(3));
	}
	

	/**
	 * This method import list user.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 8, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 8, 2020
	 */
	public void importListUser() {
		// create
		System.out.println("\n\n\n************DEMO IMPORT LIST USER**********************");
		System.out.println("Create List User");

		Userform user1 = new Userform("anh.cantuan@vti.com.vn", "ctanh", "Cấn Tuấn Anh", "Student");
		Userform user2 = new Userform("hanh.havan@vti.com.vn", "hvhanh", "Hà Văn Hanh", "Student");
		Userform user3 = new Userform("a.nguyenvan@vti.com.vn", "nva", "Nguyễn Văn A", "Studentaaaaaaaaaaaaaa");
		
		List<Userform> userForms = new ArrayList<>();
		userForms.add(user1);
		userForms.add(user2);
		userForms.add(user3);
		
		userController.importListUser(userForms);
	}
}
