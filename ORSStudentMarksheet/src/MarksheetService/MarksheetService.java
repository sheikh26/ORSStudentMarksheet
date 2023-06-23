package MarksheetService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import Marksheet.Vo.MarksheetVo;




//	import com.mysql.jdbc.ResultSet;

public class MarksheetService {
	MarksheetVo vo=new MarksheetVo();

	public void save(MarksheetVo vo) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/table1", "root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, vo.getRollNo());
		preparedStatement.setString(2, vo.getName());
		preparedStatement.setInt(3, vo.getPhysics());
		preparedStatement.setInt(4, vo.getMaths());
		preparedStatement.setInt(5, vo.getChemistry());
		preparedStatement.setInt(6, vo.getHindi());
		preparedStatement.setInt(7, vo.getEnglish());
		preparedStatement.executeUpdate();

	}

	public void delete(MarksheetVo vo) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/table1", "root", "root");
		PreparedStatement ps = connection
				.prepareStatement("delete from marksheet where RollNo=?");
		ps.setInt(1, vo.getRollNo());
		ps.executeUpdate();
	}

	public void update(MarksheetVo vo) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/table1", "root", "root");

		PreparedStatement preparedStatement = connection
				.prepareStatement("update marksheet set name=?,physics=?,maths=?,chemistry=?, hindi=?,english=? where rollNo=?");
		preparedStatement.setString(1, vo.getName());
		preparedStatement.setInt(2, vo.getPhysics());
		preparedStatement.setInt(3, vo.getMaths());
		preparedStatement.setInt(4, vo.getChemistry());
		preparedStatement.setInt(5, vo.getHindi());
		preparedStatement.setInt(6, vo.getEnglish());
		preparedStatement.setInt(7, vo.getRollNo());
		preparedStatement.executeUpdate();

	}

	public MarksheetVo get(MarksheetVo vo) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/table1", "root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("select * from marksheet where rollNo=?");
		preparedStatement.setInt(1, vo.getRollNo());
		java.sql.ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			vo.setRollNo(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setPhysics(rs.getInt(3));
			vo.setMaths(rs.getInt(4));
			vo.setChemistry(rs.getInt(5));
			vo.setHindi(rs.getInt(6));
			vo.setEnglish(rs.getInt(7));

		}

		return vo;

	}

	public ArrayList getList() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/table1", "root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("select * from Marksheet");

		java.sql.ResultSet rs = preparedStatement.executeQuery();

		ArrayList list = new ArrayList();

		while (rs.next()) {
			MarksheetVo vo = new MarksheetVo();
			vo.setRollNo(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setMaths(rs.getInt(3));
			vo.setPhysics(rs.getInt(4));
			vo.setChemistry(rs.getInt(5));
			vo.setHindi(rs.getInt(6));
			vo.setEnglish(rs.getInt(7));

			list.add(vo);
		}

		return list;

	}

	public ArrayList search1(MarksheetVo vo) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/table1", "root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("select * from marksheet WHERE name LIKE ?");

		preparedStatement.setString(1, "%" + vo.getName() + "%");

		java.sql.ResultSet rs = preparedStatement.executeQuery();

		ArrayList list = new ArrayList();

		while (rs.next()) {
			vo = new MarksheetVo();
			vo.setRollNo(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setMaths(rs.getInt(3));
			vo.setPhysics(rs.getInt(4));
			vo.setChemistry(rs.getInt(5));
			vo.setHindi(rs.getInt(6));
			vo.setEnglish(rs.getInt(7));

			list.add(vo);
		}

		return list;

	}

	public ArrayList getListByPage(int first, int max) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/table1", "root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("select * from marksheet limit ?, ?");

		preparedStatement.setInt(1, first);
		preparedStatement.setInt(2, max);

		java.sql.ResultSet rs = preparedStatement.executeQuery();

		ArrayList list = new ArrayList();

		while (rs.next()) {
			MarksheetVo vo = new MarksheetVo();
			vo.setRollNo(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setMaths(rs.getInt(3));
			vo.setPhysics(rs.getInt(4));
			vo.setChemistry(rs.getInt(5));
			vo.setHindi(rs.getInt(6));
			vo.setEnglish(rs.getInt(7));

			list.add(vo);
		}

		return list;
	}
}
