package com.tyss.finalAssessment;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MainMethod {

	public static Student AddStudent(List<Student> list) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter\n1.id\n2.name\n3.marks\n4.course");
		int id = scan.nextInt();
		String name = scan.next();
		int marks = scan.nextInt();
		String course = scan.next();
		Student student = new Student(id, name, marks, course);
		for (Student stu : list) {
			if(student.getId()== stu.getId());
		}
		return student;
	}

	public static void main(String[] args) {

		List<Student> list = new LinkedList<Student>();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("\n 1.Add Student \n 2.Edit Student \n 3.Delete Student \n 4.List Of Students \n 5.Get Student \n 6.Sort \n 7.Exit");
		do {

			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				list.add(AddStudent(list));
				break;
//				AddStudent addStudent = new AddStudent();
//				list.add(addStudent.method(list));
//				break;

			case 2:
				System.out.println("Enter the id to be update");
				int oldid = sc.nextInt();
				ListIterator<Student> listIterator = list.listIterator();

				while (listIterator.hasNext()) {
					Student s1 = listIterator.next();
					if (s1.getId() == oldid) {
						System.out.println(" enter the name:");
						String newname = sc.next();
						System.out.println("enter the marks:");
						int newmark = sc.nextInt();
						System.out.println("enter the course:");
						String newcourse = sc.next();
						listIterator.set(new Student(oldid, newname, newmark, newcourse));
						System.out.println("edited.");
					}
				}
				break;
//				EditStudent editStudent = new EditStudent();
//				editStudent.method1(list);
//				break;

			case 3:
				System.out.println("enter the id to delete");
				int deleteid = sc.nextInt();
				Iterator<Student> iterator2 = list.iterator();
				while (iterator2.hasNext()) {
					Student s = iterator2.next();
					if (s.getId() == deleteid) {
						list.remove(s);
					}
				}
				System.out.println("deleted successfully");

				break;

			case 4:
				Iterator<Student> iterator = list.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}

				break;

			case 5:
				System.out.println("enter the id to get");
				int id = sc.nextInt();
				Iterator<Student> iterator3 = list.iterator();
				while (iterator3.hasNext()) {
					Student s = iterator3.next();
					if (id == s.getId()) {
						System.out.println(s);
					}
				}

				break;

			case 6:

				System.out.println("sort the list of students");
				System.out.println("1.ById\n2.ByName\n3.ByMarks");
				int choice6 = sc.nextInt();
				switch (choice6) {
				case 1: {
					SortById sortById = new SortById();
					Collections.sort(list, sortById);
					System.out.println("id sorted");
					break;
				}
				case 2: {
					SortByName sortByName = new SortByName();
					Collections.sort(list, sortByName);
					System.out.println("name sorted");
					break;
				}
				case 3: {
					SortByMarks sortByMarks = new SortByMarks();
					Collections.sort(list, sortByMarks);
					System.out.println("marks sorted");
					break;
				}
				}

				break;

			}

		} while (choice < 7);
		System.out.println("program exits");
	}
}
