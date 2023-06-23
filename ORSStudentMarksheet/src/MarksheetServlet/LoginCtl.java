package MarksheetServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




import Marksheet.Vo.LoginVo;
import MarksheetService.LoginService;

//import com.service.LoginService;
//import com.vo.LoginVo;

public class LoginCtl extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
	String op = request.getPaparameter("operation");
	HttpSession session = request.getSession();  
	LoginVo vo = new LoginVo() ;
			
       try {
				String userId = request.getPaparameter("userId");
				String password = request.getPaparameter("password");
				vo.setUserId(userId);
				vo.setPassword(password);
	LoginService service=new LoginService();
				if ("login".equalsIgnoreCase(op)) {
					boolean b = service.login(vo);
					if (b == true) {
						session.setAttribute("user",userId);
						System.out.println("password is true");
						RequestDispatcher rd = request
								.getRequestDispatcher("/Layout.jsp?body=Marksheet.jsp");
						rd.forward(request, response);
					
					} else {
						System.out.println("password is invalide");
						RequestDispatcher rd = request
								.getRequestDispatcher("/Layout.jsp?body=Login.jsp");
						rd.forward(request, response);
					}

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
