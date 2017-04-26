package edu.bigroi.sh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bigroi.sh.bean.Group;

/**
 * Servlet implementation class GroupModify
 */
@WebServlet("/GroupModify.do")
public class GroupModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Group group;
		if (id == null || "".equals(id)){
			group = new Group(); //if we want to create new group.
		}else{
			group = getGroup(id); // if we want to modify existing group
		}
		
		request.setAttribute("group", group);
		request.setAttribute("oldGroupNumber", id);
		request.getRequestDispatcher("groupForm.jsp").forward(request, response);
		
	}

	private Group getGroup(String id) {
		Group group = new Group();
		group.setAvgMark(1.9);
		group.setNumber(id);
		return group;
	}

}
