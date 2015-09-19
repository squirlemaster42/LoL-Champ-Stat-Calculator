package com.jakob.getInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GetRuneStats {

	@SuppressWarnings("resource")
	public void getRuneInfo(String fileName) {
		try {
			File myFile = new File(fileName);
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader =  new BufferedReader(fileReader);
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				//Add case to look for info
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
