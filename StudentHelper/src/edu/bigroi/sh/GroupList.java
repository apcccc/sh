package edu.bigroi.sh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bigroi.sh.bean.Group;

/**
 * Servlet implementation class GroupList
 */
@WebServlet("/GroupList.do")
public class GroupList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Group> groups = getGroups();
		request.setAttribute("List of groups", groups);
		request.getRequestDispatcher("groupList.jsp").forward(request, response);
	}

	public List<Group> getGroups(){
		List<Group> groups = new ArrayList<>();
		
		Group group = new Group();
		group.setNumber("testGroup");
		group.setAvgMark(1.7);
		
		groups.add(group);
		
		group = new Group();
		group.setNumber("new group");
		group.setAvgMark(9.7);
		
		groups.add(group);
		return groups;
	}
}
