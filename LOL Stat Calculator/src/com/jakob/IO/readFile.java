package com.jakob.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class readFile {
	
	@SuppressWarnings("resource")
	public void getChampInfo(String fileName) {
		try {
			File myFile = new File(fileName);
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader =  new BufferedReader(fileReader);
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
