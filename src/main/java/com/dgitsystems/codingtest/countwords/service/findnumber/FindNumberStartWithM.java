/**
 * Implementation of 
 * Req 1. Counts and returns the NUMBER of words (i.e. Strings) that start with "M" or "m"
 * 
 */
package com.dgitsystems.codingtest.countwords.service.findnumber;

import org.apache.log4j.Logger;

/**
 * @author Rokon
 *
 */
public class FindNumberStartWithM implements FindNumber {

	/* log4j logging */
	static Logger log = Logger.getLogger(FindNumberStartWithM.class);
	
	/*static counter to be incremented in matching cases*/
	public static int numberCount = 0;

	/* finds the number of words starts with M or m */
	@Override
	public void find(String sCurrentLine) {
		if (sCurrentLine.substring(0, 1).equalsIgnoreCase("m")) {
			numberCount += 1;
		}
	}
}
