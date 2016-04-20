/**
 * For simplicity we are reading input Strings from a file
 * In case of production implementation data may come from a database and this class may work in DAO layer
 * Maintains logh4j logs
 */
package com.dgitsystems.codingtest.countwords.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @author Rokon
 *
 */
public class DataRepository {

	/*
	 * This method reads the name strings form a text file "names.txt" in the current directory
	 * Returns list of name Strings 
	 */
	public List<String> getInputStrList() {

		List<String> inputStrList = new ArrayList<String>();
		File inputF = new File("names.txt");
		BufferedReader br = null;

		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(inputF));

			while ((sCurrentLine = br.readLine()) != null) {
				sCurrentLine = sCurrentLine.trim();
				inputStrList.add(sCurrentLine);
			}

		} catch (IOException e) {
			Logger.getLogger(DataRepository.class.getName()).log(Level.ERROR, null, e);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				Logger.getLogger(DataRepository.class.getName()).log(Level.ERROR, null, ex);
			}
		}
		return inputStrList;
	}
}
