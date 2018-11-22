package org.web.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.web.dao.EmployeeDao;
import org.web.model.Employee;

@Controller
public class MyController {

	@Autowired
	private EmployeeDao empDao;

	@RequestMapping(value = "/fetch")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {

		List<Employee> listEmp = empDao.empList();
		model.addObject("listEmp", listEmp);
		model.setViewName("index");

		return model;
	}
}
