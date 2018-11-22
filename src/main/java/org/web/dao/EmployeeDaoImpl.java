package org.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.web.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemp;

	public EmployeeDaoImpl(DataSource dataSource) {
		jdbcTemp = new JdbcTemplate(dataSource);
	}

	public List<Employee> empList() {
		List<Employee> list = jdbcTemp.query("SELECT * FROM EMP_DETAILS", new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();

				emp.setName(rs.getString("ename"));
				emp.setDesignation(rs.getString("designation"));
				emp.setDept(rs.getString("dept"));
				emp.setSalary(rs.getInt("salary"));
				emp.setLocation(rs.getString("location"));

				return emp;
			}

		});

		return list;
	}

}