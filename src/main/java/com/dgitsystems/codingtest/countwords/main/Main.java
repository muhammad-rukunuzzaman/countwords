/**
 * Main Client Program
 */
package com.dgitsystems.codingtest.countwords.main;

import java.util.List;

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
		System.out.println("This program reads string name list from \"names.txt\" input file in the working directory.");
		System.out.println("note: Please explore \"loging.log\" log file in case of any error placed in the working directory.");
		System.out.println("\n");
		
		/*Counts and returns the NUMBER of words (i.e. Strings) that start with "M" or "m"*/
		FindNumber findNumber= new FindNumberStartWithM();
		int count= findNumber.find();
		System.out.println("Total NUMBER of words that start with \"M\" or \"m\": " + count);
		
		/*Returns all the words longer than 5 characters*/
		FindWords findWords = new FindWordsLongerThanSpecifiedCharacters();
		List<String>  greaterThanList= findWords.find(5);
		System.out.println("Words longer than 5 characters: " + greaterThanList);
	}

}
