/**
 * Main Client Program
 */
package com.dgitsystems.codingtest.countwords.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.dgitsystems.codingtest.countwords.service.findnumber.FindNumber;
import com.dgitsystems.codingtest.countwords.service.findnumber.FindNumberStartWithM;
import com.dgitsystems.codingtest.countwords.service.findwords.FindWords;
import com.dgitsystems.codingtest.countwords.service.findwords.FindWordsLongerThanSpecifiedCharacters;

/**
 * @author Rokon
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Welcome!");
		System.out
				.println("This program reads string name list from \"names.txt\" input file in the working directory.");
		System.out.println(
				"note: Please explore \"loging.log\" log file in case of any error placed in the working directory.");
		System.out.println("\n");

		/*
		 * Counts and returns the NUMBER of words (i.e. Strings) that start with
		 * "M" or "m"
		 */
		FindNumber findNumber = new FindNumberStartWithM();

		/*
		 * Returns all the words longer than 5 characters
		 */
		FindWords findWords = new FindWordsLongerThanSpecifiedCharacters();

		/* Input file is kept under the main directory */
		File inputF = new File("names.txt");
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(inputF));
			String sCurrentLine;

			/*
			 * The input file is read once only and is read one line at a time,
			 * complete file is never loaded in RAM, using BufferedReader File
			 * can be of any size, JVM heap memory never overflow for huge file
			 * loading issues, Business methods are called for each line
			 */
			while ((sCurrentLine = br.readLine()) != null) {
				sCurrentLine = sCurrentLine.trim();
				if (!sCurrentLine.equals("")) {
					/*
					 * implementation of businesses to be applied on each line
					 */
					findNumber.find(sCurrentLine);
					findWords.find(sCurrentLine, 5);
				}
			}
			System.out.println(
					"Total NUMBER of words that start with \"M\" or \"m\": " + FindNumberStartWithM.numberCount);

		} catch (IOException e) {
			Logger.getLogger(Main.class.getName()).log(Level.ERROR, null, e);
			System.out.println("Names input file missing...  please check application log for detail.");
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				Logger.getLogger(Main.class.getName()).log(Level.ERROR, null, ex);
			}
		}
	}
}
