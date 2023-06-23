package MarksheetServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Marksheet.Vo.MarksheetVo;
import MarksheetService.MarksheetService;

public class MarksheetCtl extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getPaparameter("operation");
		HttpSession session = request.getSession();
		try {

			int rollno = 0;
			String name = null;
			int physics = 0;
			int maths = 0;
			int chemistry = 0;
			int hindi = 0;
			int english = 0;
			try {
				rollno = Integer.parseInt(request.getPaparameter("rollNo"));
				name = request.getPaparameter("name");
				physics = Integer.parseInt(request.getPaparameter("physics"));
				maths = Integer.parseInt(request.getPaparameter("maths"));
				chemistry = Integer.parseInt(request.getPaparameter("chemistry"));
				hindi = Integer.parseInt(request.getPaparameter("hindi"));
				english = Integer.parseInt(request.getPaparameter("english"));
			} catch (RuntimeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			MarksheetVo vo = new MarksheetVo();

			vo.setRollNo(rollno);
			vo.setName(name);
			vo.setPhysics(physics);
			vo.setMaths(maths);
			vo.setChemistry(chemistry);
			vo.setHindi(hindi);
			vo.setEnglish(english);

			MarksheetService service = new MarksheetService();
			System.out.println("before add");
			if ("save".equalsIgnoreCase(op)) {
				//session.setAttribute("user", vo);
				service.save(vo);
				RequestDispatcher rd = request
						.getRequestDispatcher("/Layout.jsp?body=Marksheet.jsp");
				System.out.println("f,lffffffffff");
				rd.forward(request, response);
			}
			if ("Delete".equalsIgnoreCase(op)) {
				service.delete(vo);
				System.out.println("delete cahl gaya bhai");
				RequestDispatcher rd = request
						.getRequestDispatcher("/Layout.jsp?body=Marksheet.jsp");
				rd.forward(request, response);

			}
			if ("Update".equalsIgnoreCase(op)) {
				service.update(vo);
				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=Marksheet.jsp");
				rd.forward(request, response);

			}
			if ("get".equalsIgnoreCase(op)) {

				// vo.getRollNo();
				vo = service.get(vo);
				System.out.println(vo);

				request.setAttribute("get", vo);
				RequestDispatcher rd = request
						.getRequestDispatcher("Layout.jsp?body=Marksheet.jsp");
				rd.forward(request, response);

			}

			/*
			 * if ("getList".equalsIgnoreCase(op)) { vo.getId(); vo =
			 * service.get(vo); request.setAttribute("get", vo);
			 * RequestDispatcher rd = request
			 * .getRequestDispatcher("/Marksheet.jsp"); rd.forward(request,
			 * response); }
			 */
			if ("List".equalsIgnoreCase(op)) {
				System.out.println("In List operation!!");
				ArrayList arrayList = service.getList();
				request.setAttribute("list", arrayList);
				RequestDispatcher rd = request
						.getRequestDispatcher("/Layout.jsp?body=MarksheetList.jsp");
				rd.forward(request, response);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
