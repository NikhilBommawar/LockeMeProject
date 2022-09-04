package myProject;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class LockedMe {

	// Main Menu
	
	
	
	// Option 1 Returning File List in Ascending order
	
	void FileList(){
		try{
	    Scanner S=new Scanner(System.in);
        System.out.println("Enter the path where file list has to be traced :");
        String filePath=S.nextLine();
		File file=new File(filePath);
		String[] fileList=file.list();
		Arrays.sort(fileList);
		System.out.println("The List of Files (in Ascending Order) in the specified Directory path is ");
		for(String name:fileList){
			System.out.print(name+" ");
		}
		}catch(Exception e){
			System.out.println("Error: Enter the correct path");
			e.printStackTrace();
		}
	}  
	
	// Option 2 Add a File
	void AddFile(){
		try{

			 Scanner S=new Scanner(System.in);
		        System.out.println("Enter the path where file list has to be traced :");
		        String filePath=S.nextLine();
				File file=new File(filePath);
		if(file.createNewFile()){
		System.out.println("The new file "+file.getName()+" created");	
		}
		else{
			System.out.println("File already exists");
			System.out.println("OR Specify a Correct Path");
		}
       }
		catch(IOException e){
			System.out.println("Please specify a correct path");
			e.printStackTrace();
		}
		}
		
	// Option 3 Delete a File
	void DeleteFile(){
	try{
		 Scanner S=new Scanner(System.in);
	        System.out.println("Enter the path where file list has to be traced :");
	        String filePath=S.nextLine();
			File file=new File(filePath);
		if(file.delete()){
			System.out.println("Successfully Deleted "+file.getName());
		}
		else{
			System.out.println("Delete Failed ");
			System.out.println("Please enter the proper name");
		}
	}catch(Exception e){
		System.out.println("Eror: Enter correct path");
		e.printStackTrace();
		
	}
		
	}
	
	// Option 4 Search for a File
	void SearchFile(){
		 Scanner S=new Scanner(System.in);
		 try{
	        System.out.println("Enter the path where file  has to be Searched :");
	        String filePath=S.nextLine();
			File file=new File(filePath);
		 String[] fileList=file.list();
		System.out.println("Enter the file name to search ");
		String fileSearch=S.nextLine();
		int flag=0;
			
		for(int i=0;i<fileList.length;i++){
			
			if(fileList[i].equals(fileSearch)){
				System.out.println(fileSearch+" is found at "+(i+1)+" position ");
			   flag=1;
			}
		}
		if(flag!=1){
			System.out.println(fileSearch+" is not found");
			System.out.println("OR the path is not proper.Please try again.");
		}
	}
		 
		 catch(NullPointerException e){
			 System.out.println("Enter correct path");
			 e.printStackTrace();
		 }
	}
 
	
	// Option 6 close the application
	void CloseApp(){
		System.out.println("Thank you for using LockedMe Application");
		System.out.println("Application Closed");
		System.exit(0);
	}
	// MAin function Program starts here
	
	  public static void main(String[] args){
		  LockedMe obj=new LockedMe();
			int option;
		  System.out.println("-----Welcome to the LockedMe Application-------");
			System.out.println("          Designed by Er. Nikhil Bommawar ");
		  
			do{
				System.out.println("------------------------*************---------------------------------");
				System.out.println("\n This application presents the following options :");
			    System.out.println("1. Returns the current files list in ascending order");
			    System.out.println("2 -> Add a File \n3 -> Delete a File \n4 -> Search a File \n5 -> Go back to the main menu ");
			    System.out.println("6. Close the Application");
			    Scanner S=new Scanner(System.in);
			    System.out.println("Please choose your Option:- ");
			    option=S.nextInt();
			    
			    switch(option){
			    case 1:
			    	obj.FileList();
			    	break;
			    
			    case 2:
			    	obj.AddFile();
			    	break;
			    	
			    case 3:
			    	obj.DeleteFile();
			    	break;
			    
			    case 4:
			    	obj.SearchFile();
			    	break;
			    	
			    case 5:
			    	break;
			    	
			    case 6:
			    	obj.CloseApp();
			    	break;

			    default:
			    	System.out.println("Please choose the valid option and try again.");
			    }
			       

			}
			while(option>0);	
				   
	  }

}