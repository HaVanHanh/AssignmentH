package com.vti.template.controller;

import java.util.List;

import com.vti.template.dto.LoginInformationDto;
import com.vti.template.dto.UserViewDto;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.form.LoginForm;
import com.vti.template.form.Userform;
import com.vti.template.service.UserService;
import com.vti.template.service.UserServiceImpl;
import com.vti.template.utils.validate.ValidateForm;

/**
 * This class is User controller.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 7, 2019
 */
public class UserController {

	private UserService service;
	private ValidateForm validate;

	/**
	 * Constructor for class UserController.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 */
	public UserController() {
		service = new UserServiceImpl();
		validate = new ValidateForm();
	}

	/**
	 * This method login to system.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 * @param form - LoginDto
	 */
	public LoginInformationDto login(LoginForm form) {
		try {
			validate.isValidateLoginForm(form);
			return service.login(form);

		} catch (MyCustomSQLException e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * This method is got user by input id.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 * @return UserViewDto
	 */
	public UserViewDto getUserById(int id) {
		try {
			return service.getUserById(id);

		} catch (MyCustomSQLException e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * This method is imported list user.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 * @param List<UserDto>
	 */
	public void importListUser(List<Userform> forms) {
		try {
			validate.isValidateImportListUserForm(forms);
			service.importListUser(forms);
			System.out.println("Import success!");

		} catch (MyCustomSQLException e) {
			System.out.println(e);
		}
	}
}
