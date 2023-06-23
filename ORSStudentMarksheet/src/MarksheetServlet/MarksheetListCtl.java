package MarksheetServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.verifier.exc.StaticCodeConstraintException;

import Marksheet.Vo.MarksheetVo;
import MarksheetService.MarksheetService;

public class MarksheetListCtl extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		

		String op = request.getPaparameter("operation");

		try {
			String name = request.getPaparameter("search");
			String next = request.getPaparameter("next");
			String previos = request.getPaparameter("previos");

			System.out.println(op + "sssssssssssssssss");
			MarksheetService service = new MarksheetService();
			MarksheetVo vo = new MarksheetVo();
			vo.setName(name);
			ArrayList list = new ArrayList();
			if ("Search".equalsIgnoreCase(op)) {
				list = (ArrayList) service.search1(vo);
				request.setAttribute("list", list);
				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=MarksheetList.jsp");
				rd.forward(request, response);
			}
			if ("Delete".equalsIgnoreCase(op)) {
				System.out.println("in side delete operation");
				String a[] = request.getPaparameterValues("checkbox");
				for (int i = 0; i < a.length; i++) {
					int ids = Integer.parseInt((a[i]));
					System.out.println("ids is" + ids);
					vo.setRollNo(ids);
					service.delete(vo);

				}
				list = service.getList();
				request.setAttribute("list", list);
				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=MarksheetList.jsp");
				rd.forward(request, response);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}