package MAIN;

import StudClass.students;

import CREATE.CreateClass;

import READ.ReadClass;

import UPDATE.UpdateClass;

import DELETE.DeleteClass;

public class MainFunctioningClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lets start");
		students stud= new students();
//		here you can manually set the attribute as per requirements
		stud.setRollNo(1);
		stud.setName("shubh");
		stud.setMark(100);
		
//		CREATE
		MainCreate(stud);
//		
//		READ
		MainRead(1);
		
		
//		UPDATE   at position
		MainUpdate(1);
		
//		reading after update 
		MainRead(1);
		
		
//		DELETE
		MainDelete(1);
		
		
//		reading after delete
		MainRead(1);
		

	}
	
	public static void MainCreate(students stud) {
		 CreateClass.CreateMethod(stud);
		
	}
	public static void MainRead(int n) {
		students st=ReadClass.ReadMethod(n);
		System.out.println(st);
			
		}
	public static void MainUpdate(int n) {
		UpdateClass.UpdateMethod(n);
		
	}
	public static void MainDelete(int n) {
		DeleteClass.DeletMethod(n);
		
	}
//	

}
