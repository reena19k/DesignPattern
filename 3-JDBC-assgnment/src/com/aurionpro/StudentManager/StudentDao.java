package com.aurionpro.StudentManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "insert into students(Student_name,S_city) values(?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);		//as it is dyanmic query we took user input
			pstmt.setString(1, st.getSname());
			pstmt.setString(2, st.getCity());
			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "delete from students where student_id=?";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setLong(1, userId);
			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudents() {
		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "select * from students;";
			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(q);

			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);

				System.out.println("ID " + id);
				System.out.println("Name " + name);
				System.out.println("City " + city);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
