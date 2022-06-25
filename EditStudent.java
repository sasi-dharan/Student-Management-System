//package com.tyss.finalAssessment;
//
//import java.awt.List;
//import java.util.ListIterator;
//import java.util.Scanner;
//
//public class EditStudent {
//public  void method1(java.util.List<Student> list){
//	System.out.println("Enter the id to be update");
//	Scanner sc= new Scanner(System.in);
//	int oldid = sc.nextInt();
//	ListIterator<Student> listIterator = list.listIterator();
//
//	while (listIterator.hasNext()) {
//		Student s1 = listIterator.next();
//		if (s1.getId() == oldid) {
//			System.out.println(" enter the name:");
//			String newname = sc.next();
//			System.out.println("enter the marks:");
//			int newmark = sc.nextInt();
//			System.out.println("enter the course:");
//			String newcourse = sc.next();
//			listIterator.set(new Student(oldid, newname, newmark, newcourse));
//			System.out.println("edited.");
//		}
//	}
//	
//}
//}
