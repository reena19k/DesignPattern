package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

import com.aurionpro.StudentManager.Student;
import com.aurionpro.StudentManager.StudentDao;

public class Start {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to Student Manageemnt App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to Delete student ");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to exit App");
			int c = Integer.parseInt(br.readLine());
			if (c == 1) {
				// add
				System.out.println("Enter user name");
				String name = br.readLine();

				System.out.println("Enter user city");
				String scity = br.readLine();

				Student st = new Student(name, scity);
				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer) {
					System.out.println("Student is added succesfully...");

				} else {
					System.out.println("somethiing went wrong");
				}
				System.out.println(st);
			} else if (c == 2) {
				// delete
				System.out.println("Enter student id to delete");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);
				if (f) {
					System.out.println("deleted...");

				} else {
					System.out.println("something went wrong");
				}
			} else if (c == 3) {
				// display
				StudentDao.showAllStudents();
			} else if (c == 4) {
				// exit
				break;
			} else {
				// wrong operation
			}
		}

	}
}
