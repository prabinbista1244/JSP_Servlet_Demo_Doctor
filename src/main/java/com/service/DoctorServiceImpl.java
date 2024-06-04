package com.service;

import java.sql.SQLException;
import java.sql.Statement;

import com.db.Database;
import com.model.Doctor;

public class DoctorServiceImpl implements DoctorService{

	@Override
	public void addDoctorDetail(Doctor d) {
		String sql = "insert into Doctor(Name,Email,Specialization,Address,Phone,Gender,Note) values('"+d.getName()+"','"+d.getEmail()+"','"+d.getSpecialization()+"','"+d.getAddress()+"','"+d.getPhone()+"','"+d.getGender()+"','"+d.getNote()+"')";
		
		try {
			Statement stm = Database.getConnection().createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		}

}
