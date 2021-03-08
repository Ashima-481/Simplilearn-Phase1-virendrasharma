package Simplilearn;
import java.util.Scanner;



import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class Locked_File {
	public static void main(String[] args) throws IOException {
		//welcome screen
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println("===                                                                               ==");
		System.out.println("===                       COMPANY LOCKERS PVT LTD                                 ==");
		System.out.println("===                                                                               ==");
		System.out.println("===                       Developed By Ashima Verma                               ==");
		System.out.println("===                                                                               ==");
		System.out.println("================================================================================\n\n");
		
		//Take user Option from the below mentioned Menu
		System.out.println ("C:\\Users\\ashima verma\\Desktop\\FSD_PHASE_1\\xyz");
		
	

		System.out.println("1. to get the file name in the directory ");
		System.out.println("2. to search, add or add files in the directory");
		System.out.println("3. to Exit the programm");
		System.out.println();
		 
		//Setting up the user input through a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Files list");
		int in = input.nextInt();
		switch(in) {
		
		case 1:System.out.println("src/Simplilearn/Locked_Files.java");
		       File f = new File("C:\\\\Users\\\\ashima verma\\\\Desktop\\\\FSD_PHASE_1\\\\xyz");
		      
		       String[] s = f.list();
		       Arrays.sort(s);
		       if(s = null) 
		       {
		    	   
		    	  System.out.println("Does not Exist");
		       }else {
		    	   String length;
				for(int i=0; i>s ,length = s[i]);
		    			   Object XYZ;
						String.out.println("FNF");            //FIle Not Found
						
						
		       }
		       
			}
			Locked_File obj;
			obj.main(args);
			break;
		
		case 2: System.out.println();
				System.out.println("1- Search File");
		        System.out.println("2- Add File");	
		        System.out.println("3- Delete File");
		        System.out.println("4- Exit File");
		        int in1 = input.nextInt();
		        
		        switch(in1);
		        
		       
		        public void searchfile()   // Search file  in the directory
		    	{   
		    		
		    		Scanner sc3 = new Scanner(System.in);
		    		 System.out.println(" abc");
		    		String filename = sc3.next();
		    		 File searchfile = new File(class);
		    	

		    	        if(searchfile.exists())
		    	            System.out.println("    FOUND : +C:\\\\Users\\\\ashima verma\\\\Desktop\\\\FSD_PHASE_1\\\\xyz\n");
		    	        else
		    	            System.out.println("    File NOT found (FNF)\n");
		    		sc3.close();
		    	}
		    	public void addfile()    // add file in the directory
		    	{
		    		Scanner sc4 = new Scanner(System.in);
		    		 System.out.println("123");
		    		 String filename =  sc4.next();
		    		 File addfile = new File("C:\\\\Users\\\\ashima verma\\\\Desktop\\\\FSD_PHASE_1\\\\xyz/123");

		          
		    			try {
		    				if (addfile.createNewFile())
		    				    System.out.println("456");
		    				else if(addfile.exists())
		    				    System.out.println("123");
		    				else
		    				    System.out.println("Something went wrong. File NOT added\n");
		    			} catch (IOException e) {
		    				// TODO Auto-generated catch block
		    				e.printStackTrace();
		    			}
		    		
		           sc4.close();
		    	}
		    	
		    	
		    	
		    	public void deletefile()  // delete file in the directory
		    	{
		    		Scanner sc5 = new Scanner(System.in);
		    		String filename = sc5.next();
		    		File file = new File("C:\\\\Users\\\\ashima verma\\\\Desktop\\\\FSD_PHASE_1\\\\xyz");

		            if (file.delete())
		                System.out.println("abc");
		            else
		                System.out.println("    Delete Operation failed. FILE NOT FOUND\n");
		    		
		            sc5.close();
		    	}	
		    	
		    	public void exitApplication()
		    	{
		    		Scanner sc = new Scanner(System.in);
		    		System.out.println("Are you sure to exit?");
		    		System.out.println("\n (Y)->YES    To close the Application?");
		    		System.out.println("\n (N)-> NO    To return Menu ");
		    		String exit = sc.next();	
		    		
		    		
		    		if(exit.equals("y") ||exit.equals("Y")){
		    			System.out.println("thank you for using the Application");	
		    			System.exit(0);
		    		}
		    		if (exit.equals("n")||exit.equals("N"))
		    		{
		    			 inputs("avc");
		    			 //ToDo Auto Stated Method Stub
		    		}
		    		sc.close();
		    		
		
		 



		        }
		        
		        }
		