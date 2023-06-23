package MarksheetServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Marksheet.Vo.RagistrationVo;
import MarksheetService.RagistrationService;


//import com.vo.Registration;

public class RagistrationCtl extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = request.getPaparameter("operation");
		
		try {
			String firstName = request.getPaparameter("firstname");
			String lastName = request.getPaparameter("lastname");
			String fatherName = request.getPaparameter("fathername");
			String emailid = request.getPaparameter("emailid");
			String cAdd = request.getPaparameter("cAdd");
			String pAdd = request.getPaparameter("pAdd");
			String dob = request.getPaparameter("dob");
			String city = request.getPaparameter("city");
			String phoneNo = request.getPaparameter("phoneNo");
			String gender = request.getPaparameter("gender");
			String catagary = request.getPaparameter("catagary");
			String course = request.getPaparameter("course");
			String state = request.getPaparameter("state");			
			RagistrationVo vo = new RagistrationVo();
			vo.setFirstName(firstName);
			vo.setLastName(lastName);
			vo.setFatherName(fatherName);
			vo.setEmailId(emailid);
			vo.setCirruntAdd(cAdd);
			vo.setParmanentAdd(pAdd);
			vo.setPhoneNo(phoneNo);
			vo.setDob(dob);
			vo.setCity(city);
			vo.setState(state);
			vo.setGender(gender);
			vo.setCatagary(catagary);
			vo.setCourse(course);
RagistrationService service=new RagistrationService();
if("submit".equalsIgnoreCase(op)){
service.submit(vo);
RequestDispatcher rd=request.getRequestDispatcher("/Layout.jsp?body=Login.jsp");
rd.forward(request, response);
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
