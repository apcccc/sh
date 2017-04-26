package edu.bigroi.sh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bigroi.sh.bean.Group;

/**
 * Servlet implementation class GroupSave
 */
@WebServlet("/GroupSave.do")
public class GroupSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GroupSave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("back") != null){
			response.sendRedirect("GroupList.do");
		} else {
			String oldGroupNumber = request.getParameter("oldNumber");
			String groupNumber = request.getParameter("number");
			String avgMark = request.getParameter("avgMark");
			Group group = new Group();
			group.setAvgMark(Double.parseDouble(avgMark));
			group.setNumber(groupNumber);
			
			if (oldGroupNumber == null || oldGroupNumber.equals("")){
				createNewGroup(group);
			} else {
				updateGroup(group, oldGroupNumber);
			}
			request.setAttribute("group", group);
			request.setAttribute("oldGroupNumber", group.getNumber());
			request.getRequestDispatcher("groupForm.jsp").forward(request, response);
			
		}
	}

	private void updateGroup(Group group, String oldGroupNumber) {
		System.out.println("Group is updated");
	}

	private void createNewGroup(Group group) {
		System.out.println("Group is created");
	}

}
