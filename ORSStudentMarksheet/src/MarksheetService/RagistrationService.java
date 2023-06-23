package MarksheetService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Marksheet.Vo.RagistrationVo;







public class RagistrationService {

	Connection conn;
	PreparedStatement ps;

	public RagistrationService() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/table1",
				"root", "root");
	}

	public void submit(RagistrationVo vo) throws Exception {
		ps = conn
				.prepareStatement("insert into ragistration values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
ps.setString(1, vo.getFirstName());
ps.setString(2, vo.getLastName());
ps.setString(3, vo.getFatherName());
ps.setString(4, vo.getEmailId());
ps.setString(5, vo.getCirruntAdd());
ps.setString(6, vo.getParmanentAdd());
ps.setString(7, vo.getDob());
ps.setString(9, vo.getCity());
ps.setString(10, vo.getPhoneNo());
ps.setString(11, vo.getGender());
ps.setString(12, vo.getCatagary());
ps.setString(13, vo.getCourse());
ps.setString(8, vo.getState());
ps.executeUpdate();
	}
}

