package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.*;

import com.model.Doctor;

/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/DoctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Doctor_jsp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getting data from the jsp file
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String specialization = request.getParameter("doctors");
		String address = request.getParameter("address");
		Double phone = Double.parseDouble(request.getParameter("phone"));
		String gender = request.getParameter("gender");
		String note = request.getParameter("note");
		
		//sending data to the database
		Doctor d = new Doctor();
		d.setName(name);
		d.setEmail(email);
		d.setSpecialization(specialization);
		d.setAddress(address);
		d.setPhone(phone);
		d.setGender(gender);
		d.setNote(note);
		
		DoctorService service = new DoctorServiceImpl();
		service.addDoctorDetail(d);
		request.getRequestDispatcher("DoctorResult.jsp").forward(request, response);
	}

}
