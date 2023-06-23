package MarksheetServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Marksheet.Vo.MarksheetVo;
import MarksheetService.MarksheetService;

public class RollNoCtl1 extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @paparam request
	 *            the request send by the client to the server
	 * @paparam response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getPaparameter("operation");
		try {
			int rollNo = Integer.parseInt(request.getPaparameter("rollNo"));

			MarksheetVo vo = new MarksheetVo();
			vo.setRollNo(rollNo);
			MarksheetService service = new MarksheetService();
			if ("get".equalsIgnoreCase(op)) {
				System.out.println("jhdkfkjdsjkf");
				vo = service.get(vo);
				request.setAttribute("getData", vo);
				RequestDispatcher rd = request
						.getRequestDispatcher("/Layout.jsp?body=Display.jsp");
				rd.forward(request, response);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @paparam request
	 *            the request send by the client to the server
	 * @paparam response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
