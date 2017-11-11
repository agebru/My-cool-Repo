package com.exceptions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {

	public static void main(String[] args)throws IOException ,IlegalAgeException{
		
		System.out.println("======  Exception handling tutorials ===\n");
		
		//reading file
		try {printFileJava7();} catch (IOException ex) {ex.printStackTrace();	}
		
		
		//reading person age
		
		System.out.println("The age is:"+getPersonAge());
		
		
		// display keyboard string data
	System.out.println("Enter any String: ");
		displayKeyboadData();
		
		

	}
	
	
	private static void displayKeyboadData() throws IlegalAgeException{
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			
		String input=br.readLine();
		System.out.println("you entered the String: "+input);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	public static int getPersonAge() throws IOException,IlegalAgeException{
			
		System.out.print("\n Enter valid age between [0,100]:");
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		if(Integer.parseInt(bf.readLine())<0){
			throw new IlegalAgeException("Age can't be Negative ");
		}
		else if(Integer.parseInt(bf.readLine())>100)
           throw new IlegalAgeException("Age can't be greater than 100 ");
           	
		      int age=Integer.parseInt(bf.readLine());
          
				
		return age;
		
	}
	
	
	
	
	
	

	private static void printFileJava7() throws IOException {
		// for giving inputs from keyboard
		// try(BufferedReader br=new BufferedReader(new
		// InputStreamReader(System.in))){

		try (FileInputStream input = new FileInputStream("file1.txt")) {
			int data = input.read();
			System.out.println("Data:" + data);// data is stored in bites
			while (data != -1) {
				System.out.print((char) data);
				data = input.read();
			}
		}
	}

}
