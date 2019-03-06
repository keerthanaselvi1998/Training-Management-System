package org.tms.controller;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.tms.dao.Searchtrainee;
import org.tms.dao.Searchtraineeimpl;
import org.tms.model.Traineecls;


@WebServlet("/TrainerServlet")
public class TrainerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Searchtrainee st=new Searchtraineeimpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");
		//PrintWriter pw=response.getWriter();
		int userid=Integer.parseInt(request.getParameter("userId"));
		 Traineecls obj = st.search(userid);
		request.setAttribute("userobj", obj);
		
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
	
		
	}

}
