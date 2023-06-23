package MarksheetService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Marksheet.Vo.LoginVo;



public class LoginService {

	public boolean login(LoginVo vo) throws Exception {
		boolean b = false;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/table1", "root", "root");
		PreparedStatement preparedStatement = conn
				.prepareStatement("select * from login  where  userId=? and password =?");
		preparedStatement.setString(1, vo.getUserId());
		preparedStatement.setString(2, vo.getPassword());
		ResultSet rs = preparedStatement.executeQuery();
		if (rs.next()) {
			b = true;
		}
		return b;

	}

}
