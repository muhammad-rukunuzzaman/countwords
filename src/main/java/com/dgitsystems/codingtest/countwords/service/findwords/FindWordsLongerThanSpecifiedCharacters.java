/**
 * Implementation of 
 * Req 2.	Returns all the words longer than Specified characters
 * 
 */
package com.dgitsystems.codingtest.countwords.service.findwords;

import org.apache.log4j.Logger;

/**
 * @author Rokon
 *
 */
public class FindWordsLongerThanSpecifiedCharacters implements FindWords {

	/* log4j logging */
	static Logger log = Logger.getLogger(FindWordsLongerThanSpecifiedCharacters.class);

	/*
	 * returns a list of words longer than specified number of characters as
	 * received in the Argument
	 */
	@Override
	public void find(String sCurrentLine, int longerThan) {

		if (sCurrentLine.length() > longerThan) {
			System.out.println("Words longer than " + longerThan + " characters: " + sCurrentLine);
		}
	}
}
