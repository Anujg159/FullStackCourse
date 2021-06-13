package project1;

import java.io.File;
import java.util.Arrays;

public class MyFiles {

	public void AddFile(String str) {
		try {
			File myfile = new File(str);
			if(myfile.createNewFile())
				System.out.println("File added successfully.");
			else
				System.out.println("File already exists.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RemFile(String str) {
		try {
			File myfile = new File(str);
			if(!FindFile(str))
				System.out.println("File "+str+" not found.");
			else if(myfile.delete())
				System.out.println("File removed successfully.");
			else
				System.out.println("File removal failed.");
		} catch (NullPointerException e) {
			System.out.println("Folder is empty.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void DisplayAll() {
		
		File myfile = new File(".");
		File[] FileList = myfile.listFiles();
		try {
			Arrays.sort(FileList);
		}catch(NullPointerException e) {
				System.out.println("Folder is empty.");
		}catch (Exception e) {
			e.printStackTrace();
		}
		for(File fl:FileList) {
			 if (fl.isFile()) {
				    System.out.println("File \t\t:\t" + fl.getName());
				  } else if (fl.isDirectory()) {
				    System.out.println("Directory \t:\t" + fl.getName());
				  }
		}
		
	}

	public Boolean FindFile(String str) {
		try {
			Boolean bool=false;
			File myfile=new File(".");
			String[] mylist=myfile.list();
			for (String name : mylist) 
				if (name.equalsIgnoreCase(str))
					bool=true;
			return bool;
			
		} catch(NullPointerException e) {
			System.out.println("Folder is empty.");
		}
		catch (Exception e) {			
			e.printStackTrace();
		}
		return null; 
	}
}
